<%--
  Created by IntelliJ IDEA.
  User: yoonjaeseung
  Date: 2021/06/14
  Time: 10:24 오후
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/views/common/htmlHead.jsp" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body class="bg-light">
<div class="all">
    <div class="container_custom">
        <div class="row navbar navbar-light" style="padding-top: 20px">
            <a class="col navbar-brand" href="/">
                <span class="d-inline-block align-bottom">Spring Demo</span>
            </a>
        </div>

        <div class="row justify-content-center pb-5">
            <h1>회원가입</h1>
        </div>

        <div class="row justify-content-center">
            <%-- form --%>
            <form id="accountSignUpForm" class="border-top border-bottom pl-5">
                <%-- 아이디 --%>
                <div class="row mb-4 pt-4">
                    <div class="col-3 text-left">
                        <span class="spanCus">아이디</span>
                    </div>
                    <div class="col-5">
                        <input type="text" class="inputCus form-control" id="accountUserId" name="accountUserId">
                    </div>
                    <div class="col-4">
                        <button type="button" id="overlap_btn" class="btn btn-warning">중복체크</button>
                    </div>
                </div>
                <%-- //아이디 --%>

                <%-- 이름 --%>
                <div class="row mb-4">
                    <div class="col-3 text-left">
                        <span class="spanCus">이름</span>
                    </div>
                    <div class="col-5">
                        <input type="text" class="inputCus form-control" name="accountUserNm" id="accountUserNm">
                    </div>
                </div>
                <%-- //이름 --%>

                <%-- 이메일 --%>
                <div class="row mb-4">
                    <div class="col-3 text-left">
                        <span class="spanCus">E-Mail</span>
                    </div>
                    <div class="col-5">
                        <input type="text" class="inputCus form-control" name="accountEmail" id="accountEmail">
                    </div>
                </div>
                <%-- //이메일 --%>

                <%-- 패스워드 --%>
                <div class="row mb-4">
                    <div class="col-3 text-left">
                        <span class="spanCus">패스워드</span>
                    </div>
                    <div class="col-5">
                        <input type="password" class="inputCus form-control" name="accountPassword"
                               id="accountPassword">
                    </div>
                </div>
                <%-- //패스워드 --%>

                <%-- 개발자 구분 - 예비(P), 경력(C) --%>
                <div class="row justify-content-center mb-5 ml-5 pl-1">
                    <div class="col-4">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="devCheck" id="nonMajor" value="P">
                            <label class="form-check-label" for="nonMajor">
                                <span class="spanCus">예비 개발자</span>
                            </label>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="devCheck" id="major" value="C">
                            <label class="form-check-label" for="major">
                                <span class="spanCus">경력 개발자</span>
                            </label>
                        </div>
                    </div>
                </div>
                <%-- //개발자 구분 --%>

                <%-- 가입하기 버튼 --%>
                <div class="row justify-content-start mb-3">
                    <div class="col-3"></div>
                    <div class="col-5">
<%--                        <input type="button" id="signUp_btn" class="inputCus btn btn-primary" value="가입하기"/>--%>
                        <input type="submit" id="signUp_btn" class="inputCus btn btn-primary" value="가입하기"/>
                    </div>
                </div>
                <%-- //가입하기 버튼 --%>
            </form>
            <%-- //form--%>
        </div>

    </div>
    <%-- //div class=container_custom --%>
</div>
<%-- //div class=all --%>
</body>
</html>
