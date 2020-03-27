package com.subledger.dao.balanceSheet;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subledger.entities.balanceSheet.RowData;

public interface RowDataRepository extends JpaRepository<RowData,Long> {

	Long deleteById(Long id);

}
