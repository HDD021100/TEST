<%-- 
    Document   : new-student
    Created on : Nov 6, 2020, 7:44:11 AM
    Author     : NMDSE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>New Student</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">-->
        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
        <s:head/>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <a href="new-student.jsp"></a>
                    <div class="card">
                        <div class="card-content">
                            <h3 style="margin-top: 10px;" class="center-align">Add New Student</h3>
                            <div class="form center-align">
                                <s:form action="add-new" method="post">
                                    <s:textfield name="Name" label="Name"/>
                                    <s:radio list="#{'true':'Male','false':'Female'}" name="Gender" label="Gender" value="true"/>                   
                                    <s:textfield name="DOB" label="DOB"/>
                                    <s:submit cssClass="btn light-blue accent-3" value="ADD"/>
                                </s:form>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
