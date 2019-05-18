<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3"
      xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout">

<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <title>k</title>
</head>
<body>

<h1 th:text="#{label.form.title}">Form</h1>

<form action="/" th:th:object="${user}" method="post" enctype="utf8">
    <div>
        <label th:text="#{label.user.firstName}">First name</label>
        <input th:field="*{firstName}"/>

        <p th:each="error: ${#fields.errors('firstName')}"
           th:text="${error}">Validation error.</p>
    </div>

    <div>
        <label th:text="#{label.user.lastName}">last</label>
        <input th:field="*{lastName}"/>

        <p th:each="error : ${#fields.errors('lastName')}"
           th:text="${error}">Validation error</p>
    </div>
    <div>
        <label th:text="#{label.user.email}">email</label>
        <input type="email" th:field="*{email}"/>

        <p th:each="error : ${#fields.errors('email')}"
           th:text="${error}">Validation error</p>
    </div>
    <div>
        <label th:text="#{label.user.password}">password</label>
        <input type="password" th:field="*{password}"/>

        <p th:each="error : ${#fields.errors('password')}"
           th:text="${error}">Validation error</p>
    </div>
    <div>
        <label th:text="#{label.user.confirmPass}">Confirm</label>
        <input type="password" th:field="*{mathingPassword}"/>
    </div>

    <button type="submit" th:text="#{label.form.submit}">Submit</button>

</form>

</body>

</html>