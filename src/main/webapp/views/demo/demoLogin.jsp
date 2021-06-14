<%--
  Created by IntelliJ IDEA.
  User: yoonjaeseung
  Date: 2021/06/14
  Time: 10:19 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/views/common/htmlHead.jsp" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div>
    <form method="post" action="">
        <input type="text" name="accountUserId" placeholder="아이디">
        <input type="text" name="accountPassword" placeholder="패스워드">

        <input type="submit" value="login">
    </form>
</div>
</body>
</html>
