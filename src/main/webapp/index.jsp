<%@ page contentType="text/html; charset=utf-8"%>
<!doctype html>
<html>
 <head>
 <title>myJSP</title>
 </head>
 <body>
	<form action="/api/user/register" method="post">
		<h1>注册</h1>
		手机号码<input type="text" name="phone"/>
		密码<input type="text" name="password"/>
		验证码<input type="text" name="code"/>
		<input type="submit" value="提交"/>
	</form>
	<form action="/api/user/getVerifyCode" method="post">
		<h1>获取验证码</h1>
		手机号码<input type="text" name="phone"/>
		<input type="submit" value="提交"/>
	</form>
	<form action="/api/user/noteLogin" method="post">
	 	<h1>短信登录</h1>
		手机号码<input type="text" name="phone"/>
		验证码<input type="text" name="code"/>
		<input type="submit" value="提交"/>
	</form>
	<form action="/api/user/pwdLogin" method="post">
		<h1>密码登录</h1>
		手机号码<input type="text" name="phone"/>
		密码<input type="text" name="password"/>
		<input type="submit" value="提交"/>
	</form>
	<form action="/api/user/forgetPwd" method="post">
	 	<h1>忘记密码</h1>
		手机号码<input type="text" name="phone"/>
		验证码<input type="text" name="code"/>
		密码<input type="text" name="password"/>
		<input type="submit" value="提交"/>
	</form>
	<form action="/api/user/reLogin" method="post">
	 	<h1>退出登录</h1>
		<input type="text" name="token"/>
		<input type="submit" value="提交"/>
	</form>
 </body>
</html>
