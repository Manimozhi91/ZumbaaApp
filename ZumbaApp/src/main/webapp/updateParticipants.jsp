<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Participants</title>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="image" href="zumba.jpg" />

<body>
<br/>
<div class="container bg-dark">
<h2 class="text-light text-center">Update Participants Details</h2>
<div class="card text-center">
  <img src="${pageContext.request.contextPath}/image/zumba.jpg" width= 1100px height=300px/>
 
<form action="ParticipantsContoller" method="post" class="form-group">
<input type="hidden" name="operation" value="update"><br/>
 <div class="form-group row">
<label class="col-sm-2 col-form-label">Participant ID</label>
<input type="number" min="1"name="pid"><br/>
</div>
 
<div class="form-group row">

<label class="col-sm-2 col-form-label " >Phone number</label>
<input type="tel"  maxlength="10" size="10" pattern="[6-9]{3}[0-9]{3}[0-9]{4}" name="phonenumber" required>

</div >


<br/>
<input type="submit"  class="btn btn-primary  text-center" value="Update Participants"/>
<input type="reset"   class="btn btn-primary  text-center" value="Reset"/>

</form>

<a href=index.jsp>BACK</a>
</div>
</br>
</div>

<body>

</body>
</html>