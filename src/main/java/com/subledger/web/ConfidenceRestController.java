package com.subledger.web;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subledger.dao.balanceSheet.ColdataRepository;
import com.subledger.dao.balanceSheet.ConfidenceRepository;
import com.subledger.entities.balanceSheet.Coldata;
import com.subledger.entities.balanceSheet.Confidence;
import com.subledger.entities.balanceSheet.RowData;

@CrossOrigin(origins = "*")
@RestController
public class ConfidenceRestController {
	
	@Autowired
	private ConfidenceRepository confidenceRepository;
	@Autowired
	private ColdataRepository coldataRepository;
	
	@Transactional
	@PutMapping("/confidences/{id}")
	public Confidence updateConfidence(@PathVariable Long id,@RequestBody Confidence cn) {
		
		Confidence cnUpdate= confidenceRepository.findOne(id);
		cnUpdate.setMaxRendered(cn.getMaxRendered());
		cnUpdate.setNumber(cn.getNumber());
		cnUpdate.setSkew(cn.getSkew());
		return confidenceRepository.save(cnUpdate);
	}
	
	
	@Transactional
	@PostMapping("/confidences/{idCD}")
	public Confidence addConfidence(@PathVariable Long idCD,@RequestBody Confidence conf) {
		Coldata cd = coldataRepository.findOne(idCD);
		Confidence c = new Confidence(null, conf.getNumber(), conf.getSkew(),conf.getMaxRendered(),cd);
		return confidenceRepository.save(c);
	}	
}
