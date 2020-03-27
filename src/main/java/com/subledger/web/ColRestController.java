package com.subledger.web;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subledger.dao.balanceSheet.BalanceSheetRepository;
import com.subledger.dao.balanceSheet.ColdataRepository;
import com.subledger.dao.balanceSheet.ColstrRepository;
import com.subledger.entities.balanceSheet.Coldata;
import com.subledger.entities.balanceSheet.Colstr;

@CrossOrigin(origins = "*")
@RestController
public class ColRestController {

	@Autowired
	private ColstrRepository colstrRepository;
	
	@Transactional
	@DeleteMapping("/colstrs/{id}")
	public Long deletColstr(@PathVariable Long id) {
		return colstrRepository.deleteById(id);
	}
	
	@Transactional
	@PutMapping("/colstrs/{id}")
	public Colstr updateColStr(@PathVariable Long id,@RequestBody String str) {
		Colstr clUpdate= colstrRepository.findOne(id);
		clUpdate.setName(str);
		return colstrRepository.save(clUpdate);
	}

			
}
