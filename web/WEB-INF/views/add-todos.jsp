<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
<body>
<div class="container"> Your New Action Item:

    <form action="/add/todo" method="post">
        <fieldset class="form-group">
            <label>Description </label> <input class="form-control" type="text" name="todo"/><br/>
        </fieldset>
        <fieldset class="form-group">
            <label> Category</label> <input class="form-control" name="category" type="text"><br/>
        </fieldset>

        <input class="btn btn-success" type="submit" value="Submit">
    </form>
</div>

<%@ include file="../common/foooter.jspf" %>
