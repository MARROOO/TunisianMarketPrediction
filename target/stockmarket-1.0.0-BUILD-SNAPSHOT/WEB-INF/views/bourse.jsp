<%@page import="tn.educanet.stockmarket.persistence.Market"%>
<%@page import="tn.educanet.stockmarket.persistence.AllMarkets"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page import="java.text.NumberFormat" %>
<%
    NumberFormat nf = NumberFormat.getInstance();
    nf.setMaximumFractionDigits(2);
    nf.setMinimumFractionDigits(2);
%>

<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Market Place</title>
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/custom.css" />" rel="stylesheet">

</head>

<body>
  <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f1f1f1;
            margin: 0;
            padding: 0;
        }
       

        .container {
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 90%;
            margin: 20px auto;
            overflow-x: auto;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            border: 1px solid #FF0000;
        }

        th {
            padding: 8px 20px;
            text-align: center;
            border-bottom: 1px solid #FF0000;
        }
         td {
            padding: 8px 20px;
            text-align: center;
            border-bottom: 1px solid #FF0000;
        }

        th {
            background-color: #333;
            color: #fff;
            position: sticky;
            top: 0;
            
        }
         

        tr:nth-child(even) {
            background-color: #C0C0C0;
            border-bottom: 1px solid #FF0000;
        }
       .pinned2 {
           
            position: sticky;
         }
           
        
        .pinned {
           
            position: sticky;
            left: 0;
            z-index: 1;
            background-color:  #333;
            color: #fff;
        }
        .title {
            text-align: center;
            margin: 20px 0;
            color:  #8B0000	;
            font-size: 24px;
            font-weight: bold;
        }
    </style>
    
</head>
<body>
<!-- <h1>BVMT Market watch</h1> -->
  <div class="title">BVMT Market Watch</div>
    <div class="table-container">
        <table class="table">
		<thead >
			<tr class="pinned" >
				<th class="pinned2"> Valeur</th>
				<th >Statut</th>
				<th >Ord.A</th>
				<th >Qte.A</th>
				<th >Achat</th>
				<th >Vente</th>
				<th >Qte.V</th>
				<th >Ord.V</th>
				<th  >Cours de reference</th>
				<th >CTO</th>
				<th >VTO%</th>
				<th >QTO</th>
				<th >Ouv</th>
				<th >Dernier</th>
				<th >Var%</th>
				<th >Dern Qte</th>
				<th >Qte</th>
				<th >Capit</th>
				<th >P.Haut</th>
				<th >P.Bas</th>
				<th >S.Haut</th>
				<th >S.Bas</th>
				<th >Heure</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="market" items="${markets.getMarkets()}">   
				  <tr>
				  	<td class="pinned" >
				  		${market.getReferentiel().getStockName()} 
				  	
				 
				  	</td>
				  	<td>
				  		${market.getStatus()} 
				  	</td>
				  	<td>
				  	
				  		<c:if test="${market.getLimit().getAskOrd()!=0}" >
				  		${market.getLimit().getAskOrd()} 
				  		</c:if>
				  	</td>
				  	<td>
				  	
				  		<c:if test="${market.getLimit().getAskQty()!=0}" >
				  		${market.getLimit().getAskQty()} 
				  		</c:if>
				  	</td>
				  	<td>
				  		<c:choose>
						    <c:when test="${market.getLimit().getAsk()>=8000}">
						        ATP
						    </c:when>    
						    <c:when test="${market.getLimit().getAsk()!=0}">
        				  		${market.getLimit().getAsk()} 
						    </c:when>    
						  
						</c:choose>
				  	</td>
				  	<td>
				  		<c:choose>
						    <c:when test="${market.getLimit().getBid()>=8000}">
						        ATP
						    </c:when>    
						    <c:when test="${market.getLimit().getBid()!=0}">
        				  		${market.getLimit().getBid()} 
						    </c:when>    
						  
						</c:choose>
				  	</td>
				  	<td>
				  	
				  		<c:if test="${market.getLimit().getBidOrd()!=0}" >
				  		${market.getLimit().getBidOrd()} 
				  		</c:if>
				  	</td>
				  	<td>
				  	
				  		<c:if test="${market.getLimit().getBidQty()!=0}" >
				  		${market.getLimit().getBidQty()} 
				  		</c:if>
				  	</td>
				  	<td>
				  		${market.getLast()} 
				  	</td>
				  	<td>
				  		<c:if test="${market.getCto()!=0}" >
					  		${market.getCto()} 
				  		</c:if>
				  	</td>
				  	<td>
					  		
				  	</td>
				  	<td>
				  	</td>
				  	<td>
				  	<c:if test="${market.getOpen()!=0}" >
				  		${market.getOpen()} 
				  		</c:if>
				  	</td>
				  	<td>
				  		
				  	${market.getLast()} 
				  	</td>
				  	<td>
				  			${market.getChange()}%
				  	</td>
				  	<td>
			
				  	</td>
				  	<td>
					<c:if test="${market.getVolume()!=0}" >
				  		${ market.getVolume()}
				  	</c:if>
				  	</td>
				  	<td>
				  	<c:if test="${market.getCaps()!=0}" >
				  		<%= (int)Math.ceil(((Market)pageContext.getAttribute("market")).getCaps())%> 
				  	</c:if>
				  	</td>
				  	<td>
						<%= nf.format(((Market)pageContext.getAttribute("market")).getHigh())%>				  	
					</td>
				  	<td>
				  	
				  		<%= nf.format(((Market)pageContext.getAttribute("market")).getLow())%>
				  	</td>
				  	<td>
				  	<c:if test="${market.getMax()!=0}" >
				  		
						<%= nf.format(((Market)pageContext.getAttribute("market")).getMax())%>				  	
				  	</c:if>
					</td>
				  	<td>
				  	<c:if test="${market.getMin()!=0}" >
				  		<%= nf.format(((Market)pageContext.getAttribute("market")).getMin())%>
				  	</c:if>
				  	</td>
				  	<td>
				  		${market.getTime() }
				  	</td>
				  	
				  	
				  </tr>
				  
			</c:forEach>  
		</tbody>
	</table>
	
</body>
</html>

