<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Batch</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

<body>
<br/>
<div class="container bg-dark">

<h2 class="text-light text-center">Update Batch Details</h2>
<div class="card">
 <img src="${pageContext.request.contextPath}/image/zumba.jpg" width= 1100px height=300px/>

   <div class="card-body text-center">
<form action="BatchController" method="post" class="form-group">
<input type="hidden"  name="operation" value="update"><br/>

<label>BatchId</label>
<input type="number" min="1000" name="batchid"><br/>
<label>TypeOfBatch</label>
<input type="radio" name="typeofbatch" value="morning">Morning
<input type="radio" name="typeofbatch" value="evening">Evening<br>
<label>Time</label>
<select name="time">
<option value="7am">7AM</option>
<option value="8am">8AM</option>
<option value="9am">9AM</option>
<option value="6pm">6PM</option>
<option value="7pm">7PM</option>
<option value="8pm">8PM</option>

</select>
<input type="submit"  class="btn btn-primary" value="Update Batch"/>
<input type="reset"  class="btn btn-primary" value="Reset"/>

</form>
</div>
<a href=index.jsp>BACK</a>
</div>
</br>
</div>

</head>
<body>

</body>
</html>