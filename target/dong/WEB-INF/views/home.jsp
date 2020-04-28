<%--
  Created by IntelliJ IDEA.
  User: dongdeshuai
  Date: 2020/4/26
  Time: 5:56 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;
%>
<html>
<head>
    <title>主页</title>
    <link rel="stylesheet" type="text/css" href="../css/home.css"/>
</head>
<body>
    <div id="homeFont">
        这是首页
    </div>
</body>
</html>
