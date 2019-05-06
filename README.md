# Spring and MyBatis - Collection 02

本项目代码参考《Mybatis从入门到精通》第146至第148页的说明。



###错误处理

如果你在开发过程中遇到如下错误：

```
org.apache.ibatis.exceptions.PersistenceException: 
### Error querying database.  Cause: java.lang.IllegalArgumentException: Result Maps collection does not contain value for tk.mybatis.simple.mapper.PrivilegeMapper.privilegeMap
### The error may exist in tk/mybatis/simple/mapper/UserMapper.xml
### The error may involve tk.mybatis.simple.mapper.UserMapper.selectAllUserAndRoles
### The error occurred while handling results
.....
```

请检查：

> 1. If you type resultType as resultMap or vice versa.
> 2. If you forget configure the <mapper> from mybatis-config.xml file