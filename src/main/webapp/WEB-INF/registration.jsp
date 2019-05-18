<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<html>

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