package com.subledger.web;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subledger.dao.balanceSheet.ColdataRepository;
import com.subledger.dao.balanceSheet.RowDataRepository;
import com.subledger.entities.balanceSheet.BalanceSheet;
import com.subledger.entities.balanceSheet.Coldata;
import com.subledger.entities.balanceSheet.Colstr;
import com.subledger.entities.balanceSheet.Confidence;
import com.subledger.entities.balanceSheet.RowData;

@CrossOrigin(origins = "*")
@RestController
public class ColDataRestController {
	
	@Autowired
	private ColdataRepository coldataRepository;
	@Autowired
	private RowDataRepository rowDataRepository;
	
	@Transactional
	@DeleteMapping("/coldatas/{id}")
	public Long deletColData(@PathVariable Long id) {
		return coldataRepository.deleteById(id);
	}
	
	@Transactional
	@PutMapping("/coldatas/{id}")
	public Coldata updateColData(@PathVariable Long id,@RequestBody Coldata cd) {
		Coldata cdUpdate= coldataRepository.findOne(id);
		if(cdUpdate == null) {
			return null;
		}else {
		cdUpdate.setBalance(cd.getBalance());
		return coldataRepository.save(cdUpdate);}
	}

	@Transactional
	@PostMapping("/coldatas/{idRD}")
	public Coldata addColData(@PathVariable Long idRD,@RequestBody String balance) {
		RowData rd = rowDataRepository.findOne(idRD);
		Coldata cd = new Coldata(null, balance, null,rd);
		return coldataRepository.save(cd);
	}	
}
