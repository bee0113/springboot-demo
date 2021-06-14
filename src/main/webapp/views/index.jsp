<%--
  Created by IntelliJ IDEA.
  User: blucean
  Date: 2020-06-03
  Time: 오후 6:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/views/common/htmlHead.jsp" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<%-- 헤더 --%>
<jsp:include page="/views/common/demoHeader.jsp"/>

<div class="container">
    <div class="jumbotron">
        <h1 class="display-4">Hello, Spring Boot Security!</h1>
        <p class="lead">This is the home page of our web application. Anyone can access it, even if they have not signed
            in.</p>
        <hr class="my-4">
        <p>Using this example, you will become more familiar with Spring Security concepts:)</p>
        <p class="lead">
            <a class="btn btn-primary btn-lg" href="https://spring.io/projects/spring-security" role="button">Learn more
                about Spring Security</a>
        </p>
    </div>
</div>
</body>
</html>
