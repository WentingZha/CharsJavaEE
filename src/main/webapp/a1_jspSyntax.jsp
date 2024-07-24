<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.ArrayList" %>
<%@ include file="/include.jsp"%>
<%--http://localhost:1080/ChallengeJavaWeb_war_exploded/a_jspSyntax.jsp--%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Syntax</title>
</head>
<body>
    <%--This is comment--%>
    <%--Java code block--%>
    <h1>JSP Syntax</h1>
    <%
        String str = "JSP Syntax";
        System.out.println(str);
        PrintWriter pw = response.getWriter();
        pw.println("JSP Syntax");
    %><br>

    <%--JSP express--%>
    <%="Chapter1"%><br>

    <%--Define q variable or q method
    ! - member variable
    --%>
    <%! String s = "Chapter2";%><br>
    <% String s = "Chapter3";%><br>
    <%=s%><br>
    <%! public void getSum(){}%>
    <%--    <% public void getSum2(){}%>--%>

    <%--Redirect to error page--%>
    <%--    <% int result = 1/0; %>--%>
    <% ArrayList list = new ArrayList();%>
    <%=includedS%>
</body>
</html>