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
<div class="container">
    <div style="width:600px;margin-left: auto;margin-right: auto;margin-top:24px;padding: 24px;">
        <div class="card">
            <div class="card-header">
                <i class="fa fa-user"></i> Please Login
            </div>
            <div class="card-block" style="padding: 24px;">
                <form name="f" action="/signin" method="post">
                    <fieldset>
                        <!--  Spring Security error display -->
                        <c:if test="${param.error}">
                            <div class="alert alert-danger">Invalid username and password.</div>
                        </c:if>
                        <c:if test="${param.logout}">
                            <div class="alert alert-success">You have been logged out..</div>
                        </c:if>

                        <!-- Login Controls -->
                        <div class="form-group">
                            <label for="username">Username</label>
<%--                            <input type="text" class="form-control" id="username" name="username"--%>
<%--                                   placeholder="Username">--%>

                            <input type="text" class="form-control" id="username" name="txtUsername"
                                   placeholder="Username">
                        </div>

                        <div class="form-group">
                            <label for="password">Password</label>
<%--                            <input type="password" class="form-control" id="password" name="password"--%>
<%--                                   placeholder="Password">--%>
                            <input type="password" class="form-control" id="password" name="txtPassword"
                                   placeholder="Password">
                        </div>

                        <!-- Remember me checkbox -->
                        <div class="form-check">
<%--                            <input type="checkbox" class="form-check-input" id="remember-me" name="remember-me">--%>
                            <input type="checkbox" class="form-check-input" id="remember-me" name="checkRememberMe">
                            <label class="form-check-label" for="remember-me">Remember me?</label>
                        </div>

                        <!-- Login Button -->
                        <div class="form-actions" style="margin-top: 12px;">
                            <button type="submit" class="btn btn-success">Log in</button>
                        </div>

                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
