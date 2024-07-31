<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Chars</title>
</head>
<body>
    <h1>Insert account</h1>
    <form name="accountForm" action="${pageContext.request.contextPath}/account/save" method="post">
        Account name: <input type="text" name="name"/><br>
        Account money: <input type="text" name="money"/><br>
        <input type="submit" value="Save"><br>
    </form>
</body>
<script src="js/jquery-3.3.1.min.js"></script>
<script>

</script>
</html>