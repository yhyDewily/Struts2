<%--
  Created by IntelliJ IDEA.
  User: Dewily
  Date: 2018/4/22
  Time: 0:54
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Hello World</title>
</head>
<body>
<h1>Hello World From Struts2</h1>
<form action="hello">
    <label for="name">Please enter your name</label><br/>
    <input type="text" name="name"/>
    <input type="submit" value="Say Hello"/>
</form>
</body>
</html>
