<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ajax js</title>
</head>
<body>
    <form autocomplete="off">
        Name: <input type="text" id="userName">
<%--        <span id="validSpan" hidden="hidden">Valid</span>--%>
<%--        <span id="invalidSpan" hidden="hidden">Invalid</span>--%>
        <span id="registerSpan"></span>
        <br>
        Password:<input type="password" id="password">
        <br>
        <input type="submit" id="checkName" value="checkName"><br><br>
    </form>
</body>
<script src="js/jquery-3.3.1.min.js"></script>
<script>

    function checkName(){
        let xmlHttp = new XMLHttpRequest();
        //Open link
        let userName = document.getElementById("userName").value;
        xmlHttp.open("GET","userServlet?userName="+userName,true);
        //Send request
        xmlHttp.send();
        //Handle response
        //0- not initialized
        //1- server connection is established
        //2- request is accepted
        //3- handling request
        //4- request is finished and response is ready to send
        //responseText: String type response
        //responseXml: xml type response
        xmlHttp.onreadystatechange = function (){
            if ( xmlHttp.readyState === 4 && xmlHttp.status === 200) {
                //Write the successful result to <span id='registerSpan'></span>
                document.getElementById("registerSpan").innerHTML = xmlHttp.responseText;
               alert(xmlHttp.responseText)
            }
        }
    }

    let submitBtn = document.getElementById("checkName");
    submitBtn.onclick = checkName;


    // document.getElementById("useName").onblur = checkName;

</script>
</html>