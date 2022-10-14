<%@ page import="java.util.ArrayList" %>
<%@ page import="ua.com.alevel.model.Request" %>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>hw18</title>
</head>

<body>
<%ArrayList<Request> repository = (ArrayList<Request>) request.getAttribute("req-repo");%>
<table>
    <tr>
        <th>IP</th>
        <th>User-agent</th>
        <th>Date</th>
    </tr>
    <% for (Request req : repository) { %>
    <tr>
        <td><%out.println(req.getIp()); %></td>
        <td><%out.println(req.getUserAgent()); %></td>
        <td><%out.println(req.getCreated()); %></td>
    </tr>
    <%}%>
</table>
</body>
</html>