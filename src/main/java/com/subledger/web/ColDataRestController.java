package com.subledger.web;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.subledger.dao.balanceSheet.ColdataRepository;
import com.subledger.entities.balanceSheet.Coldata;
import com.subledger.entities.balanceSheet.Confidence;

@CrossOrigin(origins = "*")
@RestController
public class ColDataRestController {
	
	@Autowired
	private ColdataRepository coldataRepository;
	
	@Transactional
	@DeleteMapping("/coldatas/{id}")
	public Long deletColData(@PathVariable Long id) {
		return coldataRepository.deleteById(id);
	}
	
	@Transactional
	@PutMapping("/coldatas/{id}")
	public Coldata updateColData(@PathVariable Long id,@RequestBody Coldata cd) {
		Coldata cdUpdate= coldataRepository.findOne(id);
		cdUpdate.setBalance(cd.getBalance());
		return coldataRepository.save(cdUpdate);
	}

}
