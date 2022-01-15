<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>리스트</title>
</head>
<body>
    <header>
        <c:choose>
            <c:when test="${sessionScope.loginUser == null}">
                <a href="/user/login"><button>로그인</button></a>
            </c:when>
            <c:otherwise>
                <a href="/user/logout"><input type="button" value="로그아웃"></a>
            </c:otherwise>
        </c:choose>
    </header>
    <section>
        <c:if test="${sessionScope.loginUser != null}">
            <a href="/board/write">글쓰기</a>
        </c:if>
        <div>리스트</div>
    </section>
    <footer>footer</footer>
</body>
</html>