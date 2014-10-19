<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>	
    <title>图书馆借书查询</title>  
	
  </head>
  <body>

    <h1>图书馆借书查询</h1>
	<s:form action="=getLibrary">
    	<s:textfield name="number" label="学号"/>
    	<s:password name="password" label="密码"/>
   		<s:submit value="查询"/>
    </s:form>

  </body>
</html>
