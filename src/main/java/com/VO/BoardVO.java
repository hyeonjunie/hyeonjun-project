package com.VO;

import java.sql.Date;

public class BoardVO {
	
	private int b_no;
	private String title;
	private String cont;
	private String writer;
	private Date regdate;
	private int cnt;
	
	public int getB_no() {
		return b_no;
	}
	public void setB_no(int b_no) {
		this.b_no = b_no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCont() {
		return cont;
	}
	public void setCont(String cont) {
		this.cont = cont;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "BoardVO [b_no=" + b_no + ", title=" + title + ", cont=" + cont + ", writer=" + writer + ", regdate="
				+ regdate + ", cnt=" + cnt + "]";
	}
	
	

}





