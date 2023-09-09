<%-- <%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	welcome to your space 
</h1>

<a href="http://localhost:8080/stockmarket/users">add user</a> </br>
<a href="http://localhost:8080/stockmarket/usersList">show users</a></br>
<a href="http://localhost:8080/stockmarket/bourse">bourse</a>

</body>
</html> --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Site de Bourse</title>
 
  <style>
/* Styles pour le site de bourse */

body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color:#F0F8FF;
}

header {
    background-color: #292b2c;
    color: #fff;
    padding: 10px 0;
}

nav {
    display: flex;
    justify-content: space-between;
    align-items: center;
    max-width: 1200px;
    margin: 0 auto;
    padding: 0 20px;
}

nav ul {
    list-style: none;
    display: flex;
    gap: 20px;
}

nav a {
    color: #fff;
    text-decoration: none;
    transition: color 0.3s ease;
}

nav a:hover {
    color: #ccc;
}

.logo {
    font-size: 24px;
    font-weight: bold;
}

.hero {
    background: url('images (1).jpg') no-repeat center center;
    background-size: cover;
    color: #fff;
    text-align: center;
    padding: 100px 0;
}

.hero h1 {
    font-size: 36px;
    margin-bottom: 20px;
    color: #191970;
}

.hero p {
    font-size: 18px;
    margin-bottom: 40px;
    color: #191970;
}

.btn {
    display: inline-block;
    padding: 10px 20px;
    background-color: #191970;
    color: #fff;
    text-decoration: none;
    border-radius: 5px;
}

.stock-list {
    max-width: 1200px;
    margin: 0 auto;
    padding: 40px 20px;
}

.stock-card {
    background-color: #fff;
    border: 1px solid #ddd;
    border-radius: 5px;
    padding: 20px;
    margin-bottom: 20px;
    display: flex;
    justify-content: space-between;
    align-items: center;
}

.stock-symbol {
    font-size: 24px;
    font-weight: bold;
}

.stock-price {
    font-size: 24px;
}

.stock-change {
    font-size: 18px;
    padding: 5px 10px;
    border-radius: 5px;
    color: #fff;
}

.positive {
    background-color: #28a745;
}

.negative {
    background-color: #dc3545;
}

.about {
    max-width: 1200px;
    margin: 0 auto;
    padding: 40px 20px;
}

footer {
    text-align: center;
    background-color: #292b2c;
    color: #fff;
    padding: 10px 0;
    position: absolute;
    bottom: 0;
    width: 100%;
}

   
   </style>
  <!--   <script>
        const images = [
            'resources/WEB-INF/views/images (1).jpg',
            'resources/WEB-INF/views/images (2).jpg',
            'resources/WEB-INF/views/images.jpg'
            // Add more image paths here
        ];

        const heroSection = document.getElementById('hero');
        let currentImageIndex = 0;

        function changeBackgroundImage() {
            if (currentImageIndex >= images.length) {
                currentImageIndex = 0;
            }
            
            heroSection.style.backgroundImage = `url('${images[currentImageIndex]}')`;
            currentImageIndex++;
        }

        setInterval(changeBackgroundImage, 5000);
    </script> -->

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Professional Stock Trading</title>
s

</head>
<body>
    <header>
        <nav>
            <div class="logo">StockTrader</div>
            <ul>
                <li><a href="#">Home</a></li>
                <li><a href="http://localhost:8080/stockmarket/users">Sign In</a></li>
                <li><a href="#">Portfolio</a></li>
                <li><a href="#">About</a></li>
                <li><a href="#">Contact</a></li>
            </ul>
        </nav>
    </header>
    
    <section class="hero" id="hero">
        <div class="hero-content">
            <h1>Welcome to StockTrader</h1>
            <p>Your Source for Professional Stock Trading.</p>
            <a href="http://localhost:8080/stockmarket/bourse" class="btn">Stock Market</a>
        </div>
    </section>
    
    <section class="about">
        <h2>About Us</h2>
        <p>We're a team of engineering students</p>
    </section>
    
    <footer>
        <p>&copy; 2023 StockTrader. All rights reserved.</p>
    </footer>
</body>
</html>
