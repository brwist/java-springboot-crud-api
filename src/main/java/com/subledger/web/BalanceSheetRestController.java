package com.subledger.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subledger.dao.balanceSheet.BalanceSheetRepository;
import com.subledger.entities.balanceSheet.BalanceSheet;

@CrossOrigin(origins = "*")
@RestController
public class BalanceSheetRestController {
	
	@Autowired
	private BalanceSheetRepository BalanceSheetRepository;
	@GetMapping("/balancesheets/{id}")
	public BalanceSheet getBalancebyID(@PathVariable Long id){	
		return BalanceSheetRepository.findOne(id);
	}
	
	
	@PutMapping("/balancesheets/{id}")
	public BalanceSheet updateBS(@PathVariable Long id,@RequestBody BalanceSheet bs) {
		
				
		return BalanceSheetRepository.save(bs);
	}
}
