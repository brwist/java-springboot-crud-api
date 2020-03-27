package com.subledger.entities.balanceSheet;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor @NoArgsConstructor
public class BalanceSheet  implements Serializable  {
		
	@Id	@GeneratedValue
	@Getter @Setter  private Long id_balanceSheet;
	@Getter @Setter  private Date date;
	@Getter @Setter  private String title;
	@Getter @Setter  private String location;
	@Getter @Setter  private String nameLabel;
	@Getter @Setter  private String setting;
	@Getter @Setter  private String settings;
	


	@OneToMany (mappedBy = "balancesheet",cascade = CascadeType.ALL, orphanRemoval = true)
	@Getter @Setter private Collection<RowData> rowData=new ArrayList<>();
	
	@OneToMany (mappedBy = "balancesheet",cascade = CascadeType.ALL, orphanRemoval = true)
	@Getter @Setter private Collection<Colstr> cols=new ArrayList<>();
	
}
