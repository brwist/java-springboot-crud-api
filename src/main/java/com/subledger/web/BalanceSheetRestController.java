package com.subledger.web;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.subledger.dao.balanceSheet.BalanceSheetRepository;
import com.subledger.entities.balanceSheet.BalanceSheet;
import com.subledger.entities.balanceSheet.Coldata;


@CrossOrigin(origins = "*")
@RestController
public class BalanceSheetRestController {
	
	@Autowired
	private BalanceSheetRepository balanceSheetRepository;
	
	@GetMapping("/balancesheets/{id}")
	public BalanceSheet getBalancebyID(@PathVariable Long id){	
		return balanceSheetRepository.findOne(id);
	}
	
	@GetMapping("/balancesheets")
	public List<BalanceSheet> getBalances(){	
		return balanceSheetRepository.findAll();
	}
	
	@Transactional
	@PostMapping("/balancesheets")
	public BalanceSheet addBS(@RequestBody BalanceSheet bs) {
		return balanceSheetRepository.save(bs);
	}	
		
	@Transactional
	@PutMapping("/balancesheets/{id}")
	public BalanceSheet updateBS(@PathVariable Long id,@RequestBody BalanceSheet bs) {	
		BalanceSheet bsToUp = balanceSheetRepository.findOne(id);
		if(bsToUp == null) {
			return null;
		}else {
		bsToUp.setSetting(bs.getSetting());
		//bsToUp.setSettings(bs.getSettings());
		bsToUp.setLocation(bs.getLocation());
		bsToUp.setTitle(bs.getTitle());
		bsToUp.setNameLabel(bs.getNameLabel());
		bsToUp.setDate(bs.getDate());
		
		return balanceSheetRepository.save(bsToUp);}
	}
	
	@Transactional
	@DeleteMapping("/balancesheets/{id}")
	public void deteleBS(@PathVariable Long id) {	
		 balanceSheetRepository.deleteById(id);
	}
	
}
