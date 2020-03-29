package com.subledger.entities.balanceSheet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity

public class RowData  implements Serializable {
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


	public Collection<Coldata> getCols() {
		return cols;
	}


	public void setCols(Collection<Coldata> cols) {
		this.cols = cols;
	}


	
	public void setBalancesheet(BalanceSheet balancesheet) {
		this.balancesheet = balancesheet;
	}


	public RowData() {
		super();
		// TODO Auto-generated constructor stub
	}


	public RowData(Long id, String name, Collection<Coldata> cols, BalanceSheet balancesheet) {
		super();
		this.id = id;
		this.name = name;
		this.cols = cols;
		this.balancesheet = balancesheet;
	}


	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	
	@OneToMany (mappedBy = "rowdata",fetch =FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	private Collection<Coldata> cols=new ArrayList<>();

		
	@ManyToOne()
	@JoinColumn(name="rd_bs")
	private BalanceSheet balancesheet;
	
}
