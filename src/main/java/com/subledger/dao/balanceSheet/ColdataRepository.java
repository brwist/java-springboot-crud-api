package com.subledger.dao.balanceSheet;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subledger.entities.balanceSheet.Coldata;

public interface ColdataRepository extends JpaRepository<Coldata,Long>{

	Long deleteById(Long id);

}
