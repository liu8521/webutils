<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>	
    <title>My JSP 'listcetscore.jsp' starting page</title>  
	
  </head>
  <body>
		<h2>查询结果</h2>
	<ul>
		
		<li><span>姓名：     </span>${score.name }</li>
		<li><span>学校：     </span> ${score.school }</li>
		<li><span>类别：     </span> ${score.category }</li>
		<li><span>准考证号：	</span> ${score.examnumber }</li>
		<li><span>考试时间：	</span> ${score.testTime }</li>
		<li><span>总分：     </span> ${score.totalScore }</li>
		<li><span>听力：     </span> ${score.listen }</li>
		<li><span>阅读：     </span>  ${score.reading }</li>
		<li><span>翻译：     </span> ${score.translate }</li>
	</ul>
    <h3><s:property value="exception.message"/></h3>
    <h1>重新查询</h1>
    <p>仅限查询2014年6月全国大学英语四、六级考试查询</p>
     <s:form action="getCetScore">
     	<s:textfield name="number" label="准考证号"/>
     	<s:textfield name="name" label="姓名"/>
		<s:submit value="查询"/>
	</s:form>

  </body>
</html>
