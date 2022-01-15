<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원가입</title>
</head>
<body>
    <h1>회원가입</h1>
    <form action="/user/join" method="post">
        <div><input type="text" name="userid" placeholder="아이디"> </div>
        <div><input type="password" name="userpw" placeholder="비밀번호"> </div>
        <div><input type="text" name="nm" placeholder="이름"> </div>
        <div>
            성별 : <label>여성<input type="radio" name="gender" value="0" checked></label>
            <label>남성<input type="radio" name="gender" value="1"></label>
        </div>
        <div>
            <input type="submit" value="가입">
            <input type="reset" value="초기화">
        </div>
    </form>
</body>
</html>