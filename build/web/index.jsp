<%-- 
    Document   : index
    Created on : Feb 16, 2018, 4:33:01 PM
    Author     : Administrator
--%>

<%@page import="eFarm.SqlConnection"%>
<%@page import="eFarm.Controller"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import=" java.util.Date" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <title>Home</title>
    </head>
    <body>

        <br><br><br>
    <di id="Content">
    <center><h1>Login here</h1></center>
   <br><br>
   <form action="Controller" method="POST">
            <table  align="Center">
               
                    <tr>
                        <th align="Right">User Name:</th>
                        <td><input type="text" name="txtUsername" placeholder="Username"></td>
                      
                    </tr>
                
                    <tr>
                        <th align="Right">Password:</th>
                        <td><input type="password" name="txtPassword" placeholder="password"></td>
                    </tr>
                    <tr>
                        <td colspan="4" align="right"><input type="submit" Value="Login" class="btn btn-primary"></td>
                        <td></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </di>
    </body>
</html>
--%>