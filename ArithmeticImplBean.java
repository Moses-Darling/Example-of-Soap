package com.soap.project;

public class ArithmeticImplBean {
	int principle;
	int no;
	float rate;
	public int getPrinciple() {
		return principle;
	}
	public void setPrinciple(int principle) {
		this.principle = principle;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public ArithmeticImplBean()
	{
		
	}
	@Override
	public String toString() {
		return "ArithmeticImpl [principle=" + principle + ", no=" + no + ", rate=" + rate + "]";
	}

}
