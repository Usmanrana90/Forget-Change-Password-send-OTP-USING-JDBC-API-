
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
        String uotp=request.getParameter("otp");
        
        int apiotp=(Integer)session.getAttribute("apiotp");
        String mobile=(String)session.getAttribute("mobile");
        int userotp=Integer.parseInt(uotp);
        if(userotp==apiotp)
        {
            response.sendRedirect("NewPassword"); 
        }
        
        %>
    </body>
</html>
