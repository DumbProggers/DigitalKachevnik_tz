<!DOCTYPE html>
<html lang="en">
<head>
    <title>Digital Kachevnik</title>
</head>
<body>
    <h1><b>DIGITAL KACHEVNIK</b></h1><br>
        Прветствуем<#if user.email??>, ${user.name} <#else>!</#if> <br>
    <#if user.email??>
    <form action="/logout" method="post">
        <input type="hidden" name="_csrf" value="${_csrf.token}">
        <input type="submit" value="Выйти"/> <br><br>
        <b><a href="/user/settings">Настройки</a></b>
    </form>
    <#else>
        <b><a href="/login">Войти</a></b>
    </#if>
</body>
</html>