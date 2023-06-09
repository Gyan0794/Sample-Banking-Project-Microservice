package com.profinch.springmvcboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profinch.springmvcboot.model.Account;
import com.profinch.springmvcboot.model.Employee;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByMobileNumber(long mobileNumber);
}
