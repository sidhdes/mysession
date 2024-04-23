<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body {
    margin: 0;
    padding: 0;
    font-family: Arial, sans-serif;
    background-color: #121212; /* Dark background color */
    color: #fff; /* Light text color */
}

.container {
    margin: 50px;
    background-color: #2a2a2a; /* Dark background for container */
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.5); /* Box shadow for container */
}

.registration-form {
    width: 100%;
    max-width: 400px;
}

.form-group {
    margin-bottom: 20px;
}

label {
    display: block;
    margin-bottom: 5px;
    color: #6dc56d; /* Greenish label color */
}

input[type="text"],
input[type="email"],
input[type="password"] {
    width: 100%;
    padding: 10px;
    border-radius: 5px;
    border: 1px solid #6dc56d; /* Greenish border color */
    background-color: #333; /* Dark input background color */
    color: #fff; /* Light text color */
}

button {
    width: 100%;
    padding: 10px;
    border: none;
    border-radius: 5px;
    background-color: #6dc56d; /* Greenish button color */
    color: #fff; /* Light text color */
    cursor: pointer;
}

button:hover {
    background-color: #4b944b; /* Darker greenish color on hover */
}


</style>
</head>
<body>
 <div class="container">
        <form action="savedata" method="post" >
            <h2>Register</h2>
            <div class="form-group">
                <label for="username">Username:</label>
                <input type="text" id="username" name="rname" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="remail" required>
            </div>
            <div class="form-group">
                <label for="password">Password:</label>
                <input type="password" id="password" name="rpass" required>
            </div>
            <div class="form-group">
                <label for="retype-password">Retype Password:</label>
                <input type="password" id="retype-password" name="rcpass" required>
            </div>
            <a href="update">forgot password?</a>
            <button type="submit">Register</button>
              
        </form>
    </div>
</body>
</html>