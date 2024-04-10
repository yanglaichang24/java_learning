## 3.1 语法结构

    package ${包路径}

    import ${引入对象}

    function  // Optional

    query  // Optional

    declare   // Optional

    global   // Optional

    rule "rule name"
     // Attributes 
    when
    // Conditions
    then
    // Actions
    end

    rule "rule2 name"


一个DRL文件可以包含1个或多个Rules, queries和functions。在每个包中Rule的名称是唯一的。如果一个包中存放了相同的规则名称的规则，则在编译的时候发生编译错误。

##### 3.1.1 DRL中的package段

一个package是一个文件夹里面放了多个DRL文件，决策表和其他类型资产。package段只能放在DRL文件的第一行。一个单一的规则可以放在多个包中，但是一个包中不能包含同名规则

##### 3.1.2 DRL中的import段

import段类似于Java的import。它可以引入ClassPath中任何的对象，只要你想在DRL文件中应用就可以通过import将其引入到你的代码中。一个DRL文件中额可以包含多个imports。每个import通过行分割。DRL默认会自动import一些java对象，这些对象来自JDK中的java.lang.*。

##### 3.3.3 DRL中的function段

function段存放这运行当前DRL所需要用到的本地函数，本地函数一般用于Then段中一些公用的处理。一般是用作提高代码的复用度 
例子：

    function String hello(String applicantName) {
        return "Hello " + applicantName + "!";
    }

    rule "Using a function"
     when
        // Empty
     then
       System.out.println( hello( "James" ) );
    end

##### 3.3.4 DRL中的query段

Query段主要是用来定义一系列查询条件在工作内存中查询DRL文件中被插入符合Query条件的参数。每个query都有一个名称可以通过ksession.getQueryResults("${queryName}"), 它可以返回一个结果集（QueryResults）
它仅包含规则文件中LHS部分，不用指定"when"和"then"部分并以end结束。具体语法结构如下：

    query 查询的名称（可选参数）
     LHS
    end

例子：

    // 在DRL中定义query段
    query "people under the age of 21"
       $person : Person( age < 21 )
    end

    // 在Java代码中调用
    QueryResults results = ksession.getQueryResults( "people under the age of 21" );
      System.out.println( "we have " + results.size() + " people under the age of 21" );

      System.out.println( "These people are under the age of 21:" );

    for ( QueryResultsRow row : results ) {
        Person person = ( Person ) row.get( "person" );
        System.out.println( person.getName() + "\n" );
    }

##### 3.3.5 DRL中的global段

Global段主要是定义一些典型的公用的变量，给多个规则共享。可以应用在规则的then段。
如果多个包定义了同样名称的全局变量，它们必须使用同样的类型，并且全部指向同一个全局值。全部变量通常用来返回数据，获得提供数据或服务给规则使用。
     
    语法结构为：global 对象类型 对象名称

在使用global定义的全局变量时有两点需要注意：

>1.如果对象类型为包装类型时，在一个规则中改变了global的值，那么只针对当前规则有效，对其他规则中的global不会有影响。可以理解为它是当前规则代码中的global副本，规则内部修改不会影响全局的使用。
 
>2.如果对象类型为集合类型或javaBean时，在一个规则中改变了global的值，对java代码和所有规则都有效。

    // java中的定义
    List<String> list = new ArrayList<>();
    KieSession kieSession = kiebase.newKieSession();
    kieSession.setGlobal( "myGlobalList", list );

    // DRL中的引用
    global java.util.List myGlobalList;

    rule "Using a global"
     when
      // Empty
     then
      myGlobalList.add( "My global list" );
     end


##### 3.3.6 DRL中的attribute段

属性段主要是为每个规则设置一些规则属性，规则可以设定的属性，如下表： 具体详细介绍可以参看：juejin.cn/editor/draf…

|  属性   | 值  |
|  ---  | ---- |
| salience  | 定义规则优先级的整数。在激活队列中排序时，具有较高显著性值的规则将具有较高的优先级。 |
| dialect | 指定规则使用的语言类型，取值为java和mvel |
| enabled  | 布尔值。选择该选项后，将启用规则。如果未选择该选项，则该规则将被禁用。 |
| date-effective  | 生效时间，包含日期和时间定义的字符串。仅但概念日期和时间在date-effective属性之后时，才能激活该规则 例如：date-effective "4-Seq-2018" |
| date-expires  | 失效时间，包含日期和时间定义的字符串。如果当前日期和时间在date-expires属性之后，则无法激活该规则 |
| no-loop  | 防止死循环，布尔值，选择该选项后，如果规则的结果重新触发了先钱满足的条件，则无法重新激活（循环）规则。如果为选择条件，则可以在这些情况下循环规则。 |
| agenda-group  | 一个字符串，用于表示您要向其分配规则的议程组。通过议程组，您可以对议程进行分区，以提供对规则组的更多执行控制。只有已获得焦点的议程组中的规则才能被激活。 |
| activation-group  | 激活分组，具有相同分组名称的规则只能由一个规则触发，一个字符串，用于表示您要向其分配规则的激活（或XOR）组。在激活组中，只能激活一个规则。触发的第一个规则将取消激活组中所有规则的所有未激活。 |
| agenda-group  | 议程分组，只有获取焦点的组中的规则才由可能触发 |
| duration  | 一个长整数值，定义了如果仍满足规则条件，则可以激活规则的持续时间（ms） |
| timer  |定时器，指定规则触发的事件，一个字符串规定了规则的触发频次，例子：timer(cron:* 0/15 * * * ?)  |
| calendar  | 一个日历表定了一了规则的生效时间段, 例子：calendars "* * 0-7, 18-23 ? * *" |
|  auto-focus | 自动获取焦点，一般结合agenda-group一起使用 |
| lock-on-active  |  |
| ruleflow-group  |  |
| dialect  | 方言，一般默认为java |



##### 3.3.7 DRL中的when段

可以理解为一条规则的左手边，包含了多个条件，必须满足了when段当中的条件，才能触发then段执行动作。when段的条件表现形式多样，如一下举例：

    // 1. 空条件
    rule "Always insert applicant"
    when
    // Empty
    then   // Actions to be executed once
    insert( new Applicant() );
    end
    // 2. 单一条件
    Person( age == 50 )
    // 3. 单一对象函数条件
    Person(getAge() == 50)
    // 4. 嵌套属性条件
    Person( address.houseNumber == 50 )
    Person( getAddress().getHouseNumber() == 50 )
    // 5. 表达式条件
    Person(age > 100 && (age % 10 == 0 ))
    // 6. 使用java对象
    Person( Math.round( weight / ( height * height ) ) < 25.0 )
    // 7. 多条件
    Person( age > 50, weight > 80 )
    Person( age > 50, weight > 80, height > 2 )
    Person( ( age > 50, weight > 80 ) || height > 2 )
    // 8. 嵌套对象条件
    Person( name == "mark", address.city == "london", address.country == "uk" )
    Person( name == "mark", address.( city == "london", country == "uk") )
    // 日期条件
    Person( bornBefore < "27-Oct-2009" )
    // Map条件
    Person(childList[0].age == 18)
    // 模糊匹配
    Person( firstName soundslike "John" )
    // 字符串截取条件
    // Verify what the String starts with:
    Message( routingValue str[startsWith] "R1" )
    // Verify what the String ends with:
    Message( routingValue str[endsWith] "R2" )
    // Verify the length of the String:
    Message( routingValue str[length] 17 )
    // 对象间条件
    Color( colorType : type ) and Person( favoriteColor == colorType )


##### 3.3.7.2 Drools提供的比较操作符

|  属性   | 值  |
|  ---  | ---- |
|  \>  | 大于 |
|  \<  | 小于 |
|  \>=  | 大于等于 |
|  ==  | 等于 |
| !=   | 不等于 |
| contains  | 检查一个Fact对象的某个属性值是否包含一个指定的对象值 |
| not contains | 检查一个Fact对象的某个属性值是否不包含一个指定的对象值 |
| memberOf   | 判断一个Fact对象的某个属性是否存在一个或多个集合中 |
| not memberOf   | 判断一个Fact对象属性是否不在一个或多个集合中 |
| matches   | 判断一个Fact对象的属性是否与提供的标准的Java正则表达式进行匹配 |
| not matches   | 判断一个Fact对象的属性是否不与提供的标准的Java正则表达式进行匹配 |

##### 3.3.8 DRL中的then段

Then段主要规则的RHS（右手边），主要是处理满足规则条件所得到的结果。在then段中我们可以使用一些Drools中默认的对象来辅助处理。 有关所有辅助对象的处理方法可以参照:（KnowledgeHelper.java） 以下是一些使用举例

    // 使用set<field> ( <value> )为实例对象设置属性
       $application.setApproved ( false );
       $application.setExplanation( "has been bankrupt" );
    
    // 批量修改实例对象属性
       modify( LoanApplication ) {
       setAmount( 100 ),
       setApproved ( true )
    }
