package com.bank.web.domains;

public class CustomerBean extends MemberBean{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String credit;
	
	public void setCredit(String credit) {
		this.credit =credit;
	}public String getCredit() {
		return this.credit;
	}
	@Override
	public String toString() {
		return "[ "
				+ "id = "+getId() +", "
						+ "pass = "+getPass()+", "
								+ "이름 = "+getName()+", "
										+ "주민번호 = "+getSsn()+", "
												+ "신용도 = "+credit+"등급 ]";
	}
}
