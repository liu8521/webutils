<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>	
   <style type="text/css">
   		#container{
   			margin: 0;
   			padding: 0;
   		}
   		
   		#m_left {
   			
		    width: 680px;
		    height: 470px;
		}
   </style>
  </head>
  <body>
	<div id="container">
		<div id="m_left">

		    ${weather.city}<br>
		    ${weather.status1}<br>
		    ${weather.status2}<br>
		    ${weather.direction1}<br>
		    ${weather.direction2}<br>
		    ${weather.temperature1}<br>
		    ${weather.temperature2}<br>
		    ${weather.updatetime}<br>
		    ${weather.shuoming1}<br>
		    ${weather.shuoming2}<br>
		    ${weather.shuoming3}<br>
	
		    <s:form action="findWeather">
		    	<s:textfield name="city" label="输入城市重新查询"/>
		    	<s:submit value="确定"/>
		    </s:form>
	    </div>
    </div>
  </body>
</html>