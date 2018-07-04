<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
</head>
<body>

	<h2>Form passing data and that getting captured from the
		HttpServletRequest</h2>
	<form action="processFormV2" method="GET">
		<input type="text" placeholder="Enter your Name" name="fullName">
		<input type="submit" value="Click Me">
	</form>

	<hr>
	<h2>Form passing data and that getting captured from the
		RequestParam annotation</h2>
	<form action="processFormV3" method="GET">
		<input type="text" placeholder="Enter your Name" name="studentName">
		<input type="submit" value="Click Me">
	</form>



</body>
</html>