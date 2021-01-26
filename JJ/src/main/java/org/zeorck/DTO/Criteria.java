package org.zeorck.DTO;

public class Criteria {
	//페이지수
	private int pageNum;
	//페이지 당 처리되어야 할 데이터 수(10)
	private int amount;
	//검색 기준
	private String type;
	//검색 키워드
	private String keyword;
	
	
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getKeyword() {
		return keyword;
	}


	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}


	public Criteria() {
		this(1, 10);//this는 다른 생성자 호출
		//1부터 10까지 보여줌
	}
	
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}


	public int getPageNum() {
		return pageNum;
	}


	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}


	@Override
	public String toString() {
		return "Criteria [pageNum=" + pageNum + ", amount=" + amount + ", type=" + type + ", keyword=" + keyword + "]";
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
}
