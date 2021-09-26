<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Vaccine Registration</title>
</head>
<body background="https://images.unsplash.com/photo-1618588507085-c79565432917?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmVhdXRpZnVsJTIwbmF0dXJlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80">

<h1 id = "heading" >RegistrationForm</h1>

<div align="center">
<form action ="onRegister.do">

   <pre>
     <label>Username</label>
     <input type="text" name="userName">
     <label>Email</label>
     <input type="email" name="email">
     <label>Password</label>
     <input type="password" name="password">
     <label>Confirm Password</label>
     <input type="password" name="confirmPassword">
     <label>Phone</label>
     <input type="text" name="phone">
     <label>Vaccine Type</label>
     <select name="vaccineType">
     <option value="Covishield">Covisheild</option>
     <option value="Covaxin">Covaxin</option>
     <option value="Sptunilv">Sputnikv</option>
     </select>
     <label>Aadhar no</label>
     <input type="text" name="aadharNo">
     <br>
     <label>Gender</label>
     <label>male<input type="radio" name="gender" value="male"></label>
     <label>Female<input type="radio" name="gender" value="female"></label>
     <label>others<input type="radio" name="gender" value="others"></label>
     </br>
     <input type="submit" value="Register">
   </pre>
 
 </div>
</form>

</body>
</html>