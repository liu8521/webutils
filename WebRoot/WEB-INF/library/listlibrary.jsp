<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>	
    <title>图书馆借书查询</title>  
	
  </head>
  <body>

	<h2>图书馆借书查询</h2>
   <table border="1px">
   		<tr>
   			 <td>条码号</td>
             <td>书名</td>
             <td>责任者</td>
             <td>借书日期</td>
             <td>应还日期</td>
             <td>馆藏地</td>
   		</tr>
        <s:iterator value="booklist"
                    var="item">
            <tr>
                <td>${item.barcode }</td>
                <td>${item.bookname }</td>
                <td>${item.author }</td>
                <td>${item.borrowdate }</td>
                <td>${item.returndate }</td>
                <td>${item.collectplace }</td>
            </tr>
        </s:iterator>
    </table>

 <h1>重新查询</h1>
     <s:form action="getLibrary">
     	<s:textfield name="number" label="学号"/>
     	<s:password name="password" label="密码"/>
		<s:submit value="查询"/>
	</s:form>
  </body>
</html>
