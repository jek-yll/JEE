<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Produits</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
    <div>
        <h1>Liste des produits </h1>
        <a type="button" class="btn btn-success" href="" >Ajouter</a>
    </div>

    <table class="table">
        <thead>
        <tr>
            <th>#</th>
            <th>Marque</th>
            <th>Reference</th>
            <th>Date d'achat</th>
            <th>Prix</th>
            <th>Choix</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.getId()}</td>
                <td>${product.getMarque()}</td>
                <td>${product.getReference()}</td>
                <td>${product.getDateAchat()}</td>
                <td>${product.getPrix()}</td>
                <td>
                    <div>
                        <a type="button" class="btn btn-primary" href="product?id=${product.getId()}">Infos</a>
                        <a type="button" class="btn btn-danger" href="delete?id=${product.getId()}" >Supprimer</a>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


</body>
</html>
