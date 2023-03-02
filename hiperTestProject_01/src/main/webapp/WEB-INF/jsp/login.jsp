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
    <style>
    .loginForm {
    margin: 0 auto;
    }
    
    </style>
</head>
<body>
    <header>
        <div class="header">
            <span class="top">Board Project</span>
        </div>
    </header>
    <form name="form1" method="post">
<table border="1" width="400px">
<tr>
 <td>아이디</td>
 <td><input id="userId" name="userId"></td>
</tr>
<tr>
 <td>비밀번호</td>
 <td><input type="password" id="userPass" name="userPass"></td>
</tr>
<tr>
 <td colspan="2" align="center">
 <button type="button" id="btnLogin">로그인 </button>
 <c:if test="${message == 'error'}">
 <div style="color:red;"> 아이디 또는 비밀번호가 일치하지 않습니다.
 </div>
</c:if>
<c:if test="${message == 'logout'}">
 <div style="color:red;"> 로그아웃되었습니다.
 </div>
</c:if>
</td>
</tr>
</table>
</form>
  
	
	
    <%-- <form method="post" action="/login.do">
    <div class="loginForm">
    	<input type="text" id="userId" name="userId" placeholder="아이디">
    	<input type="text" id="userPass" name="userPass" placeholder="비밀번호">
    	
    	    <div class="submit">
    		<input type="submit" value="로그인">    	
    		</div>
    		<a href="<c:url value='join.do'/>" class="join">
                  <span class="btn_text">회원가입</span>
            </a>
    	</div>
    
    </form> --%>
    
    
    
   <%--  <div class="container">
        <div class="content">
            <div class="login_wrap">
            
            
            <form name='homeForm' method="post" action="/login.do">
		<c:if test="${user == null}">
			<div>
				<label for="userId"></label>
				<input type="text" id="userId" name="userId">
			</div>
			<div>
				<label for="userPass"></label>
				<input type="password" id="userPass" name="userPass">
			</div>
			<div>
				<button type="submit">로그인</button>
				<a href="<c:url value='join.do'/>" class="join">
                                <span class="btn_text">회원가입</span>
                            </a>
				<!-- <button type="button">회원가입</button> -->
			</div>
		</c:if>
		<c:if test="${user != null }">
			<div>
				<p>${user.userId}님 환영 합니다.</p>
				<button id="logoutBtn" type="button">로그아웃</button>
			</div>
		</c:if>
		<c:if test="${msg == false}">
			<p style="color: red;">로그인 실패! 아이디와 비밀번호 확인해주세요.</p>
		</c:if>
	</form>
            
                <form name="form1" method="post" action="/login.do">
                <c:if test="${user ==null}"
                    <div class="pannal_inner">
                        <div class="input_row">
                            <input type="text" id="userId" name="userId" class="input_text" placeholder="아이디">
                        </div>
                        <div class="input_row">
                            <input type="password" id="userPass" name="userPass" placeholder="비밀번호" class="input_text">
                        </div>
                        <div class="login_btn">
                            <button type="submit" id="btnLogin" class="btnLogin">로그인
                                <!-- <span class="btn_text">로그인</span> -->
                            </button>
                            <a href="<c:url value='join.do'/>" class="join">
                                <span class="btn_text">회원가입</span>
                            </a>
                            
                            </c:if>
                            
                            <%-- <c:if test="${message == 'error'}">
                            	<div style="color:red;"> 아이디 또는 비밀번호가 일치하지 않습니다.</div>
                            </c:if>
                            <c:if test="${message == 'logout'}">
							 	<div style="color:red;"> 로그아웃되었습니다.</div>
							</c:if>
                        </div>
                    </div>
                </form> --%>
</body>
<script src="https://code.jquery.com/jquery-3.4.1.js">

  /*   var msg = "${msg}";
    if (msg === "REGISTERED") {
        alert("회원가입이 완료되었습니다.");
    } else if (msg == "FAILURE") {
        alert("아이디와 비밀번호를 확인해주세요.");
    } 
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
    	}); */
</script>
<script>
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
 document.form1.action= "${path}/user/login_check.do";
 document.form1.submit(); //제출
 });
});
</script>
</html>