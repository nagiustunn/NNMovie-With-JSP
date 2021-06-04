<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String surname=request.getParameter("surname");
String epost=request.getParameter("epost");
String password=request.getParameter("password");
try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviecollection", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into user(name,surname,epost,password)values('"+name+"','"+surname+"','"+epost+"','"+password+"')");
String url = "http://localhost:8081/nnmovie/jsp/homepage/homepage.jsp";
response.sendRedirect(url);
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>