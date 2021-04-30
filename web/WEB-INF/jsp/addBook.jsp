<%--
  Created by IntelliJ IDEA.
  User: Inno
  Date: 2021/4/27
  Time: 14:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>

    <%--Bootstrap美化界面--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>新增书籍</small>
                    </h1>
                </div>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/book/addBook" method="post">
            <div class="form-group">
                <label for="bookName">书籍名称</label>
                <input type="text" name="bookName" class="form-control" id="bookName" required>
            </div>
            <div class="form-group">
                <label for="bookCount">书籍数量</label>
                <input type="text" name="bookCounts" class="form-control" id="bookCount" required>
            </div>
            <div class="form-group">
                <label for="bookDetail">书籍描述</label>
                <input type="text" name="detail" class="form-control" id="bookDetail" required>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>
        </form>
    </div>
</body>
</html>
