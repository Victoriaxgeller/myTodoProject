<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<style>
    .chart-content {
        padding-left: 25px;
    }


</style>
<div class="chart-content">
    <p><font color="#006400">${welcomeText}</font></p>
    <form action="/login" method="post">
        Enter your name <input class="form" type="text" name="username"/><br/>
        Enter your password <input class="form" type="password" name="userpassword"/> <br/>
        <input class="btn-success btn" type="submit" value="Log in"/>
    </form>
    <p><font color="red">${errorMessage}</font></p>
</div>
<%@ include file="../common/foooter.jspf" %>


