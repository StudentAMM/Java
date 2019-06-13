<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="windows-1251">
    <title>Title</title>
</head>
<body>
<h1>Cards list</h1>
<table>
    <tr>
        <th >Type operation</th>
        <th >Card number</th>
        <th >Detail</th>
        <th >Data</th>
    </tr>
    <#list operations as oper>
        <tr>
            <#--<td><a href="/card/${card.id}">${card.id}</a></td>-->
            <td>${oper.operation}</td>
            <td>${oper.card}</td>
            <td>${oper.descr}</td>
            <td>${oper.date}</td>
        </tr>
    </#list>
</table>

</body>
</html>