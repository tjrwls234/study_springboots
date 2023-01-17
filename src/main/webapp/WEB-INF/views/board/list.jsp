<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
  </head>
  <body>
    <div class="container border" style="height: 40rem">
      <div class="border mb-2 p-1 fs-4 mt-2">운동 일지</div>
      <%-- 반복될 구문 --%>
      <%-- 제목(title) 파라미터로 넘김 --%>
      <c:forEach items="${BoardsList}" var="board" varStatus="status">
        <div
          class="border mb-2 p-1 d-flex justify-content-between align-items-center"
        >
          <a href="/notice/view/${board.uid}">${status.count}. ${board.title}</a>
      </div>
      </c:forEach>
      <%-- 여기까지 구문 --%>

      <div class="d-flex">
        <div>
          <a href="/board/form" class="btn btn-secondary">작성</a>
        </div>
      </div>
    </div>
  </body>
  <script
    src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
    crossorigin="anonymous"
  ></script>
</html>
