<%@ page language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ZUMBA APP</title>
</head>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
</br>
<div class="container bg-dark">
<h2 class="text-light text-center">WELCOME TO ZUMBA MANAGEMENT APP</h2>
<div class="card bg-light text-light text-center" >
<img src="${pageContext.request.contextPath}/image/zumba.jpg" width= 1100px height=300px/>




<a href="ParticipantsContoller">Add Participants</a></br>
<a href="updateParticipants.jsp">Update Participants</a></br>
<a href="deleteParticipants.jsp">Delete Participants</a></br>
<a  href="addBatch.jsp" >Add Batch</a></br>
<a  href="updateBatch.jsp" >Update Batch</a></br>
<a href="deleteBatch.jsp">Delete Batch</a></br>
<a href="BatchController">View Batch and Participants</a></br>


</div>
</br>
</body>
</html>