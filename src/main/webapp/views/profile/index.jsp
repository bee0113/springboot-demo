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
</div>

<%--<table>--%>
<%--    <tr>--%>
<%--        <td>Username</td>--%>
<%--        <td>--%>
<%--            <sec:authentication property="txtUsername" var="userId"/>--%>
<%--            <span id="userId">--%>
<%--                ${userId};--%>
<%--            </span>--%>
<%--        </td>--%>
<%--    </tr>--%>
<%--&lt;%&ndash;    <tr>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <td>Authorities</td>&ndash;%&gt;--%>
<%--&lt;%&ndash;        <td><span><sec:authentication property="principal"/></span></td>&ndash;%&gt;--%>
<%--&lt;%&ndash;    </tr>&ndash;%&gt;--%>
<%--</table>--%>
</body>
</html>
