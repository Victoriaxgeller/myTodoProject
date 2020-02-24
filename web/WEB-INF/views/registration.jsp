<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<style>
    .chart-content {
        padding-left: 25px;
    }

</style>
<div class="chart-content">
    <p><font color=#228b22 size="10px">Register new account</font></p>

    <form action="/registration" method="post">
        Enter your name <input class="form" type="text" name="username"/><br/><br/>
        Enter your password <input class="form" type="password" name="userpassword"/> <br/><br/>
        <input class="btn-success btn" type="submit" value="Submit"/>
    </form>
    <p><font color="red">${errorMessage}</font></p>
</div>
<%@ include file="../common/foooter.jspf" %>