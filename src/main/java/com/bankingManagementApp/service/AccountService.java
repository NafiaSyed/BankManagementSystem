package com.bankingManagementApp.service;

import java.util.List;

import com.bankingManagementApp.entity.Account;

public interface AccountService {
	
	public Account createAccount(Account account);
	
	public Account getAccountDetailsByNumber(Long account_number);
	
	public List<Account> getAllAccountDetails();
	
	public Account depositAmount(Long account_number,Double amount);
	
	public Account withdrawAmount(Long account_number,Double amount);
	
	public void closeAccount(Long account_number);
	

}
