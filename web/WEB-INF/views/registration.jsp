<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>

<style>
    .chart-content {
        padding-left: 25px;
    }

</style>
<div class="chart-content">
    <p><font color="#006400">${welcomeText}</font></p>
    <form action="/registration" method="post">
        Enter your name <input class="form" type="text" name="username"/><br/><br/>
        Enter your password <input class="form" type="password" name="userpassword"/> <br/><br/>
        <input class="btn-success btn" type="submit" value="sign up"/>
    </form>
    <p><font color="red">${errorMessage}</font></p>
</div>
<%@ include file="../common/foooter.jspf" %>