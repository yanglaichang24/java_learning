## openjdk 官网
https://openjdk.org/projects/jdk/

## openjdk github
https://github.com/openjdk/jdk.git

## JCP 
> Java Community Process

JCP（Java Community Process）是一个开放的国际组织，主要由Java开发者以及被授权者组成，职能是发展和更新。

JCP维护的规范包括J2ME、J2SE、J2EE，XML，OSS，JAIN等。组织成员可以提交JSR（Java Specification Requests），通过特定程序以后，进入到下一版本的规范里面。


## JEP
> JDK Enhancement Proposal

JDK增强建议，JEP是一个JDK核心技术相关的增强建议文档. JEP可能要求探索新颖的(甚至是“古怪的”)想法,这些建议通常是尚未进入正式规划的建议。 一般来说会要求进行原型设计用于区分可行及不可行的想法，直到能产生正式的规格说明


## JLS
>Java Language Specification

Java 语法规范： 用于指出Java的语法标准和一些规则，这些规则包括了合规及不合规程序的说明。 规范同时指出了程序的含义并说明了运行后将发生什么。


## JSR
> Java Specification Requests.

意思是Java 规范提案。是指向JCP(Java Community Process)提出新增一个标准化技术规范的正式请求。任何人都可以提交JSR，以向Java平台增添新的API和服务。JSR已成为Java界的一个重要标准

## JEP,JSR,JLS三者关系
JEP: JEP提出并发展了实验思想，以至于可以指定它们。 并非所有JEP都能实现。

JSR: JSR采纳了成熟的想法（例如来自JEP的想法），并产生了新的规范或对现有规范的修改，可能成为JLS。 并非所有JSR都能实现。JEP相比JSR更早期。

JLS: JSR的研究通常会产生一个标准, 有些会产生规范的接口和一些参考实现(如:JSR-303 Bean Validation,Hibernate Validator 是 Bean Validation 的参考实现)。
JLS规范只是JAVA规范中的一个部分,其他规范还包含JVM规范,JSP规范,EJB规范等等.

JEP是未来发展规划的列表和建议，可用于JDK未来的规划。 JSR是JCP的产物，JCP过程一般用于开发或修订Java技术规范的正式流程。

