<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>${data.title}</title>
</head>
<body>
    <div><a href="/board/list">리스트로 돌아가기</a></div>
    <div>제목 : ${data.title}</div>
    <div>조회수 : ${data.hits}</div>
    <div>작성자 : ${data.writernm}</div>
    <div>작성일 : ${data.rdt}</div>
    <div>내용 : ${data.ctnt}</div>
</body>
</html>