<%-- 
    Document   : NavPage
    Created on : Apr 12, 2018, 11:28:04 AM
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!doctype html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Accordion - Fill space</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <style>
  #accordion-resizer {
    padding: 10px;
    width: 350px;
    height: 220px;
  }
  </style>
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( "#accordion" ).accordion({
      heightStyle: "fill"
    });
 
    $( "#accordion-resizer" ).resizable({
     //minHeight: 140,
      minWidth: 200,
      resize: function() {
        $( "#accordion" ).accordion( "refresh" );
      }
    });
  } );
  </script>
</head>
<body>
 
<h3 class="docs">Resize the outer container:</h3>
 
<div id="accordion-resizer" class="ui-widget-content">
  <div id="accordion">
    <h3>Home</h3>
    <div>
        <ul>
            <li><a href="" class="list-group-item active">Employees Management</a></li>
         <li><a href="" class="list-group-item ">New Member</a></li>
          <li><a href="" class="list-group-item ">Members List</a></li>
          <li> <a href="" class="list-group-item ">Member</a></li>
          <li>  <a href="" class="list-group-item ">New Member</a></li>
            </ul>
    </div>
    <h3>Users</h3>
    <div>
        <ul>
       <li> <a href="" class="list-group-item active">Employees Management</a></li>
       <li>  <a href="" class="list-group-item ">New Member</a></li>
      <li>    <a href="" class="list-group-item ">Members List</a></li>
    <li>       <a href="" class="list-group-item ">Member</a></li>
    <li>        <a href="" class="list-group-item ">New Member</a></li>
    </ul>
    </div>
    <h3>Section 3</h3>
    <div>
        <ul>
            <li><a href="" class="list-group-item active">Employees Management</a></li>
         <li><a href="" class="list-group-item ">New Member</a></li>
          <li><a href="" class="list-group-item ">Members List</a></li>
          <li> <a href="" class="list-group-item ">Member</a></li>
          <li>  <a href="" class="list-group-item ">New Member</a></li>
            </ul>
      <ul>
        <li>List item one</li>
        <li>List item two</li>
        <li>List item three</li>
      </ul>
    </div>
    <h3>Section 4</h3>
    <div>
      <ul>
            <li><a href="" class="list-group-item active">Employees Management</a></li>
         <li><a href="" class="list-group-item ">New Member</a></li>
          <li><a href="" class="list-group-item ">Members List</a></li>
          <li> <a href="" class="list-group-item ">Member</a></li>
          <li>  <a href="" class="list-group-item ">New Member</a></li>
            </ul>
    </div>
  </div>
</div>
 
 
</body>
</html>
