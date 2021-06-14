
<%--
  Created by IntelliJ IDEA.
  User: yoonjaeseung
  Date: 2021/06/14
  Time: 10:41 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/views/common/htmlHead.jsp" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>로그인 성공</title>
</head>
<body>
<h1>로그인 성공!!</h1>
<hr>
<p>
    <span> <sec:authentication property="username"></span>님 환영합니다~
</p>
<a href="<c:out value="/" />">메인으로 이동</a>
</body>
</html>
