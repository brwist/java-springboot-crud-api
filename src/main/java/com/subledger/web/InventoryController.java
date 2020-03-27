package com.subledger.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subledger.dao.InventoryRepository;
import com.subledger.entities.Inventory;;


@CrossOrigin(origins = "*")
@RestController
public class InventoryController {
	@Autowired
	private InventoryRepository inventoryRepository;
	@GetMapping("/listInventory")
	public List<Inventory> listInventory(){	
		return inventoryRepository.findAll();
	}
}
