<%@ page import="java.util.ArrayList" %>
<%@ page import="com.zwt.charsjavaee.Student" %><%--
  Created by IntelliJ IDEA.
  User: wentingzha
  Date: 19/4/2024
  Time: 2:15 pm
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student List</title>
</head>
<body>
    <table width="600px" border="1px">
      <tr>
        <th>Student name</th>
        <th>Student age</th>
        <th>Student score</th>
      </tr>
      <%
        ArrayList<Student> students = (ArrayList<Student>) session.getAttribute("students");
        for (Student student : students) {
      %>
        <tr align="center">
          <td><%=student.getName()%></td>
          <td><%=student.getAge()%></td>
          <td><%=student.getScore()%></td>

        </tr>
      <%}%>
    </table>
</body>
</html>
