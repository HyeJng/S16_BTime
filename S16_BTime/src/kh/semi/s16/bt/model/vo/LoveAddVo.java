package kh.semi.s16.bt.model.vo;

public class LoveAddVo {
//	 ID 	VARCHAR2(12)		NOT NULL,
//	 ISBN 	VARCHAR2(13)		NOT NULL
	private String id;
	private String isbn;
	public LoveAddVo() {
		super();
	}
	public LoveAddVo(String id, String isbn) {
		super();
		this.id = id;
		this.isbn = isbn;
	}
	@Override
	public String toString() {
		return "LoveAdd [id=" + id + ", isbn=" + isbn + "]";
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
