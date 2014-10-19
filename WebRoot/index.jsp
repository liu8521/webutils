<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<style type="text/css">
		body{
			background: #fccc;
		}
		ul{
			margin-left: 80px;
			margin-top: 150px;
		}
		li{
			margin: 2em auto;
		}
		a{
			text-decoration: none;
			border: solid 1px;
			padding:0.4em 0.8em;
			color:#444;
			background: #f99;
			border-color: #fff #aaab9c #aaab9c #fff;
			zoom:1;
		}
		a:hover{
			color:#800000;
			background: transparent;
			border-color: #aaab9c #fff #fff #aaab9c;
		}
}
	</style>
</head>
<body>
	<ul>	
		<!-- 查询集 -->
		<li><a href="${pageContext.request.contextPath}/findWeather?city=%D7%CD%B2%A9">查询天气</a></li>
		<li><a href="${pageContext.request.contextPath}/findCetScore">查询四六级成绩</a></li>
		<li><a href="${pageContext.request.contextPath}/findLibrary">查询图书馆信息</a></li>
		
		<!-- 小工具集查询 -->
		<li><a href="${pageContext.request.contextPath}/urlEncoding">URL编码</a></li>
		<li><a href="${pageContext.request.contextPath}/native2Ascii">Native2Ascii编码</a></li>
	</ul>		
  </body>
</html>
