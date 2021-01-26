/**
 * 
 */
//ajax를 이용한 댓글 처리

//댓글 쓰기
//댓글쓰기 버튼을 클릭하면
$(document).ready(function(){
	var bno=$("#bno").val();
	var rno="";

	getList();
	
	
	$("#replyAddBtn").on("click",function(){
	var reply=$("#reply").val();
	var replyer=$("#replyer").val();;
	//ajax
	$.ajax({
		type:"post",	// form태그에 메서드
		url:"/replies/new",	//form태그 액션
		data:JSON.stringify({bno:bno,reply:reply,replyer:replyer}),	//controller에 보낼 데이터
		contentType:"application/json; charset=utf-8",	//controller에 받을 데이터 타입
		success:function(result){
			//전송이 성공적으로 완료된후 
			if(result=="success"){
			alert("댓글이 작성되었습니다");
			}
		},
		error:function(){
			//전송이 실패했을때
			alert("다시 시도해주세요");
		}
	})//댓글을 전송했을때
	
	//alert(reply);
	//alert(replyer);
	//alert("댓글쓰기");
	})	//-----------------댓글버튼을 눌렀을때end
	
	
	//댓글 목록 리스트 함수(getlist)
	function getList(){
		var str="";
	$.getJSON("/replies/"+bno+".json",function(data){
		
		console.log(data);
		
		$(data).each(function(){
			//str+="<li>"+this.reply+"<button>수정</button><button>삭제</button></li>"
			
str+="<li data-rno='"+this.rno+"' id='replies"+this.rno+"'>" 
+"<input type='hidden' id='recontent"+this.rno+"' value='"+this.reply+"'>"+this.reply 
+"<div id='moddiv"+this.rno+"'></div><button id='replyModBtn'>수정</button>" 
+"<button id='replyDelBtn' >삭제</button></li>" 
		})
		$("#replies").html(str)	})
	
	}//-------------리스트 옮기기
	
	$("#replies").on("click","#replyModBtn",function(e){
		e.preventDefault();
		var reply=$(this).parent();
		rno=reply.attr("data-rno");
		var recontent=$("#recontent"+rno).val();
		
		var modstr="";
		modstr+="<div><textarea id='reply"+rno+"' name='reply' row='10' cols='50'>"+recontent+"</textarea><br>"
		+"<input id='replyer' type='text' name='replyer'>"
		+"<button id='replyRnoModBtn'>댓글 수정</button></div>";
		
		$("#moddiv"+rno).html(modstr);
		
	});
	
	$("#replies").on("click","#replyRnoModBtn",function(e){
			e.preventDefault();
			var reply=$("#reply"+rno).val();
			
		$.ajax({
					type:"put",	// form태그에 메서드
					url:"/replies/modify",	//form태그 액션
					contentType:"application/json; charset=utf-8",	//controller에 받을 데이터 타입
					data:JSON.stringify({rno:rno,reply:reply}),	//controller에 보낼 데이터
					success:function(result){
						//전송이 성공적으로 완료된후 
						if(result=="success"){
						alert("댓글수정 성공");
						getList();
						}
					},
					error:function(){
						//전송이 실패했을때
						alert("댓글수정 실패");
				}
			})
	})
	
	
	
	
	
	$("#replies").on("click","#replyDelBtn",function(e){
		e.preventDefault();
		var reply=$(this).parent();
		rno=reply.attr("data-rno");
		
			$.ajax({
					type:"delete",	// form태그에 메서드
					url:"/replies/delete",	//form태그 액션
					contentType:"application/json; charset=utf-8",	//controller에 받을 데이터 타입
					data:JSON.stringify({rno:rno}),	//controller에 보낼 데이터
					success:function(result){
						//전송이 성공적으로 완료된후 
						if(result=="success"){
						alert("삭제되었습니다");
						getList();
						}
					},
					error:function(){
						//전송이 실패했을때
						alert("댓글삭제 실패");
				}
			})
		
	})
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
})
