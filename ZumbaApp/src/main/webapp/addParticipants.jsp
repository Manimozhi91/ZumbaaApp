<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.lang.Object"%>

<%@page import="com.zumba.bean.Batch"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ZumbaApp-Participants</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<body>
<br/>
<div class="container bg-dark">
<h2 class="text-light text-center">Add Participants Details</h2>
<div class="card text-center">
  <img src="${pageContext.request.contextPath}/image/zumba.jpg" width= 1100px height=300px/>
 
<form action="ParticipantsContoller" method="post" class="form-group">
<input type="hidden" name="operation" value="add"><br/>
 <div class="form-group row">
<label class="col-sm-2 col-form-label">Participant Name</label>
<input type="text" name="pname" pattern="[a-zA-Z]*"  required><br/>
</div>
 <div class="form-group row">

<label class="col-sm-2 col-form-label">Age</label>
<input type="number" min="7" max ="50" name="age" required ><br/>

<small>Min: 7</small>
</div>
 <div class="form-group row">

<label class="col-sm-2 col-form-label " >Phone number</label>
<input type="tel" pattern="[6-9]{3}[0-9]{3}[0-9]{4}" name="phonenumber" maxlength="10" size="10" required>

</div >

<select name="batchid"><br/>
<option>--Select Batch --</option>

<%
Object obj=session.getAttribute("listOfBatch");
List<Batch> listOfBatch=(List<Batch>)obj;
Iterator<Batch> li=listOfBatch.iterator();
while(li.hasNext()){
	Batch bat=li.next();
	%>
	<option value="<%=bat.getBatchid()%>">
				   <%= bat.getBatchid() %>(
				   <%=bat.getTime()%>)
				   </option>
	<%
}

%>

</select><br/>
<br/>
<input type="submit"  class="btn btn-primary  text-center" value="Add Participants"/>
<input type="reset"   class="btn btn-primary  text-center" value="Reset"/>

</form>

<a href=index.jsp>BACK</a>
</div>
</br>
</div>
</body>
</html>