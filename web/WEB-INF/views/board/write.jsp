<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title></title>
</head>
<body>
    <a href="/board/list">리스트</a>
    <form action="/board/write" method="post">
        <div><label>제목 : <input type="text" name="title"></label></div>
        <div>내용 : <textarea name="ctnt"></textarea></div>
        <div><input type="submit" value="저장"></div>
    </form>
</body>
</html>