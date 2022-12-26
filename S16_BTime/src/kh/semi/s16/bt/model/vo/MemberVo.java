package kh.semi.s16.bt.model.vo;

import java.sql.Date;

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
	private Date substr_date;
	private Date subend_date;
	public MemberVo() {
		super();
	}
	public MemberVo(String id, String pwd, String name, String email, String issub, Date substr_date,
			Date subend_date) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.issub = issub;
		this.substr_date = substr_date;
		this.subend_date = subend_date;
	}
	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", issub=" + issub
				+ ", substr_date=" + substr_date + ", subend_date=" + subend_date + "]";
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
	public Date getSubstr_date() {
		return substr_date;
	}
	public void setSubstr_date(Date substr_date) {
		this.substr_date = substr_date;
	}
	public Date getSubend_date() {
		return subend_date;
	}
	public void setSubend_date(Date subend_date) {
		this.subend_date = subend_date;
	}
}
