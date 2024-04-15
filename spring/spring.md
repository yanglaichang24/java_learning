## 2024.04.15 
setAutowireMode
自动装配的理解

之前一直以为setAutowireMode是注解@Autowire/@Auto By type
其实是大错特错,阅读mybaits-spring整合中发现了问题
MapperFactoryBean 中的SqlsessionTemplate 注入问题一直没有发现在哪里注入的
然后跟代码发现了setAutowireMode的作用

AutowireMode默认是0就是不用自动注入，也就是手动注入
手动注入就是通过Xml配置或者Anno注解等配置的,<property>或@Autowired注入的
这个其实是放在ProperValus里面的

AutowireMode 其实是自动装配，获取beanInfo 获取相关类的属性，然后自动注入

mark一下




