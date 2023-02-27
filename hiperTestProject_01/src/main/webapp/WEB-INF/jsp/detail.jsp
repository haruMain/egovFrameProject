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
		    <a href="<c:url value='create.do'/>" class="button">  
				<button class="btn_search f_right mtb_10">
					글 등록
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
		
		<div class="comment-box">
                    
   		                 <div class="comment-count">댓글 <span id="count">0</span></div>

   		                 <div class="comment-name">
	                        <span class="anonym">작성자 : 
	                    	    <input type="text" class="form-control" id="replyWriter" placeholder="이름" name ="replyWriter" style="width: 100px; border:none;">
	                        </span>
	                      </div>   
	                        	
                    <div class="comment-sbox">
                        <textarea class="comment-input" id="replyCon" cols="80" rows="2" name="replyCon" ></textarea>
                    </div>
                    	<div class="regBtn">
                    		<button id="Comment_regist"> 댓글등록</button>
                    	 </div>
             </div>
                    	 
                    	 
		<%-- <div class="reply_form">
		<div>
			<form method="post" action="/replyWrite.do">
			<p>
				<label>댓글 작성자</label> 
				<input type="text" name="replyWriter">
			</p>
			<p>
				<textarea type="text" rows="5" cols="50" name="replyCon"></textarea>
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
				</li>	
			</c:forEach>
			</div>
		</div> --%>
	</body>
	
<script src="https://code.jquery.com/jquery-3.6.0.min.js">
	$('#Comment_regist').click(function() {
			
   			//Json으로 전달할 파라미터 변수선언
   			const board_num = ${boardNum};
   			const reply_writer = $('#replyWriter').val();
   			const reply_con = $('#replyCon').val();
   			
   			console.log(board_num);
   			console.log(reply_writer);
   			console.log(reply_con);
   		
   			if(reply_writer == ''){
   				alert('로그인 후 이용해주세요');
   				return;
   			}else if(reply_con == '') {
   				alert('내용을 입력하세요');
   			}
   			
   			$.ajax({
   				type:'post',
   				url:'<c:url value="/replyWrite.do"/>',
   				data: JSON.stringify(
   					{
   						"board_num":board_num,
   						"reply_writer":reply_writer,
   						"reply_con":reply_con
   					}		
   				),
   				contentType: 'application/json',
   				success:function(data){
   					console.log('통신성공' + data);
   					if(data === 'InsertSuccess') {
   						alert('댓글 등록이 완료되었습니다.');
   						console.log('댓글 등록 완료');
   						$('#reply_writer').val(com_writer);
   	   					$('#reply_con').val('');
   	   					getList();
   					} else {
   						alert('로그인 이후 이용해주시기 바랍니다.');
   						console.log('댓글 등록 실패');
   					}
   				},
   				error:function(){
   					alert('통신실패');
   				}
   			});// 댓글 비동기 끝
   			
		});// 댓글등록 이벤트 끝
		
		getList();
	
	</srcrpt>
	</html>
	
	