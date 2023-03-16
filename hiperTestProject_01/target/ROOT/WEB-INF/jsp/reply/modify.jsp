<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>댓글 수정</title>
		<meta name="description" content="클린아이 잡플러스" />
		<meta name="keywords" content="클린아이 잡플러스" />
		<meta name="author" content="행정안전부" />
		<link rel="shortcut icon" href="images/favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/board.css" />
		<link rel="stylesheet" type="text/css" href="css/detail.css" />
		
	</head>
	<body>
	 <div class="reply_form">
		<div>
			<form method="post" action="/modify.do">
			<div class="replyModify" style="margin: 0 auto; width: 500px;">
			<p>
				<label>댓글 작성자</label> 
				<input type="text" name="replyWriter" value="${reply.replyWriter}" readonly="readonly"/>
			</p>
			<p>
				<textarea rows="5" cols="30" name="replyCon">${reply.replyCon }</textarea>
			</p>
			<p>
				<input type="hidden" name="boardNum" value="${reply.boardNum}">
				<input type="hidden" name="replyNum" value="${reply.replyNum}">
				<button type="submit">댓글 수정</button>
			</p>
			</div>
			</form>
			</div>
		</div>
		
	</body>
	</html>
	
	