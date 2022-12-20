package kh.semi.s16.bt.model;

public class MemberVo {
//	 ID 	VARCHAR2(12)		NOT NULL,
//	 PWD 	VARCHAR2(20)		NOT NULL,
//	 NAME 	VARCHAR2(100)		NOT NULL,
//	 EMAIL 	VARCHAR2(100)		NOT NULL,
//	 ISSUB 	CHAR(1)		NOT NULL,
//	 SUBTYPE 	NUMBER,
//	 SUBSTR_DATE 	TIMESTAMP,
//	 SUBEND_DATE 	TIMESTAMP
	private String id;
	private String pwd;
	private String name;
	private String email;
	private String issub;
	public MemberVo() {
		super();
	}
	public MemberVo(String id, String pwd, String name, String email, String issub) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.issub = issub;
	}
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", issub=" + issub + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getIssub() {
		return issub;
	}
	public void setIssub(String issub) {
		this.issub = issub;
	}

}
