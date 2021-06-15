<%--
  Created by IntelliJ IDEA.
  User: berno
  Date: 2020-05-31
  Time: 오후 3:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@include file="/views/common/htmlHead.jsp" %>
<header>
    <nav class="navbar navbar-expand-lg navbar-light">
        <a class="navbar-brand" href="#">Boot Security</a>

        <div class="collapse navbar-collapse" id="navbarTogglerDemo02">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item active">
                    <a class="nav-link" href="${pageContext.request.contextPath}/index">Home</a>
                </li>
                <sec:authorize access="isAuthenticated()">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/profile/index">Profile</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="hasRole('ROLE_ADMIN')">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/admin/index">Admin</a>
                    </li>
                </sec:authorize>
                <sec:authorize access="hasAnyRole('ROLE_ADMIN', 'ROLE_MANAGER')">
                    <li class="nav-item">
                        <a class="nav-link" href="${pageContext.request.contextPath}/management/index">Management</a>
                    </li>
                </sec:authorize>


                <%--                <li class="nav-item active">--%>
                <%--                    <a class="nav-link" href="${pageContext.request.contextPath}/">Home</a>--%>
                <%--                </li>--%>
                <%--                <li class="nav-item">--%>
                <%--                    <a class="nav-link" href="${pageContext.request.contextPath}/account/login">로그인</a>--%>
                <%--                </li>--%>
                <%--                <li class="nav-item">--%>
                <%--                    <a class="nav-link" href="${pageContext.request.contextPath}/account/logout">로그아웃</a>--%>
                <%--                </li>--%>
                <%--                <li class="nav-item">--%>
                <%--                    <a class="nav-link" href="${pageContext.request.contextPath}/account/signup">회원가입</a>--%>
                <%--                </li>--%>
                <%--                <li class="nav-item">--%>
                <%--                    <a class="nav-link" href="${pageContext.request.contextPath}/account/info">내정보</a>--%>
                <%--                </li>--%>
                <%--                <li class="nav-item">--%>
                <%--                    <a class="nav-link" href="${pageContext.request.contextPath}/admin">관리자</a>--%>
                <%--                </li>--%>

            </ul>
        </div>
        <form class="form-inline my-2 my-lg-0" form-method="post" action="/logout">
            <button class="btn btn-outline-danger my-2 my-sm-0 btn-sm" type="submit">Logout</button>
        </form>
    </nav>
</header>
