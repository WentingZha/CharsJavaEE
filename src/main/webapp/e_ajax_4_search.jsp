<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Ajax Search</title>
    <style type="text/css">
        .content {
            width: 643px;
            margin: 100px auto;
            text-align: center;
        }

        input[type='text'] {
            width: 530px;
            height: 40px;
            font-size: 14px;
        }

        input[type='button'] {
            width: 100px;
            height: 46px;
            background: #38f;
            border: 0;
            color: #fff;
            font-size: 15px
        }

        .hint {
            position: absolute;
            margin-left: 51px;
            width: 535px;
            height: 100px;
            border: 1px solid #999;
            border-top: 0;
            display: none;
        }
    </style>
</head>
<body>
<form autocomplete="off">
    <div class="content">
        <input type="button" id="searchBtn" value="searchBtn"/><br>
        <label for="userName2"></label><input type="text" id="userName2"/><br>
        <div id="hint" class="hint"></div>
    </div>
</form>
</body>
<script src="js/jquery-3.3.1.min.js"></script>
<script>
        $("#searchBtn").click(function () {
            let userName = $("#userName2").val();
            if(userName == null || userName === "") {
                $("#hint").hide();
                return;
            }
            $.ajax({
                url: "searchServlet",
                data: {"userName":userName},
                type: "POST",
                dataType: "json",
                success: function (data) {
                    let names = "";
                    for (let i= 0;i<data.length;i++) {
                        names += "<div>"+data[i].name+"</div>";
                    }
                    $("#hint").html(names).show();
                }
            });
        });
</script>
</html>