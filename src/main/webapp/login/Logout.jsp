<html>
<head><title>Wicket Project Sample for RBAC</title></head>
<body>
  <%session.invalidate();%>
  <%
  HttpServletResponse res = (HttpServletResponse) response;
  res.sendRedirect("/fortress-wicket");
  %>
</body>
</html>