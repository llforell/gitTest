package org.zeorck.DTO;

public class PageDTO {

	//처음 페이지(startPage 1,11,21,31)
	private int startPage;
	//끝 페이지(endPage 10,20,30,40(36))
	private int endPage;
	//이전 버튼(prey true/false)
	private boolean prev;
	//다음 버튼(next true/false)
	private boolean next;
	// tbl_board테이블에 전체 건수
	private int total;
	//Criteria 필통 추가
	private Criteria cri;
	
	public PageDTO(Criteria cri,int total) {
		this.cri=cri;
		this.total=total;
		
		//endPage 계산식
		this.endPage=(int)(Math.ceil(cri.getPageNum()/10.0))*10;
		//startPage	 계산식
		this.startPage=this.endPage-9;
		//realendPage
		int realEnd= (int)(Math.ceil((total*1.0)/cri.getAmount()));		
		if(realEnd<endPage) {
			this.endPage=realEnd;
		}
		//prev 조건
		this.prev=this.startPage>1;
		//next	조건
		this.next=this.endPage<realEnd;
	

	}

	
	
	
	
	
	@Override
	public String toString() {
		return "PageDTO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", total=" + total + ", cri=" + cri + "]";
	}

	
	public Criteria getCri() {
		return cri;
	}
	public void setCri(Criteria cri) {
		this.cri = cri;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}
	
	
	
	
	
}
