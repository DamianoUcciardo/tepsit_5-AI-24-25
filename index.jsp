<%@ page import="java.time.LocalDate" %>
<html>
<body>
<h2><%= "Benvenuto Utente Curioso, questo è la mia prima JSP" %></h2>
<p><a href="Autore.jsp">Autore</a></p>	
<p>Oggi è il giorno <%= LocalDate.now() %></p>
</body>
</html> 