package com.bank.web.domains;

import java.io.Serializable;

public class AccountBean implements Serializable{
	private String regDate,accountNum,money;

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public String getRegDate() {
		return this.regDate;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public String getAccountNum() {
		return this.accountNum;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getMoney() {
		return this.money;
	}

	public String toString() {
		return " 계좌정보 [ 계좌번호 =" + accountNum + ", 거래일 =" + regDate + ", 잔액=" + money +"]";

	}
}
