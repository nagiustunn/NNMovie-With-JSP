<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*,java.util.*"%>
<%
	String id=request.getParameter("id");
	try
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviecollection", "root", "");
		Statement st=conn.createStatement();
		int i=st.executeUpdate("DELETE FROM movie WHERE id="+id);
		String url = "http://localhost:8081/nnmovie/jsp/movie/movie_home.jsp";
		response.sendRedirect(url);
	}
		catch(Exception e)
		{
		System.out.print(e);
		e.printStackTrace();
	}
%>