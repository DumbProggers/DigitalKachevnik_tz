<!DOCTYPE html>
<html lang="en">
<head>
  <title>BUYSELL</title>
</head>
<body>
<h1>BUYSELL</h1>
<h4>Регистрация</h4>
<form action="/registration" method="post">
  Имя пользователя: <input type="text" name="name"><br><br>
  Эл. почта: <input type="email" name="email"><br><br>
  Номер телефона: <input type="text" name="phoneNumber"><br></br>
  Пароль: <input type="password" name="password"><br><br>
  <input type="hidden" name="_csrf" value="${_csrf.token}"> <!-- токен для защиты -->
  <input type="submit" value="Зарегистрироваться">
</form>
</body>
</html>