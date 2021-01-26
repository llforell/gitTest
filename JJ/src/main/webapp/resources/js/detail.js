/**
 * 
 */
function btn_click(str){
	alert(str);
	if(str=="update"){
		frm1.action="/board/update";
		frm1.method="get"
	}else {
		frm1.action="/board/delete";
		frm1.method="get"
	}
}
function b_click(str){
	alert(str);
	if(str=="update"){
		frm.action="/member/update";
		frm.method="post"
	}else{
		frm.action="/member/delete";
		frm.method="get"
	}
}