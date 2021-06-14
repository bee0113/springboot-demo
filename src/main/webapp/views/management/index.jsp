<%--
  Created by IntelliJ IDEA.
  User: yoonjaeseung
  Date: 2021/06/14
  Time: 11:35 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/views/common/htmlHead.jsp" %>
<html>
<head>
    <title>Management</title>
</head>
<body>
<%-- 헤더 --%>
<jsp:include page="/views/common/demoHeader.jsp"/>

<!-- Page content goes here -->
<div class="container">
    <p>This is Management\Index. Only people with role_management can see this</p>
</div>

</body>
</html>
