<%--
  Created by IntelliJ IDEA.
  User: Inno
  Date: 2021/4/27
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <%--Bootstrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <%--出现的问题：提交了修改的SQL请求，但是修改视频，初次考虑，是事务问题，配置完毕事务，依旧失败！--%>
        <%--看一下SQL语句，能否执行成功：SQL执行失败，修改为完成--%>
        <%--前端传递隐藏域--%>
        <div class="form-group">
            <label for="bookId">书籍编号</label>
            <input type="hidden" name="bookID" class="form-control" value="${QBook.bookID}" id="bookId" required>
        </div>
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input type="text" name="bookName" class="form-control" value="${QBook.bookName}" id="bookName" required>
        </div>
        <div class="form-group">
            <label for="bookCount">书籍数量</label>
            <input type="text" name="bookCounts" class="form-control" value="${QBook.bookCounts}" id="bookCount" required>
        </div>
        <div class="form-group">
            <label for="bookDetail">书籍描述</label>
            <input type="text" name="detail" class="form-control" value="${QBook.detail}" id="bookDetail" required>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>
