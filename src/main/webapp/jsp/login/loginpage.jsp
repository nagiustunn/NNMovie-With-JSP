<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>NNMOVIE</title>
	<link rel = "icon" href = 
			"data:image/jpeg;base64,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" 
	        type = "image/x-icon">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
	<link rel="stylesheet" href="css/loginpage.css">
</head>
<body>
	<div class="row">
		<%@ include file="header.jsp" %>
	</div>

  <div class="container">
    <div class="row">
      <div class="col-sm-9 col-md-7 col-lg-5 mx-auto">
        <div class="card card-signin my-5">
          <div class="card-body">
            <h5 class="card-title text-center">Sign In NNMOVIE</h5>
            <form class="form-signin" action="user_control.jsp" method="post">
              <div class="form-label-group">
                <input type="email" id="inputEmail" name="epost" class="form-control" placeholder="Email address" required autofocus>
                <label for="inputEmail">Email address</label>
              </div>

              <div class="form-label-group">
                <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
                <label for="inputPassword">Password</label>
              </div>

              <div class="custom-control custom-checkbox mb-3">
                <input type="checkbox" class="custom-control-input" id="customCheck1">
                <label class="custom-control-label" for="customCheck1">Remember password</label>
              </div>
              <button class="btn btn-lg btn-primary btn-block text-uppercase" type="submit">SIGN IN</button>
              <hr class="my-4">
             </form>
          </div>
        </div>
      </div>
    </div>
  </div>

	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>