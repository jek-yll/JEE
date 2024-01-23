<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Details</title>
</head>
<body>
    <h1>Details du produit</h1>
<div>
    Marque : ${product.getMarque()}
    Ref : ${product.getReference()}
    Date : ${product.getDateAchat()}
    Prix : ${product.getPrix()}
</div>
</body>
</html>
