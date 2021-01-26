<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/product/">

    

    <!-- Bootstrap core CSS -->
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/css/bootstrap-theme.min.css" rel="stylesheet">

    <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

        <script type="text/javascript" src="/resources/js/jquery-3.5.1.js"></script>
    <script type="text/javascript" src="/resources/js/jquery.innerfade.js"></script>
    <script type="text/javascript" src="/resources/js/inner.js"></script>
    <!-- Custom styles for this template -->
    <link href="/resources/css/product.css" rel="stylesheet">
<meta charset="UTF-8"> 
<!--<link rel="stylesheet" type="text/css" href="/resources/css/board2list.css"> -->
<title>Insert title here</title>
</head>
<body>
<h1></h1>
<hr>

	<table border="1">

	<tr><td> <a  class="py-2" href="/JPRO_1/main" aria-label="Product">
      <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" fill="none" stroke="currentColor" stroke-linecap="round" stroke-linejoin="round" stroke-width="2" class="d-block mx-auto" role="img" viewBox="0 0 24 24"><title>Product</title><circle cx="12" cy="12" r="10"/><path d="M14.31 8l5.74 9.94M9.69 8h11.48M7.38 12l5.74-9.94M9.69 16L3.95 6.06M14.31 16H2.83m13.79-4l-5.74 9.94"/></svg>
    메인으로</a>  </td></tr>
    <tr><td>
    <c:if  test="${sessionScope.aaaa.id!=null}">
    <h1> ${aaaa.id} 님 환영합니다</h1>
    <a  class="py-2" href="/board/write" aria-label="Product">
    글쓰기</a>  	<a href="${path}/member/logout">로그아웃</a> </c:if></td> </tr>
    <tr>  
    	<td> <c:if test="${sessionScope.aaaa.id==null}"><h1>환영합니다</h1>
    	<a href="/member/login">로그인</a>
    	</c:if> </td>
    </tr>
    		
    		
    		

	
		
		
	<tr id="trtr"> 
	
	<td>번호</td><td>제목</td><td>작성자</td><td>작성일</td>
	</tr>
	<!-- for문 시작 -->
		<c:forEach items="${blist}" var="board">
			<tr> 
			<td>${board.bno}</td>
			<td><a href="/board/detail?bno=${board.bno}">${board.title}</a></td>
			<td>${board.writer}</td>
			<td>${board.regdate}</td>
			
			</tr>
		</c:forEach>

		
		<!-- for문 끝  -->
	</table>
		<c:if test="${pageMaker.prev}">
			<a href="/board/list?pageNum=${pageMaker.startPage-1}&amount=${pageMaker.cri.amount}">이전</a>
		</c:if>
		
<c:forEach var="num" begin="${pageMaker.startPage}" end="${pageMaker.endPage}">
	<a href="/board/list?pageNum=${num}&amount=${pageMaker.cri.amount}">${num}</a>
</c:forEach>

		<c:if test="${pageMaker.next}">
			<a href="/board/list?pageNum=${pageMaker.endPage+1}&amount=${pageMaker.cri.amount}">다음</a>
		</c:if>
		<br><br>
		<form action="/board/list" method="get">
		<input type="hidden" name="pageNum" value="${pageMaker.cri.pageNum}">
		<input type="hidden" name="amount" value="${pageMaker.cri.amount}">
		<select name="type">
			<option value="t">제목</option>
			<option value="c">내용</option>
			<option value="w">작성자</option>
			<option value="tc">제목+내용</option>
		</select>
	
		
		<input type="text" name="keyword">
		
		<input type="submit" value="검색">
		</form>
</body>
</html>