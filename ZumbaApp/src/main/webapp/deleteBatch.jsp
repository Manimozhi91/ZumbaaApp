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

<h2 class="text-light text-center">Delete Batch Details</h2>
<div class="card">
 <img src="${pageContext.request.contextPath}/image/zumba.jpg" width= 1100px height=300px/>

   <div class="card-body text-center">
<form action="BatchController" method="post" class="form-group">
<input type="hidden"  name="operation" value="delete"><br/>

<label>BatchId</label>
<input type="number" name="batchid"><br/>


</select>
<input type="submit"  class="btn btn-primary" value="Delete Batch"/>
<input type="reset"  class="btn btn-primary" value="Reset"/>

</form>
</div>
<a href=index.jsp>BACK</a>
</div>
</br>
</div>

</body>
</html>