<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="text.BookBean,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% ArrayList<BookBean> al=(ArrayList<BookBean>)request.getAttribute("list");
	
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			BookBean bb=(BookBean)it.next();
			out.println(bb.getCode()+"&nbsp&nbsp"+bb.getName()+"&nbsp&nbsp"+bb.getAuthor()+"&nbsp&nbsp"+bb.getPrice()+"&nbsp&nbsp"+bb.getQty()+"<br>");
		}
		
		
%>
<%@include file="choice.html" %>

</body>
</html>