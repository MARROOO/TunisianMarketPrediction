<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<!DOCTYPE html>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Stock Market Admin Panel</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f1f1f1;
            margin: 0;
            padding: 0;
        }

        .sidebar {
            width: 250px;
            background-color: #333;
            height: 100vh;
            color: #fff;
            padding-top: 20px;
        }

        .content {
            margin-left: 250px;
            padding: 20px;
        }

        .sidebar a {
            display: block;
            padding: 10px;
            color: #fff;
            text-decoration: none;
            transition: background-color 0.3s;
        }

        .sidebar a:hover {
            background-color: #444;
        }

        .content-header {
            font-size: 24px;
            margin-bottom: 20px;
        }

        .card {
            background-color: #fff;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="sidebar">
        <a href="#">Dashboard</a>
        <a href="#">Stocks</a>
        <a href="#">Users</a>
        <a href="#">Transactions</a>
        <a href="#">Settings</a>
    </div>
    <div class="content">
        <h1 class="content-header">Admin Panel</h1>
        <div class="card">
            <h2>Stock Management</h2>
            <p>Manage and update stock information.</p>
            <a href="#" class="button">Go to Stocks</a>
        </div>
        <div class="card">
            <h2>User Management</h2>
            <p>Manage user accounts and permissions.</p>
            <a href="#" class="button">Go to Users</a>
        </div>
        <!-- More cards for different functionalities -->
    </div>
</body>

</html>