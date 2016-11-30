<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: 举
  Date: 2016/11/30
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <s:iterator value="pageBean.list">
        <tr>
            <td width="13%">
                共<s:property value="pageBean.totalPage"/>页
            </td>
        </tr>

    </s:iterator>
</body>
</html>
