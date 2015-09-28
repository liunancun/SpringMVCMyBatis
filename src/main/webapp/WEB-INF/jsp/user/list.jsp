<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户列表</title>
<style type="text/css">
table {
	font-family: verdana, arial, sans-serif;
	font-size: 12px;
	color: #333333;
	width: 100%;
	border-collapse: collapse;
}

table th {
	padding: 8px;
	border-width: 1px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}

table td {
	padding: 8px;
	border-width: 1px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}

button {
	margin-right: 8px;
}
</style>
</head>
<body>
	<a href="initAdd.action"><button>添加</button></a>
	<table>
		<tr>
			<th width="20%">编号</th>
			<th>名字</th>
			<th>性别</th>
			<th>年龄</th>
			<th>描述</th>
			<th>操作</th>
		</tr>
		<c:forEach var="user" items="${users }">
			<tr>
				<td>${user.id }</td>
				<td>${user.name }</td>
				<td>${user.sex }</td>
				<td>${user.age }</td>
				<td>${user.desc }</td>
				<td>
					<a href="initEdit.action?id=${user.id }"><button>编辑</button></a>
					<a href="delete.action?id=${user.id }"><button>删除</button></a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>