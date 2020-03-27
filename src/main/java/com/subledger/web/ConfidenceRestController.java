package com.subledger.web;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.subledger.dao.balanceSheet.ConfidenceRepository;
import com.subledger.entities.balanceSheet.Confidence;

@CrossOrigin(origins = "*")
@RestController
public class ConfidenceRestController {
	
	@Autowired
	private ConfidenceRepository confidenceRepository;
	
	@Transactional
	@PutMapping("/confidences/{id}")
	public Confidence updateConfidence(@PathVariable Long id,@RequestBody Confidence cn) {
		
		Confidence cnUpdate= confidenceRepository.findOne(id);
		cnUpdate.setMaxRendered(cn.getMaxRendered());
		cnUpdate.setNumber(cn.getNumber());
		cnUpdate.setSkew(cn.getSkew());
		return confidenceRepository.save(cnUpdate);
	}
	
}
