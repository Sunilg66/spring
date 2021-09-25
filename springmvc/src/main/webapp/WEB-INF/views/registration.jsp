<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Registration Page</title>
</head>
<body background="https://images.unsplash.com/photo-1618588507085-c79565432917?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8YmVhdXRpZnVsJTIwbmF0dXJlfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&w=1000&q=80">

<h1 id = "heading"  >RegistrationForm</h1>

<div align="center">
<form action ="registration.xworkz">
  <fieldset>
    <legend>Fill The Form:</legend> 
<pre>
<label for="username"> Name: </label>
<input type="text" name="username" >
<label> Email: </label>
<input type="text" name = "email">
<label> phonenumber: </label>
<input type="number" name ="phonenumber">
<label> Password: </label>
<input type="text" name= "password">
<label> confirm password:</label>
<input type="text" name= "confirmpassword">
<label> Male </label>
<input type="radio" name = "gender">
<label> Female </label>
<input type="radio" name ="gender">
<label> Others </label>
<input type="radio" name ="gender">
<label> state: </label>
<select  name = "state" >
<option value = "Karnataka" > Karnataka</option>
<option value = "Andhrapradesh" > Andhrapradesh</option>
<option value = "Goa" > Goa</option>
<option value = "Kerala" selected> Kerala</option>
<div>
<input type="submit" value="Submit">
</div>
</select>

</pre>
 </fieldset>
 </div>
</form>

</body>
</html>