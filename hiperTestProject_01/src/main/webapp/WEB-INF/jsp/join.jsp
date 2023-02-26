<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Document</title>
    <link rel="stylesheet" href="/css/join.css" type="text/css">
</head>
<body>
    <header>
        <div class="header">
            <div class="head_top">
            <span>회원가입</span>
            </div>
        </div>
    </header>
    <div class="container">
        <div class="content">
        <form action="${path}/join.do" method="post">
            <div class="join_row">
                <h3 class="join_title">
                    <label for="id">아이디</label>
                </h3>
                <span class="join_box">
                    <input type="text" id="userId" name="userId" class="id">
                </span>
            </div>
            <div class="join_row">
                <h3 class="join_title">
                    <label for="pw">비밀번호</label>
                </h3>
                <span class="join_box">
                    <input type="password" id="userPass" name="userPass" class="pw">
                </span>
            </div>
            <div class="join_row">
                <h3 class="join_title">
                    <label for="name">이름</label>
                </h3>
                <span class="join_box">
                    <input type="text" id="userName" name="userName" class="name">
                </span>
            </div>
            <button type="submit" id="btnJoin" class="btn_join">
                <span>가입하기</span>
            </button>
            </form>
        </div>
    </div>
</body>
</html>