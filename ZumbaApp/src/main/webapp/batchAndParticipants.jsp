<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Batch and Parcipants List</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>

<div class="container bg-dark">
</br>
<div class=card >
  <div class="d-inline-flex p-3 ">
  <img src="${pageContext.request.contextPath}/image/zumba.jpg" width= 300px height=100px/>
  <div></br>
  <h1 class="font-italic" > Batch and Participants Details</h1></div>
  </div>
 
</div>

<div class="card" >

</br>
<table class="table table-bordered border-primary" border="2" >
	
				<th class="table-dark">Type of Batch</th>
				<th class="table-dark">Time</th>
				<th class="table-dark">PName</th>
				<th class="table-dark">Age</th>
	
	<%
	Object obj=session.getAttribute("listOfBP");
	List<Object[]> list=(List<Object[]>)obj;
	Iterator<Object[]> li=list.iterator();
	while(li.hasNext()){
		Object oo[]=li.next();
		%>
		<tr  class="table-warning">
			<td ><%=oo[0] %></td>
			<td><%=oo[1] %></td>
			<td><%=oo[2] %></td>
			<td><%=oo[3] %></td>

			</tr>
		<%		

	}
	%>
</table>

<a href=index.jsp>BACK</a>
</div>
</br>
</div>

</body>
</html>