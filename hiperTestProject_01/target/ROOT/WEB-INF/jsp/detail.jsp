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
		<title>공지사항</title>
		<meta name="description" content="클린아이 잡플러스" />
		<meta name="keywords" content="클린아이 잡플러스" />
		<meta name="author" content="행정안전부" />
		<link rel="shortcut icon" href="images/favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/board.css" />
		<link rel="stylesheet" type="text/css" href="css/detail.css" />
	</head>
	<body>
		<div class="job_wrap">			
			<h2>공지사항</h2>
		    <div class="f_none">  
		    <a href="<c:url value='list.do'/>" class="button">  
				<button class="btn_search f_right mtb_10">
					목록
				</button>	
				</a>
			</div>	
			<form action="/remove.do">
			<div id="" class="board_view">				
				<div class="board_row">
					<div class="board_left_title">번호</div>
				    <div id="informTitle" class="right_content">
				    <input type="text" name="boardNum" value="${data.boardNum }" readonly>
				    <%-- <td>${data.boardTit}</td> --%>
				    </div>
				</div>
				<div class="board_row">
					<div class="board_left_title">제목</div>
				    <div id="informTitle" class="right_content">
				    <input type="text" name="boardTit" value="${data.boardTit }" readonly>
				    <%-- <td>${data.boardTit}</td> --%>
				    </div>
				</div>
				<div class="board_row">
					<div class="board_left_title">등록일</div>
				    <div id="informLastWritten" class="rei_date fields">
				    <td>${data.boardReiDate}</td>
				    </div>
				</div>
				
				<div id="" class="board_content fields">
				<%-- <td>${data.boardCon}</td> --%>
				 <textarea type="text" name="boardCon" readonly>${data.boardCon}</textarea>
				</div>
				<div class="btn_botton">
					<div class="btn_con">
						<!-- <input type="button" class="button" value="수정" onclick="location.href='/update.do'" /> -->
						<a href="/update.do?boardNum=${data.boardNum}"> 
						<input type="button" class="button" value="수정">
						</a>
						<input type="submit" class="button" value="삭제" />
					</div>
					
			</form>		
		</div>
                    	 
	 <div class="reply_form" style="width: 800px; margin: 0 auto;">
		<div>
			<form method="post" action="/replyWrite.do">
			<p>
				<label>댓글 작성자</label> 
				<input type="text" name="replyWriter">
			</p>
			<p>
				<textarea class="replyText" type="text" rows="5" cols="30" name="replyCon"></textarea>
			</p>
			<p>
				<input type="hidden" name="boardNum" value="${data.boardNum}">
				<button type="submit">댓글 작성</button>
			</p>
			</form>
		</div>
			<div>
			<c:forEach items="${reply}" var="reply">
				<li>
					<div>
						<p>${reply.replyWriter} / ${reply.replyReiDate}</p>
						<p>${reply.replyCon }</p>
					</div>
					<div class="btn_box">
						<a href="/modify.do?boardNum=${data.boardNum}&replyNum=${reply.replyNum}">수정</a>   |   <a href="/replyDelete.do?replyNum=${reply.replyNum}">삭제</a>
					</div>
					
					<hr />
				</li>	
			</c:forEach>
			</div>
		</div>
	</body>
	
	</html>
	
	