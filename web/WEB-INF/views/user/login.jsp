<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
</head>
<body>
    <h1>로그인</h1>
    <div>${requestScope.msg}</div>
    <form action="/user/login" method="post">
        <div><input type="text" name="userid" placeholder="아이디" value="${requestScope.loginInfo.userid}"></div>
        <div><input type="password" name="userpw" placeholder="비밀번호"></div>
        <div><input type="submit" value="로그인"></div>
    </form>
    <a href="/user/join">회원가입</a>
</body>
</html>