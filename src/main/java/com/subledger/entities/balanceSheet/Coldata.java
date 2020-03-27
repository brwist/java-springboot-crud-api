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
@AllArgsConstructor @NoArgsConstructor
public class Coldata  implements Serializable {
	
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter @Setter  private Long id;
	
	@Getter @Setter private String balance;
	
	
	@OneToOne(fetch =FetchType.EAGER, mappedBy = "coldata",cascade = CascadeType.ALL, orphanRemoval = true)
	@Getter @Setter private Confidence confidence;
	
	
	@ManyToOne()
	@JoinColumn(name="col_row")
	@Setter private RowData rowdata;
	
}