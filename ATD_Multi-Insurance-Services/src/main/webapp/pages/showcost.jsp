<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.insurance.ATD.cropinsurance.Bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Object obj = request.getAttribute("costestimated");

if(obj==null){
	out.print("no details available");
}else{
	List<Bean> list = (ArrayList<Bean>) obj;
}
 
	for (Bean f : list) {

%>

Booking Details are:
<table>

<tr>
<th>Crop Name:</th>
<th>Premium Rate:</th>
<th>Crop Season:</th>
<th>Insurance Cost:</th>


</tr>
<tr>
<td><%=f.getCropname()%></td>
<td><%=f.getPremiumrate()%></td>
<td><%=f.getCropseason()%></td>
<td><%=f.getTotalcost()%></td>


</tr>
</table>


<% }%>


</body>
</html>