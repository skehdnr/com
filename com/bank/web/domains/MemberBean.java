package com.bank.web.domains;

import java.io.Serializable;

public class MemberBean implements Serializable{
	
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String id,pass,name,ssn;
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getPass() {
		return pass;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSsn(String arr) {
		this.ssn = arr;
	}
	public String getSsn() {
		return ssn;
	}

	@Override
	public String toString() {
		return "[ 회원정보 ] id=" + id + ", pass=" + pass + ", name=" + name + ", ssn=" + ssn + "]";
	}
}
