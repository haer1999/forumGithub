<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="entity.*, service.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<jsp:useBean id="teacherService" class="service.TeacherService"></jsp:useBean>
<%
    Teacher teacher = teacherService.select();
%>
<p>Hello</p>
<table>
    <tr>
        <th>学号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>年级</th>
    </tr>
    <%
    %>
    <tr>
        <td><%=teacher.getSid() %></td>
        <td><%=teacher.getName() %></td>
        <td><%=teacher.getAge() %></td>
        <td><%=teacher.getGrade() %></td>
    </tr>
</table>
</body>
</html>