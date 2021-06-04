<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>

<%
String id=request.getParameter("id");
String name=request.getParameter("name");
String description=request.getParameter("description");
String pub_year=request.getParameter("pub_year");
String language=request.getParameter("language");
String actor_actress=request.getParameter("actor_actress");
String type=request.getParameter("type");

try
{
Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviecollection", "root", "");
Statement st=conn.createStatement();

int i=st.executeUpdate("insert into branch(name,description,pub_year,language,actor_actress,type)values('"+name+"','"+description+"','"+pub_year+"','"+language+"','"+actor_actress+"','"+type+"')");
String url = "http://localhost:8081/nnmovie/jsp/movie/movie_home.jsp";
response.sendRedirect(url);
}
catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>