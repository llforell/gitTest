<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="/resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="/resources/js/reply.js"></script>
<script type="text/javascript" src="/resources/js/detail.js"></script>

    <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/product/">
   <link rel="canonical" href="https://getbootstrap.com/docs/5.0/examples/product/">

    
     
    <script type="text/javascript" src="/resources/js/jquery.innerfade.js"></script>
    <script type="text/javascript" src="/resources/js/inner.js"></script>
    <!-- Bootstrap core CSS -->
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<link href="/resources/css/bootstrap-theme.min.css" rel="stylesheet">
    

    <!-- Bootstrap core CSS -->
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
		<form  name="frm1">
	<table border="1">
	
	 
			<input type="hidden" value="${detail.bno}" name="bno" readonly="readonly" id="bno">
		
		<tr> 
			<td>제목</td><td> <input type="text" value="${detail.title}" name="title"></td>
		</tr>
		<tr> 
			<td>내용</td><td><textarea rows="10" cols="50" name="content" >${detail.content}</textarea></td>
		</tr>
		<tr> 
			<td>작성자</td><td> <input type="text" value="${detail.writer}" readonly="readonly" name="writer"></td>
		</tr>
		<tr> 
			<td>날짜</td><td> <input type="text" value="${detail.regdate}" readonly="readonly" name="regdate"></td>
		</tr>	
		<tr>
		<td colspan="2"> 
		 <input type="submit" value="수정" onclick="btn_click('update')"/>
   		 <input type="submit" value="삭제" onclick="btn_click('delete')"/></td>
		 </tr>
	</table>
	</form>	
	<ul id="replies"></ul>
	

	<div>
	<textarea rows="3" cols="20" name="reply" id="reply"></textarea>
	</div>

	<div>
	<input type="text" name="replyer" id="replyer">
	</div>
	
	<div>
	<button id="replyAddBtn">댓글작성</button>
	</div>

</body>
</html>