<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
Servlet example
<head>
    <title>JSP - Char Servlet</title>
</head>
<body>
<h1><%= "Char Servlet" %>
</h1>
<br/>
<a href="char-servlet">Char Servlet</a><br><br>

<a href="${pageContext.request.contextPath}/charServlet1">Char Servlet 1</a><br><br>

<h1><%= "Ajax1: js" %></h1>
<h2><%= "Register" %></h2>
<jsp:include page="e_ajax_1_native_js.jsp"/><br><br>

<h1><%= "Ajax2: jQuery" %></h1>
<h2><%= "Register" %></h2>
<jsp:include page="e_ajax_2_jquery.jsp"/>


<h1><%= "Ajax4: Search" %></h1>
<h2><%= "Search" %></h2>
<jsp:include page="e_ajax_4_search.jsp"/>

<h1><%= "Ajax5: Paging" %></h1>
<h2><%= "Paging" %></h2>
<jsp:include page="e_ajax_5_paging.jsp"/>


</body>
</html>