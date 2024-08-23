<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>primeiro projeto sem composer</h1>

    <form action="index.php" method="get">
        <label for="nome">Nome:</label>
        <input type="text" name="nome" id="nome">
        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha">
        <input type="submit" name="submit" value="Enviar">
    </form>
    <?php
    $nome_recebido = $_GET['nome'];
    echo "<h2>Olá, $nome_recebido</h2>"; 
    ?>
</body>
</html>