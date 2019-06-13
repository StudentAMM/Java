<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form name="card" action="/put" method="post">
    <input title="Balance" type="text" name="Balance" value="0">
    <input type="submit" value="OK">
    <input title="ID" type="hidden" name="id" value="${card.id}">
    <input title="FIO" type="hidden" name="FIO" value="${card.FIO}">
</form>
</body>
</html>