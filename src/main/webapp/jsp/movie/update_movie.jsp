<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<%! String driverName = "com.mysql.jdbc.Driver";%>
<%!String url = "jdbc:mysql://localhost:3306/moviecollection";%>
<%!String user = "root";%>
<%!String psw = "";%>
<%
	String id = request.getParameter("id");
	String name=request.getParameter("name");
	String description=request.getParameter("description");
	String image=request.getParameter("address");
	String actor_actrees=request.getParameter("actor_actrees");
	
	if(id != null)
	{
	Connection con = null;
	PreparedStatement ps = null;
	try
	{
		Class.forName(driverName);
		con = DriverManager.getConnection(url,user,psw);
		String sql="Update user set id=?, name=?, description=?, actor_actrees=?, actor_actrees=? where userId="+id;
		ps = con.prepareStatement(sql);
		ps.setString(1,id);
		ps.setString(2, name);
		ps.setString(3, description);
		ps.setString(4, actor_actrees);
		ps.setString(5, actor_actrees);

		int i = ps.executeUpdate();
		if(i > 0)
			{
				String url = "http://localhost:8081/nnmovie/jsp/movie/movie_home.jsp";
				response.sendRedirect(url);
			}
		else
			{
			out.print("There is a problem in updating Record.");
			}
	}
	catch(SQLException sql)
	{
		request.setAttribute("error", sql);
		out.println(sql);
	}
	}
%>