<!DOCTYPE html>
<html lang="en">
<head>
    <title>Digital Kachevnik</title>
</head>
<body>
<h1><b>Настройки</b></h1><br><br>
<form action="/user/edit" method="post">
    Имя пользователя: <input type="text" name="name" value="${user.name}"><br><br>
    Эл. почта: <input type="email" name="email" value="${user.email}"><br><br>
    Номер телефона: <input type="text" name="phoneNumber" value="${user.phoneNumber}"><br></br>
    <input type="hidden" name="id" value="${user.id}">
    <input type="hidden" name="_csrf" value="${_csrf.token}"> <!-- токен для защиты -->
    <input type="submit" value="Сохранить изменения">
</form>
</body>
</html>