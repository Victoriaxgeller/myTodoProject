<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<div class="container">

    <font color="blue" size="12px"> Welcome ${username}</font></br>
    <p><font class="blue"> ${successRegistration}</font></p>

    <table class="table table-striped">
        <caption>Your Todo's are:</caption>

        <thead>
        <th>Description</th>
        <th>Category</th>
        <th>Actions</th>
        </thead>

        <tbody>
        <c:forEach items="${todos}" var="todo">

            <tr>
                <td>${todo.name}</td>
                <td>${todo.category}</td>
                <td>${todo.todo_id}</td>
                <td> &nbsp;&nbsp; <a class="btn btn-danger"
                                     href="/delete/todo?todo=${todo.name}&category=${todo.category}&todo_id=${todo.todo_id}">Delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
        <p><font class="red">${errorMessage}</font></p>
    </table>

    <a class="btn btn-success" href="/add/todo">Add new Todo</a>
</div>

<%@ include file="../common/foooter.jspf" %>