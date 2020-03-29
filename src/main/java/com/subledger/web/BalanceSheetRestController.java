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
	private BalanceSheetRepository balanceSheetRepository;
	
	@GetMapping("/balancesheets/{id}")
	public BalanceSheet getBalancebyID(@PathVariable Long id){	
		return balanceSheetRepository.findOne(id);
	}
	
	
	@PutMapping("/balancesheets/{id}")
	public BalanceSheet updateBS(@PathVariable Long id,@RequestBody BalanceSheet bs) {	
		BalanceSheet bsToUp = balanceSheetRepository.findOne(id);
		bsToUp.setSetting(bs.getSetting());
		//bsToUp.setSettings(bs.getSettings());
		bsToUp.setLocation(bs.getLocation());
		bsToUp.setTitle(bs.getTitle());
		bsToUp.setNameLabel(bs.getNameLabel());
		bsToUp.setDate(bs.getDate());
		
		return balanceSheetRepository.save(bsToUp);
	}
}
