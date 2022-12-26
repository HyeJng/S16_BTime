package kh.semi.s16.bt.model;

import java.sql.Date;

public class ReviewVo {
//	 REV_NUM 	NUMBER		NOT NULL,
//	 ISBN 	VARCHAR2(13)		NOT NULL,
//	 REV_TXT 	VARCHAR2(300)		NOT NULL,
//	 REV_DATE 	TIMESTAMP		NOT NULL,
//	 EACH_GRADE 	NUMBER		NOT NULL,
//	 ID 	VARCHAR2(12)		NOT NULL
	private int rev_num;
	private String isbn;
	private String rev_txt;
	private Date rev_date;
	private int each_grade;
	private String id;
	public ReviewVo() {
		super();
	}
	public ReviewVo(int rev_num, String isbn, String rev_txt, Date rev_date, int each_grade, String id) {
		super();
		this.rev_num = rev_num;
		this.isbn = isbn;
		this.rev_txt = rev_txt;
		this.rev_date = rev_date;
		this.each_grade = each_grade;
		this.id = id;
	}
	@Override
	public String toString() {
		return "ReviewVo [rev_num=" + rev_num + ", isbn=" + isbn + ", rev_txt=" + rev_txt + ", rev_date=" + rev_date
				+ ", each_grade=" + each_grade + ", id=" + id + "]";
	}
	public int getRev_num() {
		return rev_num;
	}
	public void setRev_num(int rev_num) {
		this.rev_num = rev_num;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getRev_txt() {
		return rev_txt;
	}
	public void setRev_txt(String rev_txt) {
		this.rev_txt = rev_txt;
	}
	public Date getRev_date() {
		return rev_date;
	}
	public void setRev_date(Date rev_date) {
		this.rev_date = rev_date;
	}
	public int getEach_grade() {
		return each_grade;
	}
	public void setEach_grade(int each_grade) {
		this.each_grade = each_grade;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
