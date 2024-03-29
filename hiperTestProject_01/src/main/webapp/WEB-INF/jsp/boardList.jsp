<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<link rel="stylesheet" type="text/css" href="css/boardList.css" />
		
		<style>
		ul {
			list-style: none;
			width : 30%;
			display: inline-block;
		}
		li {
			float: left;
			margin-left : 5px;
		}
		.changePage{
			border:1px solid #cccccc;
			padding:10px 0;
			color:#6f6e6e;
			margin:20px 5px 45px 0;
			display:inline-block;
			font-size:15px;
			width:43px;
			box-sizing: border-box;
			text-decoration: none;
		}
		.page {
    		text-align: center;
		}
	</style>
	</head>
	<body>
	<header>
	<ul>
	<%-- <c:choose>
		<c:when test="${not empty member}">
			<li><a href="../member/logout">로그아웃</a></li>
		</c:when>
		<c:otherwise>
			<li><a href="/user/login.do">로그인</a></li>
		</c:otherwise>
	</c:choose> --%>
		</ul>	
		
	</header>
		<div class="job_wrap" id="container">
			<h2>공지사항</h2>
			
			<div class="search_box">
			<div class="register">
			<c:if test="${!empty sessionScope.user}">
			<h3 class="rei_btn">
			<a href="<c:url value='create.do'/>" class="button">글 등록</a> 
			</h3>
			</c:if>
			<%-- <h3>
			<c:out value="${result.userId }"></c:out>
			</h3> --%>
			</div>
			<h3>
			<%-- <c:if test="${user != null}">
				<p>${user.userId}</p>
			</c:if> --%>
			</h3>
				<label for="search_s" class="sr-only">검색구분</label>
				<select class="w_160 mr_9" id="search_s">
					<option>제목</option>
					<option>내용</option>
					<option>작성자</option>
				</select>
				<label for="search_n" class="sr-only">검색하기</label>
				<input type="text" name="" class="w_200 mr_9" id="search_n">
				<button class="btn_search">검색</button>
			</div>
			<table class="board_job" cellspacing="0" cellpadding="0">
				<thead>
					<tr>
						<th id="a">번호</th>
						<th id="b">제목</th>
						<th id="c">내용</th>
						<th id="d">작성일</th>
						<th id="d">작성자</th>
					</tr>
				</thead>
				<tbody>
				<li>
 <a href="/list.do?num=1">글 목록(페이징)</a> 
</li>
				
				<c:forEach items="${boards}" var="board">
					<tr>
						<td><c:out value="${board.boardNum}"></c:out></td>
						<td><c:out value="${board.boardTit}"></c:out></td>
						<td><a href="${path}/detail.do?boardNum=${board.boardNum }">${board.boardCon}</a></td>       
						<td><c:out value="${board.boardReiDate}"></c:out></td>
						<td><c:out value="${board.userId}"></c:out></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>
			
			<div>
 <c:forEach begin="1" end="${pageNum}" var="num">
    <span>
     <a href="/list.do?num=${num}">${num}</a>
  </span>
 </c:forEach>
</div>
	
			
			<%-- <div class="page">
			<c:if test="${pageDTO.prev }">
				<a class="changePage" href="${pageDTO.startPage -1}"><code>&lt;</code></a>
			</c:if>
			<c:forEach var="num" begin="${pageDTO.startPage }" end="${pageDTO.endPage }">
				<c:choose>
					<c:when test="${pageDTO.criteria.pageNum == num }">
						<code><c:out value="${num}"/></code>
				</c:when>
				<c:otherwise>
					<a class="changePage" href="${num}"><code><c:out value="${num}"/></code></a>
					</c:otherwise>
				</c:choose>
			</c:forEach>
			<c:if test="${pageDTO.next }">
				<a class="changePage" href="${pageDTO.endPage + 1}"><code>&gt;</code></a>
			</c:if>	
			</div> --%>
			
			
			<%-- <ul class="btn-group pagination">
			    <c:if test="${pageMaker.prev }">
			    <li>
			        <a href='<c:url value="/list.do?page=${pageMaker.startPage-1 }"/>'><i class="fa fa-chevron-left"></i></a>
			    </li>
			    </c:if>
			    <c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="pageNum">
			    <li>
			        <a href='<c:url value="/List.do?page=${pageNum }"/>'><i class="fa">${pageNum }</i></a>
			    </li>
			    </c:forEach>
			    <c:if test="${pageMaker.next && pageMaker.endPage >0 }">
			    <li>
			        <a href='<c:url value="/List.do?page=${pageMaker.endPage+1 }"/>'><i class="fa fa-chevron-right"></i></a>
			    </li>
			    </c:if>
			</ul> --%>

			<!-- <div class="num">
				<span><img src="images/num_left_02.png"></span><span><img src="images/num_left.png"></span>
				<span class="num_active">1</span><span>2</span><span>3</span><span>4</span><span>5</span><span>6</span><span>7</span><span>8</span><span>9</span><span>10</span><span><img src="images/num_right.png"></span><span><img src="images/num_right_02.png"></span>
			</div> -->
		</div>
	</body>
	 <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	<script>
	var actionForm = $('#actionForm'); $('.paginate_button a').on('click', function(e) { e.preventDefault();
		/* $(document).on('click', '#detail', function(){

		location.href = "${pageContext.request.contextPath}/jsp/detail";

	}); */
		 /* $("a.detail").on("click", function(e){
	            e.preventDefault();
	            location.href = "detail";
	        }); */
	        
	        $(function() {
	    		/* $('.whyBtn').click(function() {
	    			location.href = '<c:url value="/FreeBoard/freeWrite"/>';
	    		}) */
	    		$('#pagination').on('click', 'a', function(e) {
	    			e.preventDefault();
	    			console.log($(this));
	    			const value = $(this).data('pagenum');
	    			console.log(value);
	    			document.pageForm.pageNum.value = value;
	    			document.pageForm.submit();
	    		});
	    		
	    	})

</script>
	</html>