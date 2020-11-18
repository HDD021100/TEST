<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<meta http-equiv="refresh" content="url=show-student.action" />-->          
        <title>Show Student</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <body style="width: 80%; margin: 0 auto;">
        <h1>List Student</h1> 
        <form action ="new-student.jsp">
            <input class="btn" type="submit" value="Add New Student"> 
        </form></br>
        <table class="striped">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>Date of birth</th>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <s:iterator value="listStudents">
                <tr>
                    <td><s:property value="Id"/> </td>
                    <td><s:property value="Name"/></td>
                    <td><s:property value="Gender"/></td>
                    <td><s:property value="DOB"/></td>
                    <td>
                        <s:form action="delete">
                            <s:hidden name="Id" value="%{Id}"/>
                            <s:submit cssClass="btn light-blue accent-3" value="Delete"/>
                        </s:form>
                    </td>
                    <td>
                        <s:form action="updateForm">
                            <s:hidden name="Id" value="%{Id}"/>
                            <s:hidden name="Name" value="%{Name}"/>
                            <s:hidden name="Gender" value="%{Gender}"/>
                            <s:hidden name="DOB" value="%{DOB}"/>
                            <s:submit cssClass="btn light-blue accent-3" value="Update"/>
                        </s:form>
                    </td>
                </tr>
            </s:iterator>                
            </tbody>
            
        </table> 
        <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

    </body>
</html>
