<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> 로그인 화면 </title>
    <link rel="stylesheet" href="/css/login.css" type="text/css">
</head>
<body>
    <header>
        <div class="header">
            <span class="top">Board Project</span>
        </div>

    </header>
    <div class="container">
        <div class="content">
            <div class="login_wrap">
            
                <form name="form1" method="post">
                    <div class="pannal_inner">
                        <div class="input_row">
                            <input type="text" id="userId" name="userId" class="input_text" placeholder="아이디">
                        </div>
                        <div class="input_row">
                            <input type="password" id="userPass" name="userPass" placeholder="비밀번호" class="input_text">
                        </div>
                        <div class="login_btn">
                            <button type="button" id="btnLogin" class="btnLogin">로그인
                                <!-- <span class="btn_text">로그인</span> -->
                            </button>
                            <c:if test="${message == 'error'}">
                            	<div style="color:red;"> 아이디 또는 비밀번호가 일치하지 않습니다.</div>
                            </c:if>
                            <c:if test="${message == 'logout'}">
							 	<div style="color:red;"> 로그아웃되었습니다.</div>
							</c:if>
                            <a href="<c:url value='join.do'/>" class="join">
                                <span class="btn_text">회원가입</span>
                            </a>
                        </div>
                    </div>
                </form>
                
            </div>
        </div>
    </div>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js">

    /* var msg = "${msg}";
    if (msg === "REGISTERED") {
        alert("회원가입이 완료되었습니다.");
    } else if (msg == "FAILURE") {
        alert("아이디와 비밀번호를 확인해주세요.");
    } */
    $(function(){
    	$("#btnLogin").click(function(){
    	 userId=$("#userId").val();
    	 var userPass=$("#userPass").val(); if(userId == ""){
    	  alert("아이디를 입력하세요");
    	  $("#userId").focus(); //입력포커스 이동

    	  return; //함수 종료
    	}
    	if(userPass==""){
    	 alert("비밀번호를 입력하세요"); 
    	 $("#userPass").focus();
    	  return;
    	}
    	//폼 내부의 데이터를 전송할 주소
    	 document.form1.action= "${path}/loginCheck.do";
    	 document.form1.submit(); //제출
    	 });
    	});
</script>
</html>