<%--
  Created by IntelliJ IDEA.
  User: wen ting zha
  Date: 18/4/2024
  Time: 3:48pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="com.zwt.charsjavaee.Book" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Expression language</title>
</head>
<body>
    Java: <% request.setAttribute("username","wentingzha");%>
    <% PrintWriter pw = response.getWriter();
        pw.println(request.getAttribute("username"));
    %><br>

    JSP:<%=request.getAttribute("username")%><br>

    EL:${username}<br>

    Basic data type: <% request.setAttribute("num",1);%>
    ${num}<br><br>

    Object:<%
        Book book = new Book("mathematical analysis",1);
//        book = null;//Null pointer exception won't be thrown in EL
        request.setAttribute("book",book);
    %>
    ${book}<br>
    Book name:${book.title}<br>
    Book chapter:${book.chapter}<br><br>

    Array:<%
        String[] chapters = {"chapter1","chapter2"};
        request.setAttribute("chapters",chapters);
    %>
    ${chapters}<br>
    ${chapters[0]}<br>
    ${chapters[1]}<br>
    ${chapters[2]}<br><br><%--IndexOutOfBounderExcetion won't be thrown in EL--%>

    List:<%
        ArrayList<String> chapterList = new ArrayList<>();
        chapterList.add("chapter3");
        chapterList.add("chapter4");
        request.setAttribute("chapterList",chapterList);
    %>
    ${chapterList}<br>
    ${chapterList[0]}<br>
    ${chapterList[1]}<br><br>

    Map:<%
        HashMap<String,Book> map = new HashMap<>();
        map.put("book1",new Book("mathematical analysis",1));
        map.put("book2",new Book("変な家 Hen na ie",2));
        request.setAttribute("map",map);
    %>
    ${map}<br>
    ${map.book1.title}<br>
    ${map.book2.chapter}<br><br>

    Empty Operator:
    <%
        String str1 = null;
        int[] arr = {};
    %>
    ${empty str1}<br>
    ${empty arr}<br><br>

    Example-Check the Default language in the system:<% request.setAttribute("language","Java");%>
    <label>
        <input type="radio" name="language" value="Java" ${language == "Java" ? "checked" : ""}>Java
    </label>
    <label>
        <input type="radio" name="language" value="C"  ${language == "C" ? "checked" : ""}>C
    </label><br><br>

    <%
        session.setAttribute("book1","mathematical analysis");
        application.setAttribute("book2","Effective Java");
    %>
    ${book1}<br>
    ${book2}<br><br>

    <%= request.getContextPath()%><br><br>

    <% request.setAttribute("username","Man Ting Caa");%>
    ${username}<br>
    ${requestScope.username}<br>
    ${header}<br>
    ${header["connection"]}<br>
    ${headerValues}<br>

    <%--http://localhost:1080/ChallengeJavaWeb_war_exploded/c_el.jsp?username=caamanting&hobby=programming&hobby=reading--%>
    ${param.username}<br>
    ${paramValues.hobby[0]}<br>
    ${paramValues.hobby[1]}<br><br>

    Set global params in web.xml file:${initParam["developerName"]}<br>
    ${cookie}<br>
    ${cookie.JSESSIONID}<br>
    ${cookie.JSESSIONID.name}<br>
    ${cookie.JSESSIONID.value}<br>


</body>
</html>
