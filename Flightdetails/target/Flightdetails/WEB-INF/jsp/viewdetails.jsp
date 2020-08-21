<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<html>
<head>
</head>
<body style="background-color: lightblue;">
<h1  style="margin-left:400px;">Flight Details List</h1>  
<table border="8" width="50%" cellpadding="20" style="margin-left:auto;margin-right:auto;margin-top:0px;margin-bottom:100px;">  
   <c:forEach var="flight" items="${databaseFile}">   
   <tr>  
   <td>${flight.id}</td>  
   <td>${flight.airlineName}</td>  
   <td>${flight.source}</td>  
   <td>${flight.destination}</td>  
   <td>${flight.duration}</td> 
   <td>${flight.details }</td> 
   <td><image="data:image/jpg;base64,"+encodedImage;${flight.flightticketPhoto}" width="240" height="300"/></td>
   </tr>  
    
   </c:forEach>  
   </table>  
   <br/>
   </body>  
</html>