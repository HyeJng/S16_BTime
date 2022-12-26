package kh.semi.s16.bt.model;

public class LoveAdd {
//	 ID 	VARCHAR2(12)		NOT NULL,
//	 ISBN 	VARCHAR2(13)		NOT NULL
	private String id;
	private String isbn;
	public LoveAdd() {
		super();
	}
	public LoveAdd(String id, String isbn) {
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
