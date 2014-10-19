<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>	
    <title>My JSP 'findcetscore.jsp' starting page</title>  
	
  </head>
  <body>
  
  	<h1>四六级查询</h1>
	<s:form action="=getCetScore">
    	<s:textfield name="number" label="准考证号"/>
    	<s:textfield name="name" label="姓名"/>
   		<s:submit value="查询"/>
    </s:form>

  </body>
</html>
