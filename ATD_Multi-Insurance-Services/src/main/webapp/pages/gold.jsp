<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gold Insurance Page</title>
</head>
<body style = "background-image:url('https://th.bing.com/th/id/R.7f568e6ea717f4edb7507260e8bf99b2?rik=5JfNJqBcBLbFqg&riu=http%3a%2f%2fwww.pngall.com%2fwp-content%2fuploads%2f4%2fGold-Coin-PNG-Pic.png&ehk=9mhb91CaEcqG630Uu0mxLqS3ON6fpiUpyefMdGjb7BU%3d&risl=&pid=ImgRaw&r=0')">
<h1 align="center">Gold Insurance Claims</h1>
<table ><tr><th align="left">
<form action="goldinputs" method="post">
<br/>
1.Enter your data here:</th></tr>
     <tr><td>Policynumber:<input type="text" name="policynumber"></td></tr>
     <tr><td>Materials:<input type="text" name="Materials"></td></tr>
     <tr><td>Amount:<input type="text" name="Amount"></td></tr>
     <tr><td>Tenure:<input type="text" name="Tenure"></td></tr>
     <tr><td>Percentage:<input type="text" name="Percentage"></td></tr>
     <tr><td><button>submit</button></td></tr>

</form>
<tr><th align="left">
<form action="golddetails" method = "get">
2. Search Policy Details here:</th></tr>
<tr><td>policynumber:<input type = "text" name = "policynumber">
</td><td>
<input type="submit" value="submit" />
</td></tr></form>
<tr><th align="left">
<form action="golddetails" method = "get">
3.Cancel Policy here:</th></tr>
<tr><td>policynumber:<input type = "text" name = "policynumber">
</td><td>
<input type="submit" value="submit" />
</td></tr></form>
<tr><th align="left">
<form action="golddetails" method = "get">
4.Fetch All Policy Details here:</th></tr>
<td>
<input type="submit" value="allresults"/>
</td></tr></form>
</table>
</body>
</html>