package com.subledger.entities.balanceSheet;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Confidence implements Serializable {
	@Id	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private Long number;
	private Float skew;
	private Long maxRendered;
	
	
	@OneToOne()
	@JoinColumn(name = "cf_col")
	private Coldata coldata;


	public Confidence(Long id, Long number, Float skew, Long maxRendered, Coldata coldata) {
		super();
		this.id = id;
		this.number = number;
		this.skew = skew;
		this.maxRendered = maxRendered;
		this.coldata = coldata;
	}


	public Confidence() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getNumber() {
		return number;
	}


	public void setNumber(Long number) {
		this.number = number;
	}


	public Float getSkew() {
		return skew;
	}


	public void setSkew(Float skew) {
		this.skew = skew;
	}


	public Long getMaxRendered() {
		return maxRendered;
	}


	public void setMaxRendered(Long maxRendered) {
		this.maxRendered = maxRendered;
	}





	public void setColdata(Coldata coldata) {
		this.coldata = coldata;
	}
	

}


