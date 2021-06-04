<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.sql.*,java.util.*"%>

<%
String epost=request.getParameter("epost");
String password=request.getParameter("password");
Class.forName("com.mysql.cj.jdbc.Driver");
java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/moviecollection","root","");
Statement st= con.createStatement();
ResultSet rs=st.executeQuery("SELECT * FROM user WHERE epost='"+epost+"' AND password='"+password+"'");
try{
	
rs.next();
if(rs.getString("epost").equals(epost)&&rs.getString("password").equals(password))
{    
	
		response.sendRedirect("http://localhost:8081/nnmovie/jsp/movie/movie_home.jsp");
		
         session.setAttribute("epost", epost);
}
}
catch (Exception e) {	
	
	 out.println("Please, make sure you entered your information correctly");
	
}
%>