package com.subledger.dao.balanceSheet;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subledger.entities.balanceSheet.Colstr;

public interface ColstrRepository extends JpaRepository<Colstr, Long>{

	Long deleteById(Long id);

}
