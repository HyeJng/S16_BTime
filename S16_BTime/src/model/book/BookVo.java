package model.book;

public class BookVo {
	// test용
	private String title;
	private String review;
	public BookVo() {
		super();
	}
	public BookVo(String title, String review) {
		super();
		this.title = title;
		this.review = review;
	}
	@Override
	public String toString() {
		return "BookVo [title=" + title + ", review=" + review + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
}
