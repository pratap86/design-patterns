<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Details</title>
</head>
<body>
<jsp:useBean id="studentDetails" type="com.pratap.patterns.frontcontroller.StudentVO" scope="request"/>
Student Id:<jsp:getProperty property="id" name="studentDetails"/>
Student Name:<jsp:getProperty property="name" name="studentDetails"/>
</body>
</html>