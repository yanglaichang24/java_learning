
##Key Promoter X

>Key Promoter X 是一款帮助你快速学习IDEA快捷键的插件，当你在IDEA中用鼠标点击某些功能时，它会自动提示你使用该功能的快捷键。它能让你更轻松地摆脱使用鼠标功能，从而只使用键盘来开发，这大概是刚开始使用IDEA的程序员最需要的插件了。
当我们使用鼠标完成某些工作时，Key Promoter X会提示对应的快捷键，方便我们更快地掌握IDEA的快捷键。

动图封面
##Lombok
>Lombok目前已经是开发Java应用的标配了，不仅SpringBoot默认支持它，连IDEA也内置了Lombok插件，无需安装即可使用。Lombok是一款Java代码功能增强库，通过Lombok的注解，你可以不用再写getter、setter、equals等方法，Lombok将在编译时为你自动生成。
举个例子，当我们给一个类添加@Getter和@Setter注解后；

/**
* 修改订单费用信息参数
* Created by macro on 2018/10/29.
  */
>  @Getter
>  @Setter
> public class OmsMoneyInfoParam {
  @ApiModelProperty("订单ID")
  private Long orderId;
  @ApiModelProperty("运费金额")
  private BigDecimal freightAmount;
  @ApiModelProperty("管理员后台调整订单所使用的折扣金额")
  private BigDecimal discountAmount;
  @ApiModelProperty("订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
  private Integer status;
  }
  Lombok就会为我们自动生成所有属性的Getter和Setter方法，无需我们再手写，具体使用可以参考Lombok的使用 。


##MyBatisX

MybatisX是一款基于IDEA的快速开发插件，由MyBatis-Plus团队开发维护，提示很全功能也很强大。支持xml和Mapper接口之间的跳转，自带图形化的代码生成器，可以通过类似JPA的方式，直接根据方法名称生成SQL实现。
我们点击Mapper接口方法左侧的图标可以直接跳转到xml中对应的SQL实现，在xml点击左侧图标也可以直接跳转到Mapper接口中对应的方法。
动图封面
当我们创建符合JPA规范的方法时，能直接生成SQL实现无需手写，MyBatisX的功能很强大，详细使用可以参考MybatisX插件的使用 。

动图封面
##RestfulFastRequest
RestfulFastRequest号称是IDEA版本的Postman，它是一个功能强大的Restful API工具包插件，可以根据已有的方法快速生成接口调试用例。它有一个漂亮的界面来完成请求、检查服务器响应、存储你的API请求和导出API请求，该插件能帮助你在IDEA内更快更高效地调试API！
下面是使用RestfulFastRequest调试API接口的一张效果图，用起来还是非常方便的，具体使用可以参考RestfulFastRequest插件的使用 。

动图封面
##PlantUML
PlantUML是一款开源的UML图绘制工具，支持通过文本来生成图形，使用起来非常高效。可以支持时序图、类图、对象图、活动图、思维导图等图形的绘制。
下面使用PlantUML来绘制一张流程图，可以实时预览，速度也很快，具体使用可以参考PlantUML插件的使用 。

动图封面
##SequenceDiagram
SequenceDiagram是一款能根据代码生成时序图的插件，还支持在时序图上直接导航到对应代码以及导出为图片或PlantUML文件。
下面是一张使用SequenceDiagram制作的时序图，还是非常不错的，具体使用可以参考SequenceDiagram插件的使用 。


##GsonFormatPlus
一款能根据JSON字符串自动生成实体类的插件，支持Lombok。
选择类名，右键生成，输入JSON字符串即可快速生成对应实体类。

动图封面
##Json Parser
一款简单小巧的JSON格式化插件，还在使用在线工具格式化JSON？试试这款IDEA插件吧！
直接打开右侧面板，输入JSON字符串即可快速格式化，支持折叠显示。


##String Manipulation
一款专业处理字符串的插件，支持各种格式代码命名方式的切换、支持各种语言的转义和反转义、支持字符加密、支持多个字符的排序、对齐、过滤等。总之功能很强大，有需要字符串操作时，可以试试它。
选中需要处理的字符串，右键打开菜单即可开始使用。


##MapStruct support
MapStruct是一款基于Java注解的对象属性映射工具，使用的时候我们只要在接口中定义好对象属性映射规则，它就能自动生成映射实现类，不使用反射，性能优秀。
当我们使用它的IDEA插件时，他能自动提示映射对象所包含的属性，并且在点击属性时能跳转到对应属性，具体使用可以参考MapStruct的使用 。

动图封面
##Alibaba Java Coding Guidelines
阿里巴巴《Java 开发手册》配套插件，可以实时检测代码中不符合手册规约的地方，助你码出高效，码出质量。
比如说手册里有这么一条：


当我们违反手册规约时，该插件会自动检测并进行提示。
同时提供了一键检测所有代码规约情况和切换语言的功能。
如果你想修改某条规约的检测规则的话，可以通过设置的Editor->Inspections进行修改。


##Alibaba Cloud Toolkit
CloudToolkit是阿里出品的一款IDEA插件，通过它我们可以更方便地实现自动化部署，其内置的终端工具和文件上传功能，即使用来管理服务器也非常方便！这款IDEA插件不仅功能强大，而且完全免费！
配置好服务器后，通过它可以一件打包上传到服务器，然后自动执行指定的脚本。
其内置了一个终端工具，提示还挺全的，如果你想在IDEA里管理Linux服务器，不妨可以试试，具体使用可以参考CloudToolkit插件的使用 。


##arthas idea
基于IDEA开发的Arthas命令生成插件，支持Arthas官方常用的命令，比如 watch、trace、ognl static、ognl bean method、field、monitor、stack 、tt等命令。
直接打开右键菜单，选择Arthas命令即可快速生成命令，具体使用可以参考Arthas使用教程 。


##Docker
IDEA官方提供的Docker插件，已内置，支持远程Docker环境的镜像和容器管理，同时支持使用Docker Compose实现批量部署。
通过它能自动打包应用的镜像，jar包会直接上传到远程服务器并打包成镜像，具体使用可以参考IDEA官方Docker插件的使用 。


##Maven Helper
解决Maven依赖冲突的好帮手，可以快速查找项目中的依赖冲突，并予以解决！
我们可以通过pom.xml文件底部的依赖分析标签页查看当前项目中的所有依赖。
通过冲突按钮我们可以筛选出所有冲突的依赖，当前项目guava依赖有冲突，目前使用的是18.0版本。
选中有冲突的依赖，点击Exclude按钮可以直接排除该依赖。
同时pom.xml中也会对该依赖添加<exclusion>标签，是不是很方便啊！


##Grep Console
一款帮你分析控制台日志的插件，可以对不同级别的日志进行不同颜色的高亮显示，还可以用来按关键字搜索日志内容。
当项目打印日志的时候，可以发现不同日志级别的日志会以不同颜色来显示。
如果你需要修改配色方案的话，可以通过Tools打开该插件的配置菜单。


然后通过配置菜单修改配色方案。
可以通过在控制台右键并使用Grep按钮来调出日志分析的窗口。
然后直接通过关键字来搜索即可。


##Markdown
IDEA官方出品的一款Markdown插件，支持编辑Markdown文件并进行预览，对于习惯了使用IDEA的小伙伴还是非常方便的。
使用它来编辑Markdown文件最方便的地方在于，可以直接使用IDEA提供的各种快捷键，无需适应一套新的快捷键。


##Translation
一款翻译插件，支持Google、有道、阿里、百度翻译，对我们看源码时翻译注释很有帮助！
直接选中需要翻译的内容，点击右键即可找到翻译按钮；
直接使用翻译文档可以将整个文档都进行翻译；
还可以通过右上角的翻译按钮直接翻译指定内容。


##Statistic
一款代码统计工具，可以用来统计当前项目中代码的行数和大小。
我们可以通过顶部菜单中的View->Tool Windows->Statistic按钮开启该功能。
此时就可以看到我们项目代码的统计情况了，比如我的开源项目mall中java代码大小为2818kB，行数为85645。


##Vue.js
Vue.js支持插件，写过前端的朋友肯定用过，可以根据模板创建.vue文件，也可以对Vue相关代码进行智能提示。
启用该插件后，可以根据模板新建.vue文件。
当我们在标签中写入以v-开头的代码时，会提示Vue中的相关指令。

