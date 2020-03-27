package com.subledger.entities.balanceSheet;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor
public class Colstr implements Serializable {
	
	
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter @Setter  private Long id;
	
	@Getter @Setter private String name;
	
	@ManyToOne()
	@JoinColumn(name="col_bs")
	@Setter private BalanceSheet balancesheet;

}
