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
		<style>
		.uploadResult ul li {
			list-style: none;
		}
		
		</style>
		
	</head>
	<body>
		<div class="job_wrap">			
			<h2>공지사항</h2>
		    <div class="f_none">  
		     <a href="<c:url value='list.do'/>">    
				<button class="f_right mtb_10 btn_one">목록</button>	
				</a>
			</div>	
			
			<form class="center" method="post" accept-charset="UTF-8" id="registForm" enctype="multipart/form-data">
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
				
				<!-- 첨부파일 -->
				<div class="row">
				<div class="panel-body" id="file-list">
				    <input type="file" name="uploadFile" multiple>
				</div>
				<div class="uploadResult">
					<ul>
					</ul>
				</div>
				</div>
				</div>
			</form>		
		</div>
	</body>
	<script type="text/javascript">
	$(document).ready(function() {
        $("a[name='file-delete']").on("click", function(e) {
            e.preventDefault();
            deleteFile($(this));
        });
    })
 
    function addFile() {
        var str = "<div class='file-group'><input type='file' name='file'><a href='#this' name='file-delete'>삭제</a></div>";
        $("#file-list").append(str);
        $("a[name='file-delete']").on("click", function(e) {
            e.preventDefault();
            deleteFile($(this));
        });
    }
 
    function deleteFile(obj) {
        obj.parent().remove();
    }
	</script>
	 
	</html>