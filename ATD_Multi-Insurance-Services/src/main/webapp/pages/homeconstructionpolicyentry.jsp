<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Calculate Your Claim Amount:
<table>
<tr><td>${homebean}</td></tr>
</table>
<table>
<tr><td>${calculation}</td></tr>
</table>
<form action="claimcalculation" method="post">
				Age of House:<input type="text" name="Ageofhouse">
				House Value:<input type="text" name="Housevalue"> 
				Claim Interest:<input type="text" name="Claiminterest"> 
				Claim Amount:<input type="text" name="Claimamount"> 
			<input type="submit" name="Submit">
	</form>
	<table><tr>
		<td><button><a href="customers">Home Insurance</a></button></td></tr>
	</table>
</body>
</html>