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
    <div class="container border p-4">
      <div class="border text-center fs-5 mb-3">View</div>
      <form action="/notice/edit" method="POST">
        <div class="d-flex">
          <div class="mb-3 w-50 me-3">
            <label for="userName">작성자</label>
            <input
              type="text"
              name="userName"
              class="form-control"
              value="${boardBean.userName}"
            />
          </div>
          <div class="mb-3 w-50">
            <label for="date">날짜</label>
            <input
              type="date"
              name="date"
              class="form-control"
              value="${boardBean.date}"
            />
          </div>
        </div>
        <div class="mb-3">
          <label for="title">제목</label>
          <input
            type="text"
            name="title"
            class="form-control"
            value="${boardBean.title}"
          />
        </div>
        <div class="mb-3">
          <label for="content">내용</label>
          <textarea name="content" class="form-control" style="height: 10rem">
${boardBean.content}


        </textarea
          >
        </div>
        <div class="mb-3 text-end">
          <button class="btn btn-secondary">수정</button>
          <a href="/notice/list" class="btn btn-secondary">뒤로가기</a>
        </div>
      </form>
    </div>
    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
