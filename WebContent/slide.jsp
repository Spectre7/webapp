<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="/struts-tags"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:form action="InsertSlide">
	<c:textfield name="title" label="Title"></c:textfield>
	<c:textarea name="body" label="Body"></c:textarea>
	<c:submit value="submit"></c:submit>
</c:form>


</body>
</html>