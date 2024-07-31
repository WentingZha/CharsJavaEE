<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
Servlet example
<head>
    <title>JSP - Char Servlet</title>
</head>
<body>
<h1><%= "Char Servlet" %></h1>
<br/>
<a href="char-servlet">Char Servlet</a><br><br>

<a href="${pageContext.request.contextPath}/charServlet2">Char Servlet 1</a><br><br>

<h1><%= "g1-Servlet1" %></h1>
<a href="${pageContext.request.contextPath}/zhaServlet">Servlet1</a><br><br>

<h1><%= "g2-Servlet2" %></h1>
<a href="${pageContext.request.contextPath}/charge">Servlet2</a><br><br>

<h1><%= "i-Servlet3" %></h1>
<a href="${pageContext.request.contextPath}/save.jsp">Servlet3</a><br><br>

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
<jsp:include page="e_ajax_5_paging.jsp"/><br>


</body>
</html>