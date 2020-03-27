package com.subledger.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.subledger.entities.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long> { 
}
