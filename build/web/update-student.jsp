<%-- 
    Document   : updateStudent
    Created on : Jun 17, 2020, 9:51:34 AM
    Author     : MrEnd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <title>Update Student</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">-->

        <!-- Compiled and minified JavaScript -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    </head>

    <body >
        <div class="container">
            <div class="row">
                <div class="col m6 offset-m3">
                    <div class="card">
                        <div class="card-content">
                            <h3 style="margin-top: 10px;" class="center-align">Update</h3>
                            <div class="form center-align">

                                <s:form action="update" method="post">
                                    <s:textfield name="Id" label="ID" value="%{Id}" readonly="true"/>
                                    <s:textfield name="Name" label="Name" value="%{Name}" />
                                    <s:radio list="#{'true':'Male','false':'Female'}" name="Gender" label="Gender" value="%{Gender}" />                   
                                    <s:textfield name="DOB" label="DOB" value="%{DOB}"/>
                                    <s:submit cssClass="btn light-blue accent-3" value="UPDATE"/>
                                </s:form>


                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
