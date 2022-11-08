

<%@page import="otpaction.OTPAction"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <%
       String mobile= request.getParameter("regmob");
      OTPAction ac=new OTPAction();
       
   
        int apiotp=ac.sendSms(mobile);
       
       session.setAttribute("mobile", mobile);
       session.setAttribute("otp", apiotp);
          if(apiotp!=0)
       {
           response.sendRedirect("varifyotp.jsp");
       }
        
        %>
        
    </body>
</html>
