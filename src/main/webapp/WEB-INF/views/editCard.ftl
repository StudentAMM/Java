<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Create card page</title>
</head>
<body>

<form name="card" action="/updatecard" method="post">
    <p>Id</p>
    <input title="ID" type="text" name="id" value="${card.id}">
    <p>FIO</p>
    <input title="FIO" type="text" name="FIO" value="${card.FIO}">
    <p>Balance</p>
    <input title="Balance" type="text" name="Balance" value="${card.balance}">
    <input type="submit" value="OK">
</form>

</body>
</html>