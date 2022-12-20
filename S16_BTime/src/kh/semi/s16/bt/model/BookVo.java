package kh.semi.s16.bt.model;

public class BookVo {
//	 ISBN 	VARCHAR2(13)		NOT NULL,
//	 THUM_IMG 	BLOB,
//	 BOOK_NAME 	VARCHAR2(100)		NOT NULL,
//	 AUTHOR 	VARCHAR2(100)		NOT NULL,
//	 PUBLISHER 	VARCHAR2(50)		NOT NULL,
//	 CATEGORY 	VARCHAR2(13)		NOT NULL,
//	 BOOK_INTRO 	CLOB,
//	 AUTH_INTRO     VARCHAR2(500),
//	 PUB_INTRO 	    CLOB,
//	 BOOK_PAGE 	NUMBER		NOT NULL,
//	 TOTAL_GRADE 	NUMBER(2,1),
//	 GRADE_PEO 	NUMBER
	private String isbn;
	private String thum_img;
	private String book_name;
	private String author;
	private String publisher;
	private String category;
	private String book_intro;
	private String auth_intro;
	private String pub_intro;
	private int book_page;
	private double total_grade;
	private int grade_peo;
	
	//constructor
	public BookVo() {
		super();
	}

	public BookVo(String isbn, String thum_img, String book_name, String author, String publisher, String category,
			String book_intro, String auth_intro, String pub_intro, int book_page, double total_grade, int grade_peo) {
		super();
		this.isbn = isbn;
		this.thum_img = thum_img;
		this.book_name = book_name;
		this.author = author;
		this.publisher = publisher;
		this.category = category;
		this.book_intro = book_intro;
		this.auth_intro = auth_intro;
		this.pub_intro = pub_intro;
		this.book_page = book_page;
		this.total_grade = total_grade;
		this.grade_peo = grade_peo;
	}

	@Override
	public String toString() {
		return "BookVo [isbn=" + isbn + ", thum_img=" + thum_img + ", book_name=" + book_name + ", author=" + author
				+ ", publisher=" + publisher + ", category=" + category + ", book_intro=" + book_intro + ", auth_intro="
				+ auth_intro + ", pub_intro=" + pub_intro + ", book_page=" + book_page + ", total_grade=" + total_grade
				+ ", grade_peo=" + grade_peo + "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getThum_img() {
		return thum_img;
	}

	public void setThum_img(String thum_img) {
		this.thum_img = thum_img;
	}

	public String getBook_name() {
		return book_name;
	}

	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBook_intro() {
		return book_intro;
	}

	public void setBook_intro(String book_intro) {
		this.book_intro = book_intro;
	}

	public String getAuth_intro() {
		return auth_intro;
	}

	public void setAuth_intro(String auth_intro) {
		this.auth_intro = auth_intro;
	}

	public String getPub_intro() {
		return pub_intro;
	}

	public void setPub_intro(String pub_intro) {
		this.pub_intro = pub_intro;
	}

	public int getBook_page() {
		return book_page;
	}

	public void setBook_page(int book_page) {
		this.book_page = book_page;
	}

	public double getTotal_grade() {
		return total_grade;
	}

	public void setTotal_grade(double total_grade) {
		this.total_grade = total_grade;
	}

	public int getGrade_peo() {
		return grade_peo;
	}

	public void setGrade_peo(int grade_peo) {
		this.grade_peo = grade_peo;
	}
	
}
