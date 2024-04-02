<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Participants</title>

<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<br/>
<div class="container bg-dark">
<h2 class="text-light text-center">Delete Participants Details</h2>
<div class="card text-center">
  <img src="${pageContext.request.contextPath}/image/zumba.jpg" width= 1100px height=300px/>
 
<form action="ParticipantsContoller" method="post" class="form-group">
<input type="hidden" name="operation" value="delete"><br/>

<label>ParticipantId</label>
<input type="number" name="participantid"><br/>
<br/>
<input type="submit"  class="btn btn-primary  text-center" value="Delete Participants"/>
<input type="reset"   class="btn btn-primary  text-center" value="Reset"/>

</form>

<a href=index.jsp>BACK</a>
</div>
</br>
</div>

</body>
</html>