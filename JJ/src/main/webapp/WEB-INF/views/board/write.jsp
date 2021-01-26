<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head> 
  <script type="text/javascript" src="/resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="/resources/js/jquery-3.5.1.js"></script>
<script type="text/javascript" src="/resources/js/write.js"></script>
   

    
     
    
    

    <!-- Bootstrap core CSS -->
<link href="/resources/css/bootstrap.min.css" rel="stylesheet">

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
<title>Insert title here</title>
</head>
<body>

       <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <!-- jQuery (부트스트랩의 자바스크립트 플러그인을 위해 필요한) -->
        <script src="http://code.jquery.com/jquery.js"></script>
        <!-- 모든 합쳐진 플러그인을 포함하거나 (아래) 필요한 각각의 파일들을 포함하세요 -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
        <!-- Respond.js 으로 IE8 에서 반응형 기능을 활성화하세요 (https://github.com/scottjehl/Respond) -->
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
<!-- 
<h1>${name}</h1>
<form action="/board/write" method="post" enctype="multiPart/form-data">
<input type="file" name="files" multiple><br>
<input type="submit"> </form>
<form action="/board/write" method="post" >
	제목<br>
	<input type="text" name="title"><br>
	내용<br>
	<textarea rows="10" cols="20" name="content"></textarea><br>
	<input type="submit" value="글쓰기">

</form>-->
  
<form role="form" action="/board/writePost" method="post" enctype="multipart/form-data"> 
<table>

<tr><td><div class="row">
                <p></p>
                <div class="col-md-12">
                    <small>
                    <a href="/JPRO_1/main">메인으로</a> | <a href="/board/list">뒤로가기</a>
                    </small>
                </div>
            </div></td></tr>
 <tr><td><div class="form-group">
                    <div class="col-lg-10" id="provision">
                      제목  <textarea class="form-control" rows="1" cols="3" name="title">

                        </textarea>
   
                    </div>
                </div></td> </tr>
             <tr><td>    <div class="form-group">
                    <div class="col-lg-10" id="memberInfo">
                       내용 <textarea name="content" class="form-control" rows="8" style="resize:none">

                        </textarea>
                    </div>
                </div></td> </tr>
              <tr><td>   <div class="form-group" id="divId">
                     <div class="col-lg-10">
                      아이디  <input type="text" readonly="readonly" value="${sessionScope.aaaa.id}" class="form-control onlyAlphabetAndNumber" id="writer"  name="writer" data-rule-required="true"  maxlength="30">
                    </div> 
                    
                 
                  
                </div></td> </tr>

 <!-- 
	<tr></td> <td>제목</td> </tr>
	<tr> <td><input type="text" name="title" placeholder="제목을 작성해주세요"></td></tr>
	<tr> <td>작성자</td> </tr>
	<tr> <td><input type="text" name="writer" value="${sessionScope.login.name}"></td></tr>
	<tr> <td>내용</td> </tr>
	<tr> <td><textarea name="content"></textarea></td> </tr>   -->
	<tr> <td><input type="file" name="uploadFile" multiple></td> </tr>
	<tr> <td><input type="submit" value="전송"></td> </tr>
	
</table>
</form>

<div class="uploadResult"> 

<ul>
</ul>
</div>


</body>
</html>