package com.bank.web.domains;

public class EmployeeBean extends MemberBean {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String sabun;
	
	public void setSabun(String sabun) {
		this.sabun = sabun;
	}public String getSabun() {
		return this.sabun;
	}
	@Override
	public String toString() {
		return " 관리자정보 [ id=" + getId() + ", pass=" + getPass() + ", name=" + getName() + ", ssn=" + getSsn() + "사번 ="+getSabun()+"]";
	}

}
