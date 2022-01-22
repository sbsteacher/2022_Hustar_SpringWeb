<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>수정</title>
</head>
<body>
    <a href="/board/list">리스트</a>
    <form action="/board/mod" method="post">
        <input type="hidden" name="iboard" value="${data.iboard}">
        <div><label>제목 : <input type="text" name="title" value="${data.title}"></label></div>
        <div>내용 : <textarea name="ctnt">${data.ctnt}</textarea></div>
        <div><input type="submit" value="수정"></div>
    </form>
</body>
</html>