<%-- 
    Document   : manager_category
    Created on : Dec 22, 2017, 12:34:30 AM
    Author     : trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Manager product</title>
        <c:set var="root" value="${pageContext.request.contextPath}"/>
        <link href="${root}/css/mos-style.css" rel='stylesheet' type='text/css' />
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>
        <div id="wrapper">
            <jsp:include page="menu.jsp"></jsp:include>
            <div id="rightContent">
                <h3>Sản phẩm</h3>
	
                    <table class="data">
			<tr class="data">
                            <th class="data" width="30px">STT</th>
                            <th class="data">Tên sản phẩm</th>
                            <th class="data">Mã sản phẩm</th>
                            <th class="data">Giá bán</th>
                            <th class="data" width="75px">Tùy chọn</th>
			</tr>
			<tr class="data">
                            <td class="data" width="30px">1</td>
                            <td class="data">Data Anda</td>
                            <td class="data">Data Anda</td>
                            <td class="data">Data Anda</td>
                            <td class="data" width="75px">
                                <center>
                                    <a href="#"><img src="../img/oke.png"></a>&nbsp;&nbsp;&nbsp;
                                    <a href="#"><img src="../img/detail.png"></a>
                                </center>
                            </td>
			</tr>
		</table>
            </div>
            <div class="clear"></div>
            <jsp:include page="footer.jsp"></jsp:include>
        </div>
    </body>
</html>
