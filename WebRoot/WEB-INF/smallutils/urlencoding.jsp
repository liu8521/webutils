<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>	
    <title>My JSP 'urlencoding.jsp' starting page</title>  
	
  </head>
  <body>
	<h3>请输入要转换的内容</h3>
	<s:form>
	    <s:textarea name="donttransfer"rows="5" value="请输入内容"/>
	    <s:submit value="提交" />
    </s:form>
	<h3>转换结果</h3>
    <s:form>
	    ${alreadytransfer }
    </s:form>
  </body>
</html>
