<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

 

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>shcheduleDetail page</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
</head>

<body>
	
	<h3>일정내용입니다.</h3>
<a href="updateSchedule.do?scheduleId=${schedule.scheduleId}">	<input type="button" value="수정"> </a>
	<input type="button" value="삭제">
	<table class="table">
		<colgroup>
			<col width="150">
			<col width="*">
		</colgroup>
		<tr>
			<th>제목</th>
			<td>${schedule.title }</td>
		</tr>
		<tr>
			<%-- <th>날짜</th>
			<td>${schedule.StartDate }</td> --%>
		</tr>
		<tr>
			<th>일정내용</th>
			<td>${schedule.contents }</td>
		</tr>
		<tr>
			<th>장소</th>
			<td>${schedule.place }</td>
		</tr>
	</table>
	<br>

</body>
</html>

