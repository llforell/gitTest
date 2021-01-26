<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
	<meta charset="UTF-8">
	<title>login</title>
	<link rel="stylesheet" href="/resources/css/style.css">
	<script src="https://kit.fontawesome.com/51db22a717.js" crossorigin="anonymous"></script>
</head>
<body>
<form action="/member/login2" method="post">
	<div class="main-container">
		<div class="main-wrap">
		<header>
		<div> <a href="/JPRO_1/main" >뒤로가기</a></div>
			<div class="sel-lang-wrap">
				<select class="lang-select">
					<option>한국어</option>
					<option>English</option>
				</select>
			</div>

		</header>
		<section class="login-input-section-wrap">
			<div class="login-input-wrap">	
				<input placeholder="ID" type="text"  id="id" name="id"></input>
			</div>
			<div class="login-input-wrap password-wrap">	
				<input placeholder="PW" type="password"  id="pw" name="pw"></input>
			</div>
			<div class="login-button-wrap">
				<button type="submit">로그인</button>
			</div>
			<div class="login-stay-sign-in">
				<i class="far fa-check-circle"></i>
				<span>로그인 유지</span>
			</div>
		</section>
		<section class="Easy-sgin-in-wrap">
			<h2>다른 방법으로 로그인</h2>
			<ul class="sign-button-list">
				<li><button><i class="fas fa-qrcode"></i><span> QR code 로그인</span></button></li>
				<li><button><i class="fab fa-facebook-square"></i><span>Facebook</span></button></li>
				<li><button><i class="fab fa-line"></i><span>line</span></button></li>
			</ul>
			<p class="forget-msg"> <a href="#"> 아이디 혹은 비밀번호를 잊어버리셨습니까?</a>  |  <a href="/member/write">회원가입</a></p>
		</section>
		<footer>
			<div class="copyright-wrap">
			<span>	<img src="img/logo.png"> Copyright © JJ Corp. All Rights Reserved.</span>
			</div>
		</footer>
		</div>
	</div>
	</form>
</body>
</html>