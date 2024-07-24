<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Chars</title>
    <link rel="stylesheet" href="css/tt.css">
    <link rel="stylesheet" href="css/zzsc.css">
</head>
<body>
<div class="top">
    <span class="top-left">Download</span>
    <span class="top-left">Shanghai</span>
    <span class="top-right">More</span>
</div>

<div class="container">

    <div class="left">
        <a>
            <img src="img/logo.png"><br/>
        </a>

        <ul>
            <li>
                <a class="channel-item active" href="#">
                    <span>
                        Recommend
                    </span>
                </a>
            </li>

            <li><a class="channel-item" href="#">
                <span>
                    Video
                </span>
            </a></li>
            <li><a class="channel-item" href="#">
                <span>
                    Chat
                </span>
            </a></li>
        </ul>

    </div>
    <div class="center">
        <ul class="news_list">

        </ul>

        <div class="content">
            <div class="pagination-holder clearfix">
                <div id="light-pagination" class="pagination"></div>
            </div>
        </div>

    </div>
</div>
</body>
<script src="js/jquery-3.3.1.min.js"></script>
<script src="js/jquery.simplePagination.js"></script>
<script>
    let start = 1;
    let pageSize = 10;

    queryByPage(start,pageSize);

    function queryByPage(start,pageSize) {
        $.ajax({
            // url:"newsServlet",
            url:"newsServlet1",
            data:{"start":start,"pageSize":pageSize},
            type:"POST",
            dataType:"json",
            success:function (pageInfo) {
                let titles = "";
                for(let i = 0; i < pageInfo.list.length; i++) {
                    titles += "<li>\n" +
                        "                <div class=\"title-box\">\n" +
                        "                    <a href=\"#\" class=\"link\">\n" +
                        pageInfo.list[i].title +
                        "                        <hr>\n" +
                        "                    </a>\n" +
                        "                </div>\n" +
                        "            </li>";
                }
                $(".news_list").html(titles);

                $("#light-pagination").pagination({
                    pages:pageInfo.pages,
                    currentPage:pageInfo.pageNum
                });

                $("#light-pagination .page-link").click(function () {
                    let page = $(this).html();
                    if(page === "Prev") {
                        queryByPage(pageInfo.pageNum - 1,pageSize);
                    }else if (page === "Next") {
                        queryByPage(pageInfo.pageNum + 1,pageSize);
                    } else {
                        queryByPage(page,pageSize);
                    }
                });
            }
        });
    }

</script>
</html>