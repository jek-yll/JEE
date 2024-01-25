<%@taglib prefix="c" uri="jakarta.tags.core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h2>Se connecter</h2>
    <form action="" method="post" >
        <div class="mb-3">
            <label for="username" class="form-label">Nom d'utilisateur :</label>
            <input type="text" class="form-control" id="username" name="username"/>
        </div>
        <div class="mb-3">
            <label for="password" class="form-label" >Mot de passe :</label>
            <input type="password" class="form-control" id="password" name="password"/>
        </div>
        <button type="submit" class="btn btn-primary">connection</button>
    </form>
</div>
</body>
</html>
