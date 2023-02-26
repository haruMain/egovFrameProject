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
				<button class="btn_search f_right mtb_10"  onclick="javascript:fn_goBbsNtc();">목록</button>	
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
				</div>
									
					<%-- <a href="/update.do?boardNum=${data.boardNum}"> 
					<button class="btn_search modify f_right mtb_10" style="margin-left:10px;">
					수정
					</button>
					</a> 
					<input class="btn_search f_right mtb_10" type="submit" value="삭제"/> --%>
				</div>	
			</form>		
		</div>
	</body>