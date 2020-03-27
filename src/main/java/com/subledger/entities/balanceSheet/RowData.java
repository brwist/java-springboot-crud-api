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

@AllArgsConstructor @NoArgsConstructor
public class RowData  implements Serializable {
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Getter @Setter  private Long id;
	
	@Getter @Setter private String name;
	
	
	@OneToMany (mappedBy = "rowdata",fetch =FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
	@Getter @Setter private Collection<Coldata> cols=new ArrayList<>();

		
	@ManyToOne()
	@JoinColumn(name="rd_bs")
	@Setter private BalanceSheet balancesheet;
	
}
