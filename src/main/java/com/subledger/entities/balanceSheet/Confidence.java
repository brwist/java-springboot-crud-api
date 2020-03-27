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
@AllArgsConstructor @NoArgsConstructor
public class Confidence implements Serializable {
	@Id	@GeneratedValue(strategy=GenerationType.AUTO)
	@Getter @Setter private Long id;

	@Getter @Setter private Long number;
	@Getter @Setter private Float skew;
	@Getter @Setter private Long maxRendered;
	
	
	@OneToOne()
	@JoinColumn(name = "cf_col")
	@Setter  private Coldata coldata;
	
//	@OneToOne(mappedBy = "confidence",fetch =FetchType.EAGER)
//	@Getter @Setter private Coldata coldata;

}


