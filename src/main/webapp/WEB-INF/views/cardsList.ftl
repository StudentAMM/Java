<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<h1>Cards list</h1>
<table>
    <tr>
        <th>Id</th>
        <th>FIO</th>
        <th>balance</th>
    </tr>
<#list cards as card>
    <tr>
        <td><a href="/card/${card.id}">${card.id}</a></td>
        <td>${card.FIO}</td>
        <td>${card.balance}</td>
        <td><a href="/delete/${card.id}">Delete</a></td>
        <td><a href="/update/${card.id}">Update</a></td>
        <td><a href="/card/history/${card.id}">history</a></td>
    </tr>
</#list>
</table>

<a href="/addcard">Create card</a>
</body>
</html>