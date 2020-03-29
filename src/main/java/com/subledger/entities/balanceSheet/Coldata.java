package com.subledger.entities.balanceSheet;

import java.io.Serializable;
import java.util.AbstractMap.SimpleEntry;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
public class Coldata  implements Serializable {
	
	public Coldata() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Coldata(Long id, String balance, Confidence confidence, RowData rowdata) {
		super();
		this.id = id;
		this.balance = balance;
		this.confidence = confidence;
		this.rowdata = rowdata;
	}


	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String balance;
	
	
	@OneToOne(fetch =FetchType.EAGER, mappedBy = "coldata",cascade = CascadeType.ALL, orphanRemoval = true)
	 private Confidence confidence;
	
	
	@ManyToOne()
	@JoinColumn(name="col_row")
	private RowData rowdata;
//should not have getter


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getBalance() {
		return balance;
	}


	public void setBalance(String balance) {
		this.balance = balance;
	}


	public Confidence getConfidence() {
		return confidence;
	}


	public void setConfidence(Confidence confidence) {
		this.confidence = confidence;
	}




	public void setRowdata(RowData rowdata) {
		this.rowdata = rowdata;
	}
	
}