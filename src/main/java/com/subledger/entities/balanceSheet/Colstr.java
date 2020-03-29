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
public class Colstr implements Serializable {


	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	public void setBalancesheet(BalanceSheet balancesheet) {
		this.balancesheet = balancesheet;
	}

	public Colstr() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Colstr(Long id, String name, BalanceSheet balancesheet) {
		super();
		this.id = id;
		this.name = name;
		this.balancesheet = balancesheet;
	}

	@ManyToOne()
	@JoinColumn(name="col_bs")
	private BalanceSheet balancesheet;

}
