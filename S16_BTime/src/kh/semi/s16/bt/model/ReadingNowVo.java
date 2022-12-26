package kh.semi.s16.bt.model;

import java.sql.Date;

public class ReadingNowVo {
//	 READ_PAGE 	NUMBER	DEFAULT 0	NOT NULL,
//	 READSTR_DATE 	DATE,
//	 ID 	VARCHAR2(12)		NOT NULL,
//	 ISBN 	VARCHAR2(13)		NOT NULL
	private int read_page;
	private Date readstr_date;
	private String id;
	private String isbn;
	public ReadingNowVo() {
		super();
	}
	public ReadingNowVo(int read_page, Date readstr_date, String id, String isbn) {
		super();
		this.read_page = read_page;
		this.readstr_date = readstr_date;
		this.id = id;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "ReadingNowVo [read_page=" + read_page + ", readstr_date=" + readstr_date + ", id=" + id + ", isbn="
				+ isbn + "]";
	}
	public int getRead_page() {
		return read_page;
	}
	public void setRead_page(int read_page) {
		this.read_page = read_page;
	}
	public Date getReadstr_date() {
		return readstr_date;
	}
	public void setReadstr_date(Date readstr_date) {
		this.readstr_date = readstr_date;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
