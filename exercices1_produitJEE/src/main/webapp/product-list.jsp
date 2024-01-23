<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Produits</title>
</head>
<body>
    <h1>Liste des produits </h1>

    <c:forEach items="${products}" var="product">
        <div>
            Marque : ${product.getBrand()}
            Reference : ${product.getReference()}
        </div>
    </c:forEach>

</body>
</html>
