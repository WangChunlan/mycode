利用gradle、springboot、idea 搭建ssm 框架
---
**本项目主要是研究封装的切面以及mybatis 中通用mapper.xml** 

注意 参考资料1中关于{MyBatis集成之SpringBoot}中application.yml配置jdbc 格式错误
#### 清单 1、mybatis-config.xml
关于为实体类取别名，方便在xxMapper.xml 文件中使用。

当有多个实体类在同一个包下的时候，我们并不需要想上面一个一个地添加typeAlias，只需要修改代码如下所示即可。
```xml
<!--只能给实体类区别名-->
<typeAliases>
  <!--<typeAlias type="com.smartpos.domain.User" alias="user"></typeAlias>-->
  <!-- 用于指定要配置别名的包，当指定之后，该包下的实体类都会注册别名，并且类名就是别名，不再区分大小写-->
  <package name="com.smartpos.domain"></package>
</typeAliases>

```
#### 清单 2、logback.xml
日志文件
依赖 logback的jar 包



参考资料：<br/>
1、[利用SpringBoot、Gradle、IDEA进行SSM框架搭建（基础篇）](http://97uncle.cn/?p=64)<br/>
2、[spring官网](https://spring.io/projects)<br/>
3、[Mybatis入门（三）之取别名标签](https://blog.csdn.net/stevensam_lin/article/details/82113006)<br/>

---------------------------------------





