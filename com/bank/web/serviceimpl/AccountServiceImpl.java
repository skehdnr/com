package com.bank.web.serviceimpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import com.bank.web.domains.AccountBean;
import com.bank.web.service.Accountservice;

public class AccountServiceImpl implements Accountservice{

	private List<AccountBean>accounts;
	public AccountServiceImpl() {
		accounts = new ArrayList<>();
	}
	
	@Override
	public void createAccount(String money) {
	AccountBean acc = new AccountBean();
	acc.setAccountNum(createAccountNum());
	acc.setMoney(money);
	acc.setRegDate(findDate());
	accounts.add(acc);
	}

	@Override
	public String createAccountNum() {
		String accountNum = "";
		Random ran = new Random();
		for(int i=0;i<9;i++) {
			accountNum +=(i==4)?"-":ran.nextInt(10);
		}
		return accountNum;
	}

	@Override
	public List<AccountBean> findAll() {
		return accounts;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		for(AccountBean account : accounts) {
			if(accountNum.equals(account.getAccountNum())) {
				accounts.add(account);
				break;
			}
		}
		return null;
	}

	@Override
	public int countAccounts() {
		return accounts.size();
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		AccountBean a = findByAccountNum(accountNum);
		return (accounts.contains(a));
	}

	@Override
	public String findDate() {
		return new SimpleDateFormat("yyyy.MM.dd hh:mm").format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		AccountBean ab = findByAccountNum(param.getAccountNum());
		String aMoney = String.valueOf((Integer.parseInt(param.getMoney()))+
				Integer.parseInt(ab.getMoney()));
		ab.setMoney(aMoney);
		ab.setRegDate(findDate());
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		AccountBean mb = findByAccountNum(param.getAccountNum());
		String mMoney = String.valueOf((Integer.parseInt(param.getMoney()))-
				Integer.parseInt(mb.getMoney()));
		mb.setMoney(mMoney);
		mb.setRegDate(findDate());
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		AccountBean account = findByAccountNum(accountNum);
		if(accounts.contains(account)) {
			accounts.remove(account);
		}
	}
}
