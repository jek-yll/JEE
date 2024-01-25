<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add produit</title>
    <jsp:include page="../includes/head.jsp" />

</head>
<body>
<jsp:include page="../includes/header.jsp"/>
<div class="container mt-4">
    <center>
        <h2>Ajouter un produit </h2>
    </center>
<div>
    <form action="insert" method="post" enctype="multipart/form-data">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="marque">Marque</label>
                <input type="text" class="form-control" id="marque" name="marque">
            </div>
            <div class="form-group col-md-6">
                <label for="reference">Reference</label>
                <input type="text" class="form-control" id="reference" name="reference">
            </div>
        </div>
        <div class="form-row">
        <div class="form-group col-md-4">
            <label for="prix">Prix</label>
            <input type="text" class="form-control" id="prix" placeholder="12" name="prix">
        </div>
        <div class="form-group col-md-4">
            <label for="stock">Stock</label>
            <input type="text" class="form-control" id="stock" placeholder="50" name="stock">
        </div>
            <div class="form-group col-md-4">
                <label for="dateAchat">Stock</label>
                <input type="date" class="form-control" id="dateAchat" placeholder="50" name="dateAchat">
            </div>
        </div>
        <div>
            <label for="image" class="form-label">Image</label>
            <input type="file" name="image" class="form-control" id="image"/>
        </div>
        <button type="submit" class="btn btn-primary">Validation</button>
    </form>
</div>
</div>
</body>
</html>
