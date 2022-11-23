<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-image:url( 'https://previews.123rf.com/images/doozydo/doozydo1904/doozydo190400870/120271471-indian-rupee-notes-falling-messy-inr-bills-on-transparent-background-india-money-classy-vector-illus.jpg')">
<h2 style="margin-left: 350px;margin-top: 170px;font-size: 40px">Enter the Details for Estimation Cost</h2>

<form modelAttribute="cost" action="cropcost"
			method="post">

<div style="margin-left: 500px;margin-top: 40px">


<label for="Select Crop">Select Crop:</label> <select
name="cropname" id="cropname">
<option value="Select Crop">Select Crop</option>
<option value="Paddy">Paddy</option>
<option value="Wheat">Wheat</option>
<option value="Jowar">Jowar</option>
<option value="Mustard">Mustard</option>
<option value="Tea">Tea</option>

</select> <br><br>

<label for="Select Premium">Select Premium:</label> <select
name="premiumrate">
<option value="1" >Select Premium</option><option value="2" id="ele1">2.5</option>

</select><br><br>
<script>
var select = document.getElementsByTagName('select')[0];
var ele1 = document.getElementById('ele1');
select.addEventListener('change',function(e){ 

//alert(this.value);
if(this.value=='Paddy'){
ele1.innerHTML="2.5"
}else if(this.value=='Wheat'){
ele1.innerHTML="2.5"
}else if(this.value=='Jowar'){
ele1.innerHTML="2.5"
}else if(this.value=='Mustard'){
ele1.innerHTML="3.5"
}else if(this.value=='Tea'){
ele1.innerHTML="3.5"
}

})

</script>
<label for="Select Season">Select Season:</label> <select
name="cropseason" >
<option value="Select Season">Select Season</option>
<option value="Kharif">Kharif</option>
<option value="Rabi">Rabi</option>
<option value="Zaid">Zaid</option>

</select>
<br><br>
<button id="submitButton" type="submit" >Submit</button> 
 			<button id="reset" type="reset">Refresh</button> 
 			</div>
 			</form>
</body>
</html>