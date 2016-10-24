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
	
	<h3>일정상세</h3>
	<a class="btn vtn-xs btn-warning" href="updateSchedule.do?scheduleId=${schedule.scheduleId}">UPDATE</a>
	<a class="btn vtn-xs btn-danger" href="deleteSchedule.do?scheduleId=${schedule.scheduleId}">DELETE</a>
	<table class="table">
		<colgroup>
			<col width="150">
			<col width="*">
		</colgroup>
		<tr>
			<th>제목</th>
			<td><input id="scheduleTitle" name="scheduleTitle"
				class="form-control" type="text" value="${schedule.title }"
				readonly></td>
		</tr>
		<tr>
			<th>장소</th>
			<td><input id="schedulePlace" name="schedulePlace"
					class="form-control" type="text" value="${schedule.place }" readonly></td>
		</tr>
		<tr>
			<%-- <th>일시</th>
			<td>${schedule.StartDate }</td> --%>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea id="scheduleContents" name="scheduleContents"
					class="form-control" rows="7" readonly>${schedule.contents }</textarea></td>
		</tr>
	</table>
	<br>

</body>
</html>

