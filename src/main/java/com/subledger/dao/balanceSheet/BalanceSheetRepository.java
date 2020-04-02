package com.subledger.dao.balanceSheet;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subledger.entities.balanceSheet.BalanceSheet;

public interface BalanceSheetRepository extends JpaRepository<BalanceSheet, Long>{
	public void deleteById(Long id);
}
