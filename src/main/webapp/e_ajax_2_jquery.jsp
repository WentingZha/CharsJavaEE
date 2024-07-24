<!DOCTYPE html>
<html lang="en">
<%--
    $.get(url,[data],[callback],[type])
    $.post(url,[data],[callback],[type])
    url: remote resource path
    data: requester parameter, the format is key=value or js object
    callback: the callback function of a request
    type: returned value type, can be xml, html, js, json, text...

    $ajax({name:value,name:value,...});
    usr: remote resource path
    async: true,false
    data: requester parameter, the format is key=value or js object
    type: default is GET, POAT is also accepted
    dataType: returned value type, can be xml, html, js, json, text...
    success: the callback function of a successful request
    error: the callback function of an error request
--%>
<head>
    <meta charset="UTF-8">
    <title>Ajax jquery</title>
</head>
<body>
<form autocomplete="off">
    Name: <input type="text" id="userName1">
    <span id="registerSpan1"></span>
    <br>
    Password:<input type="password" id="password">
    <br>
    <input type="submit" id="checkName1" value="checkName1"><br><br>
</form>
</body>
<script src="js/jquery-3.3.1.min.js"></script>
<script>


   $("#checkName1").click(function () {
       let userName = $("#userName1").val();
       // $.get(
       //     //Request resource path
       //     "userServlet",
       //     "userName="+ userName,
       //     function (data) {
       //         // $("#registerSpan1").html(data);
       //         alert(data);
       //     },
       //     "text"
       // );

       // $.post(
       //     //Request resource path
       //     "userServlet",
       //     "userName="+ userName,
       //     function (data) {
       //         // $("#registerSpan1").html(data);
       //         alert(data);
       //     },
       //     "text"
       // );

       $.ajax({
           url:"userServlet",
           // async: true,
           data: "userName="+ userName,
           type: "GET",
           dataType:"text",
           success: function (data){
               alert(data);
           },
           error:function () {
               alert("Service error");
           }
       });
   });

    // let submitBtn = document.getElementById("checkName");
    // submitBtn.onclick = checkName;
    // document.getElementById("useName").onblur = checkName;

</script>
</html>