<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>编辑用户</title>
<style type="text/css">
div {
	padding: 8px;
}

label {
	width: 40px;
	display: inline-block;
}

.pl48 {
	padding-left: 48px;
}

.w200 {
	width: 200px;
}
</style>
</head>
<body>
	<form action="edit.action" method="post">
		<input type="hidden" name="id" value="${user.id }" />
		<div>
			<label>名字</label><input class="w200" name="name" value="${user.name }" />
		</div>
		<div>
			<label>性别</label><input class="w200" name="sex" value="${user.sex }" />
		</div>
		<div>
			<label>年龄</label><input class="w200" name="age" value="${user.age }" />
		</div>
		<div>
			<label>描述</label><textarea class="w200" name="desc" rows="5">${user.desc }</textarea>
		</div>
		<div class="pl48">
			<button type="submit">提交</button>
			<button type="reset">重置</button>
		</div>
	</form>
</body>
</html>