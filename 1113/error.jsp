<%@ page contentType="text/html;charset=UTF-8"%>
<% String title = "サーバーサイトJAVAの学習";
%>


<!DOCYTPE html>
<html> 
<head>
<title> <%=title %></title>
<body style="background-color:ghostwhite;">
<%
for (int i = 0; i < 25; i++) {
	if (i % 2 == 0) {
	out.println("<p style=\"padding-top:1%;padding-bottom:1%;background-color:lightblue;color:red;font-weight:bolder;\">");  
	out.println(title + "</p>");
	continue;
}

	if (i % 3 == 0 && i % 2 != 0) {
	out.println("<p style=\"background-color:green;color:white;font-weight:bolder;\">");  
	out.println(title + "</p>");
	continue;

	}	
	out.println("<p style=\"background-color:silver;color:black;font-weight:bolder;\">");  
	out.println(title + "</p>");

}

%>
</body>

</html>
