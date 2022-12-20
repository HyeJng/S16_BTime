package kh.semi.s16.bt.model;

public class SubscribeVo {
//	 SUBTYPE 	NUMBER		NOT NULL,
//	 SUBTERM 	NUMBER		NOT NULL,
//	 SUBPRICE 	NUMBER		NOT NULL
	private int sutbype;
	private int subterm;
	private int subprice;
	public SubscribeVo() {
		super();
	}
	public SubscribeVo(int sutbype, int subterm, int subprice) {
		super();
		this.sutbype = sutbype;
		this.subterm = subterm;
		this.subprice = subprice;
	}
	@Override
	public String toString() {
		return "SubscribeVo [sutbype=" + sutbype + ", subterm=" + subterm + ", subprice=" + subprice + "]";
	}
	public int getSutbype() {
		return sutbype;
	}
	public void setSutbype(int sutbype) {
		this.sutbype = sutbype;
	}
	public int getSubterm() {
		return subterm;
	}
	public void setSubterm(int subterm) {
		this.subterm = subterm;
	}
	public int getSubprice() {
		return subprice;
	}
	public void setSubprice(int subprice) {
		this.subprice = subprice;
	}
	
}
