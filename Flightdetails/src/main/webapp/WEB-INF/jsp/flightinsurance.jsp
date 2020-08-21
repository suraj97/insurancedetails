<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
 
 
<html>
<head>
<title>Insurance Page</title>
 <link href="css/h2.css" rel="stylesheet">
</head>
<body>
 <font color="red">${uploadFileSuccess}</font>
 <br><br>
<form method="POST" action="/uploadFile" enctype="multipart/form-data">	
<h2>Insurance Registration page<h2>
	
	<table border="8" width="70%" cellpadding="20" style="margin-left:auto;margin-right:auto;margin-top:0px;margin-bottom:100px;"> 
	<tr>
<th>Airline Name:
<input type="text" name="airlineName"><br>
</th>
</tr>
<br>
<tr>
<th>
Source:
<input type="text" name="source"><br>
</th>
</tr>
<br>
<tr>
<th>
Destination:
<input type="text" name="destination"><br>
</th>
</tr>
<br>
<tr>
<th>
Duration:
<input type="text" name="duration"><br>
</th>
</tr>
<br>
<tr>
<th>
Select the Insurance:
<select  name="details" >
  <option value="bharati AXA (RS. 999)">bharati AXA (RS. 999)</option>
  <option value="RELIGARE (Rs.1299) ">RELIGARE (Rs.1299) </option>
  <option value="Reliance (Rs. 799)">Reliance (Rs. 799)</option>
  <option value="TATA AIG (Rs. 899)">TATA AIG (Rs. 899)</option>
   <option value="Royal Sundaram (Rs. 1399)">Royal Sundaram (Rs. 1399)</option>
    <option value="SBI GENERAL (Rs. 1199)">SBI GENERAL (Rs. 1199)</option>
</select>
</th>
</tr>
<br>
<tr>
<th>
FlightTicket picture :
<input type="file" name="file" accept="image/*"><br>
</th>
</tr>
<br><br><br>
<tr>
<th>
<input type="submit" value="Upload">
</tr>
</table>

</body>
</form>
</html>