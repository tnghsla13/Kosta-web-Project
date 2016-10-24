
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>


<html>
<head>
<script>
	function myFunction() {

		console.log("oper");
		var path = document.getElementById("upload").value;
		document.getElementById("image").src = path;
	}
</script>
</head>

<body>

	<h1>My Web Page</h1>

	<img src="resources/images/default.jpg" alt="�궗吏꾩뾾�쓬" id="image">
	<input type="file" id="upload" />
	<button type="button" onclick="myFunction()">Try it</button>

</body>
</html>
