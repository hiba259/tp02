<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculatrice</title>
</head>
<body>
<%
int op1=Integer.parseInt(request.getParameter("o1"));
int op2=Integer.parseInt(request.getParameter("o2"));
String o =request.getParameter("o");
%>
<%!
float res;
%>
<h2>réponse</h2>
<%
if(o.equals("add")){
	res=op1+op2;
}
if(o.equals("sub")){
	res=op1-op2;
}
if(o.equals("foix")){
	res=op1*op2;
}
if(o.equals("div")){
	if(op2==0){
		%>
		<jsp:forward page="erreur.html"/>
		<%
	}
	else
	{res=op1/op2;}
}
%>
<pre>
resultat <%= res %>
</pre>
</body>
</html>