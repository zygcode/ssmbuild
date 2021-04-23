问题：bean不存在

步骤：
1.查看这个bean注入是否成功！
2.Junit单元测试，看我们的代码是否能够查询出来结果！
3.问题一定不在我们的底层，是Spring处了问题！
4.SpringMVC，整合的时候没有调用到我们的service层的bean；
    1.applicationContext.xml没有注入到bean
    2.web.xml中，我们也绑定过配置文件！
        发现问题，在web.xml中，我们配置的是Spring-MVC.xml,
            这里面确实没有service bean，所以报空指针
