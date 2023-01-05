<%@ page contentType ="text/html;charset=UTF-8" language="java" %>
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
      <form action="/board/list">
        <div class="d-flex">
          <div class="mb-3 w-50 me-3">
            <label for="userName">작성자</label>
            <input
              type="text"
              name="userName"
              class="form-control"
              value="김석진"
            />
          </div>
          <div class="mb-3 w-50">
            <label for="date">날짜</label>
            <input
              type="date"
              name="date"
              class="form-control"
              value="2023-01-06"
            />
          </div>
        </div>
        <div class="mb-3">
          <label for="title">제목</label>
          <input
            type="text"
            name="title"
            class="form-control"
            value="금요일 운동"
          />
        </div>
        <div class="mb-3">
          <label for="content">내용</label>
          <textarea name="content" class="form-control" style="height: 10rem">
가슴운동
1. 플랫 벤치프레스
2. 덤벨 벤치프레스
2. 인클라인 벤치프레스
3. 플라이
4. 딥스


        </textarea
          >
        </div>

        <div class="mb-3 text-end">
        <a href="./edit.html" class="btn btn-secondary">수정</a>
          <button class="btn btn-secondary">뒤로가기</button>
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
