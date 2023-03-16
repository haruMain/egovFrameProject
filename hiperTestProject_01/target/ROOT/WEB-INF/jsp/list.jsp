<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org" lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/list.css" type="text/css">
</head>
<body>

<p>JSP화면 테스트 </p>
<h1>test1</h1>
	
	<table>
	<tr>
	<td>번호</td>
	<td>이름</td>
	<td>아이디</td>
	
	</tr>
	<c:forEach items="${users}" var="user">
	<tr>
	<td><c:out value="${user.userNum}"></c:out></td>
	<td><c:out value="${user.userName}"></c:out></td>
	<td><c:out value="${user.userId}"></c:out></td>
	</tr>
	</c:forEach>
	</table>
	
	<%-- <th:block th:each="user:${users}">
    	<tr class="tBody" th:object="${user}">
           <td class="userNum" th:text="*{userNum}"></td>
           <td class="userName" th:text="*{userName}"></td>
           <td class="userId" th:text="*{userId}"></td>
        </tr>
 	</th:block> --%>
	
</body>
</html>