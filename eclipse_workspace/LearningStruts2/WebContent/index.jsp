<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <h1>Hello World From Struts2</h1>
        <form action="hello">
            <label for="name">Please enter your name</label><br/> 
            <input type="text" name="name" /> 
            <input type="submit" value="Say Hello" />
        </form>
    </body>
</html>