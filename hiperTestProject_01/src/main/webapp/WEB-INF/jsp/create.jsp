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
		     <a href="<c:url value='list.do'/>">    
				<button class="f_right mtb_10 btn_one">목록</button>	
				</a>
			</div>	
			
			<form class="center" method="post">
			<div id="" class="board_view">				
				<div class="board_row">
					<div class="board_left_title">제목</div>
				    <div id="informTitle" class="right_content">
				    <input type="text" class="form_control" name="boardTit"> 
				    </div>
				</div>
				<div id="" class="fields board_create_content">
				<div class="board_left_content">내용</div>
				 <textarea type="text" name="boardCon"></textarea>
				</div>
				<button class="f_right mtb_10 btn_one btn_two" onclick="javascript:fn_goBbsNtc();">등록</button>
				<div class="field">
				    <input type="file" name="upload" multiple>
				    <!-- mutiple : 여러개의 첨부파일을 동시에 업로드 할 수 있다. -->
				</div>
				<div class="field">
				    <div class="uploadResult">
				        <ul></ul>
					</div>
				</div>	
			</form>		
		</div>
	</body>