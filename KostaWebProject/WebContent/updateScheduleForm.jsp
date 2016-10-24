<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>일정수정</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/style.css" rel="stylesheet">
<script src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/schedule/schedule.js"></script>
</head>
<body>
	<input id="scheduleId" name="scheduleId" type="hidden" value="${schedule.id }">
	<a href="scheduleList.do">달력으로 돌아가기</a>
	<h3>일정수정</h3>

	<br>
	<form action="updateSchedule.do" method="post">
		<table class="table">
			<colgroup>
				<col width="150">
				<col width="*">
			</colgroup>
			<tr>
				<th>제목</th>
				<td><input id="scheduleTitle" name="scheduleTitle"
					class="form-control" type="text" value="${schedule.title }"></td>
			</tr>
			<tr>
				<th>장소</th>
				<td><input id="schedulePlace" name="schedulePlace"
					class="form-control" type="text" value="${schedule.place }"></td>
			</tr>
			<tr>
				<th>일시</th>
				<td>
				<input type="date" id="startDay" name="startDay">
				<input type="time" id="startHour" name="startHour">
				-
				<input type="date" id="endDay" name="endDay">
				<input type="time" id="endHour" name="endHour">
				</td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea id="scheduleContents" name="scheduleContents"
						class="form-control" rows="7">${schedule.contents }</textarea></td>
			</tr>
		</table>
		<br>
		<div align="center">
			<input class="btn" type="reset" value="취소"> 
			<input class="btn btn-success" type="submit" value="저장">
		</div>
	</form>
	<br>
</body>
</html>
