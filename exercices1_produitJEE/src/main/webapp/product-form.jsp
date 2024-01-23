<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 23/01/2024
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h2> Formulaire d'ajout d'un produit</h2>
    <form action="pr" method="post">
        <div class="mb-3">
            <label for="nom" class="form-label">Nom :</label>
            <input type="text" class="form-control" id="nom" name="nom" placeholder="nom">
        </div>
        <div class="mb-3">
            <label for="nom" class="form-label">Prenom : </label>
            <input type="text" class="form-control" id="prenom" name="prenom" placeholder="prenom">
        </div>
        <button type="submit" class="btn btn-primary">Créer</button>
    </form>

</div>
</body>
</html>
