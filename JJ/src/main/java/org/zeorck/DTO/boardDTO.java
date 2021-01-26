package org.zeorck.DTO;

import java.util.ArrayList;

public class boardDTO {
	//게시판 번호
	private int bno;
	//제목
	private String title;
	//내용
	private String content;
	//작성자
	private String writer;
	//작성일자
	private String regdate;
	//수정일자
	private String updatedate;
	private int readcnt;
	private ArrayList<BoardAttachDTO> attachList;
	

	public int getReadcnt() {
		return readcnt;
	}
	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
	}
	public ArrayList<BoardAttachDTO> getAttachList() {
		return attachList;
	}
	public void setAttachList(ArrayList<BoardAttachDTO> attachList) {
		this.attachList = attachList;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getUpdatedate() {
		return updatedate;
	}
	public void setUpdatedate(String updatedate) {
		this.updatedate = updatedate;
	}
	@Override
	public String toString() {
		return "boardDTO [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", regdate=" + regdate + ", updatedate=" + updatedate + ", readcnt=" + readcnt + "]";
	}
	
	
}
