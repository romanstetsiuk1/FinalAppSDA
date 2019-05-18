<!DOCTYPE html>
<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<body>
<form action="addEvent" method="post">

    <label>Temat:</label>
    <input type="text" name="theme"><br>

    <label>Lokalizacja:</label>
    <input type="text" name="location"><br>

    <label>Rozpoczęcia:</label>
    <input type="datetime-local" name="date_time_start"><br>

    <label>Zakończenia:</label>
    <input type="datetime-local" name="date_time_end"><br>

    <input type="submit" value="Dodaj">
</form>
</body>
</html>
