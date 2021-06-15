<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: yys
  Date: 2021-06-15
  Time: 오후 1:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>
<%-- 헤더 --%>
<jsp:include page="/views/common/demoHeader.jsp"/>

<!-- Page content goes here -->
<div class="container">
    <p>This is User Profile\Index. Only authenticated people can see this</p>


    <table>
        <tr>
            <td>Username :</td>
            <td>
                <sec:authentication property="principal" var="user"/>
                <span> ${user.username}</span>
            </td>
        </tr>
        <tr>
            <td>Authorities : </td>
            <td><span> ${user.authorities}</span></td>
        </tr>
    </table>
</div>
</body>
</html>
