<%-- 
    Document   : Home
    Created on : Feb 19, 2018, 11:33:36 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <title>eDairy|HomePage</title>
    </head>
    <body>
        <div class="jumbotron" style="background: url('images/Logo1.jpg')no-repeat;background-size: cover; height: 300px;"></div>
        <div class='container-fluid'>
            <div class="row">
             
                       
                        <div class="col-md-3">
                            <div class="list-group">
                                <a href="" class="list-group-item active">Employees Management</a>
                                 <a href="" class="list-group-item ">New Member</a>
                                  <a href="" class="list-group-item ">Members List</a>
                                   <a href="" class="list-group-item ">Member</a>
                                    <a href="" class="list-group-item ">New Member</a>
                            </div>
                            <div class="list-group">
                                <a href="" class="list-group-item active">Employees Management</a>
                                 <a href="" class="list-group-item ">New Member</a>
                                  <a href="" class="list-group-item ">Members List</a>
                                   <a href="" class="list-group-item ">Member</a>
                                    <a href="" class="list-group-item ">New Member</a>
                            </div>
                        </div>
                <div class="col-md-8">
                    <div class="card">
                        <div class="card-body" style="background-color: #3498DB;color:#ffffff;">
                            <h4>Add New Staff</h4>
                        </div>
                        <div class="card-body">
                            <form class="form-group" action="Users_Controller" method="POST">
                                <label>Full Names:</label>
                                <input type="Text" class="form-control" name="FullNames">
                                 <label>Staff Number:</label>
                                <input type="Text" class="form-control" name="EmpNo">
                                 <label>Telephone:</label>
                                <input type="Text" class="form-control" name="Telephone"><p></p>
                                 <label>Email:</label>
                                <input type="Email" class="form-control" name="Email"><br>
                                 <label>Password:</label>
                                <input type="password" class="form-control" name="Password"><br>
                                 <label>Confirm Password:</label>
                                <input type="password" class="form-control" name="ConfirmPassword"><br>
                                  <label>Gender:</label>
                                <select class="form-control">
                                    <option value="Male">Male</option>
                                    <option value="Female">Female</option>
                                </select><br>
                                 <label>Expiry Date:</label>
                                <input type="date" class="form-control" name="ExpryDate"><br>
                                 <label>Date of Birth:</label>
                                <input type="date" class="form-control" name="DOB"><br>
                                 <label>Is Active:</label>
                                <input type="checkbox" name="IsActive" value="Is Active" class="checkbox-big"> <br>
                                 <label>Is Admin:</label>
                                  <input type="checkbox" name="IsAdmin" value="Is Admin" class="checkbox-big"> <br>
                                <input type="submit" name="" value="Add New Staff" class="btn btn-primary">
                                
                            </form>
                        </div>
                    </div>
                </div>
                        <div class="col-md-1"></div>
                </div>
            </div>
      
        
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    </body>
</html>
