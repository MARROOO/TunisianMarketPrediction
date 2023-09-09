<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>users that have that Name are:</h2>

    <c:if test="${not empty personnes}">
        <ul>
            <c:forEach var="personne" items="${personnes}">
                <li>${personne.Name}</li>
            </c:forEach>
        </ul>
    </c:if>
    
    <c:if test="${empty personnes}">
       <body>
    <h1>Résultats de la recherche</h1>
    
    <c:if test="${not empty personnes}">
        <ul>
            <c:forEach var="personne" items="${personnes}">
                <li>${personne.Name}</li>
            </c:forEach>
        </ul>
    </c:if>
    
    <c:if test="${empty personnes}">
    <p>Aucune personne trouvée avec ce nom</p>
    </c:if>
    </c:if>
</body>
</html>