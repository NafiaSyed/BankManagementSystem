package com.bankingManagementApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bankingManagementApp.entity.Account;

public interface AccountRepository  extends JpaRepository<Account, Long>{

}
