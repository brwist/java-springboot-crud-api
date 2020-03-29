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
public class BalanceSheet  implements Serializable  {

	public BalanceSheet() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id	@GeneratedValue
	private Long id;
	private Date date;
	private String title;
	private String location;
	private String nameLabel;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNameLabel() {
		return nameLabel;
	}

	public void setNameLabel(String nameLabel) {
		this.nameLabel = nameLabel;
	}

	public String getSetting() {
		return setting;
	}

	public void setSetting(String setting) {
		this.setting = setting;
	}

	public String getSettings() {
		return settings;
	}

	public void setSettings(String settings) {
		this.settings = settings;
	}

	private String setting;
	private String settings;



	@OneToMany (mappedBy = "balancesheet",cascade = CascadeType.ALL, orphanRemoval = true)
	@Getter @Setter private Collection<RowData> rowData=new ArrayList<>();

	@OneToMany (mappedBy = "balancesheet",cascade = CascadeType.ALL, orphanRemoval = true)
	@Getter @Setter private Collection<Colstr> cols=new ArrayList<>();

	public BalanceSheet(Long id, Date date, String title, String location, String nameLabel, String setting,
			String settings, Collection<RowData> rowData, Collection<Colstr> cols) {
		super();
		this.id = id;
		this.date = date;
		this.title = title;
		this.location = location;
		this.nameLabel = nameLabel;
		this.setting = setting;
		this.settings = settings;
		this.rowData = rowData;
		this.cols = cols;
	}

}
