package com.zumba.bean;

public class Participants {
	private int pid;
	private String pname;
	
	private int age;
	
	private String phonenumber;
	private Integer batchid;
	
	public Participants(int pid, String pname, int age, String phonenumber, Integer batchid) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.age = age;
		this.phonenumber = phonenumber;
		this.batchid = batchid;
	}
	public Participants() {
		// TODO Auto-generated constructor stub
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Integer getBatchid() {
		return batchid;
	}
	public void setBatchid(Integer batchid) {
		this.batchid = batchid;
	}

}
