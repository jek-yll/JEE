<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ajout produit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2> Formulaire d'ajout d'un produit</h2>
    <form action="product" method="post">
        <div class="mb-3">
            <label for="marque" class="form-label">Marque :</label>
            <input type="text" class="form-control" id="marque" name="marque" placeholder="marque">
        </div>
        <div class="mb-3">
            <label for="reference" class="form-label">Reference : </label>
            <input type="text" class="form-control" id="reference" name="reference" placeholder="ref">
        </div>
        <div class="mb-3">
            <label for="dateAchat" class="form-label">dateAchat : </label>
            <input type="date" class="form-control" id="dateAchat" name="dateAchat" placeholder="jj-mm-aaaa">
        </div>
        <div class="mb-3">
            <label for="prix" class="form-label">prix : </label>
            <input type="text" class="form-control" id="prix" name="prix" placeholder="00 €">
        </div>
        <div class="mb-3">
            <label for="stock" class="form-label">stock : </label>
            <input type="text" class="form-control" id="stock" name="stock" placeholder="0">
        </div>
        <div>
            <input type="file" name="image" accept="image/*"/>
        </div>
        <a type="submit" class="btn btn-primary">Créer</a>
    </form>
</div>
</body>
</html>
