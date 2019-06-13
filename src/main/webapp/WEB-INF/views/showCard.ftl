<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>card INfo</title>
</head>
<body>
<h1>card info</h1>
<table>
    <tr>
        <td>Id</td>
        <td>${card.id}</td>
    </tr>
    <tr>
        <td>FIO</td>
        <td>${card.FIO}</td>
    </tr>
    <tr>
        <td>balance</td>
        <td>${card.balance}</td>
    </tr>
</table>
<a href="/put/${card.id}">Put money</a>
<a href="/out/${card.id}">Get money</a>
<br>
<a href="/cards">Back</a>
</body>
</html>