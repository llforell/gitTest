/**
 * 
 */
function b_click(str){
	if(str=="login"){
		form.action="/MBcon/list";
		form.method="get"
	}else if(str=="memberinsert"){
		form.action="/MBcon/memberinsert";
		form.method="get"
	}else if(str=="list"){
		form.action="/MBcon/list";
		form.method="get"
	}
}

function bc_click(str){
	if(str=="binsert"){
		fn.action="/MBcon/detail";
		fn.method="get"
	}else if(str=="backlist"){
		fn.action="/MBcon/list";
		fn.method="get"
	}
}
function bv_click(str){
	if(str=="update"){
		alert("aaaaa");
		ff.action="/MBcon/update";
		ff.method="get"
		
	}else if(str=="delete"){
		ff.action="/MBcon/list";
		ff.method="get"
		
	}else if(str=="list"){
		ff.action="/MBcon/list";
		ff.method="get"
	}
}