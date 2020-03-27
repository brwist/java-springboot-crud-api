package com.subledger.entities;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.print.attribute.standard.DateTimeAtCompleted;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class Inventory implements Serializable{
@Id	@GeneratedValue
private Long id_invn;
private Date  dt_estd_mty;
private String text_fail_rsn;
private Double qty_unit;
private Double amt_par;


private Double amt_setmt;
private Date dt_setmt;
private Double amt_trdd_accrd_int;
private String cd_invn_intent;
private String id_instmt;

private String id_trd;
private Date dt_create_tmstmp;
private Date  dt_lst_updt_tmstmp;
private Double rate_mol_cst;
private Double rate_eff;


private Date dt_expctd_dlvy;
private Double pct_tax_efnyld_setmt;
private Double rate_factr_setmt;
private Double cnt_warm_setmt;
private String cd_tax_amtn_meth ;

private Double rate_tax_bss_setmt;
private String id_src_sys_invstmt;
private Double nbr_src_sys_trd_vrsn;
private String id_create_procss;
private String  id_create_srce;
private String id_lst_updt_procss;
private String id_lst_updt_srce;
private String id_src_sys_fund;
private String cd_postn_efct;
private Double rate_cpn_setmt;
private Double amt_swap_accrd_int_leg1;
private Double amt_swap_accrd_int_leg2;
private Double  amt_usd_fee_cswap;
private Double rate_psa_setlmt;
private Double id_srce_sys_trd_srs;
private Date dt_pool_alltn_trd;
private String cd_invn_acctg_dsgntn;
private String cd_invn_tax_dsgntn;
private String cd_invn_tax_isu;
private String cd_invn_tax_isu_seq;
private Date dt_invn_tax_isu;




public Long getId_invn() {
	return id_invn;
}
public void setId_invn(Long id_invn) {
	this.id_invn = id_invn;
}
public Date getDt_estd_mty() {
	return dt_estd_mty;
}
public Double getAmt_par() {
	return amt_par;
}
public void setAmt_par(Double amt_par) {
	this.amt_par = amt_par;
}
public Double getAmt_setmt() {
	return amt_setmt;
}
public void setAmt_setmt(Double amt_setmt) {
	this.amt_setmt = amt_setmt;
}
public Date getDt_setmt() {
	return dt_setmt;
}
public void setDt_setmt(Date dt_setmt) {
	this.dt_setmt = dt_setmt;
}
public Double getAmt_trdd_accrd_int() {
	return amt_trdd_accrd_int;
}
public void setAmt_trdd_accrd_int(Double amt_trdd_accrd_int) {
	this.amt_trdd_accrd_int = amt_trdd_accrd_int;
}
public String getCd_invn_intent() {
	return cd_invn_intent;
}
public void setCd_invn_intent(String cd_invn_intent) {
	this.cd_invn_intent = cd_invn_intent;
}
public String getId_instmt() {
	return id_instmt;
}
public void setId_instmt(String id_instmt) {
	this.id_instmt = id_instmt;
}
public String getId_trd() {
	return id_trd;
}
public void setId_trd(String id_trd) {
	this.id_trd = id_trd;
}
public Date getDt_create_tmstmp() {
	return dt_create_tmstmp;
}
public void setDt_create_tmstmp(Date dt_create_tmstmp) {
	this.dt_create_tmstmp = dt_create_tmstmp;
}
public Date getDt_lst_updt_tmstmp() {
	return dt_lst_updt_tmstmp;
}
public void setDt_lst_updt_tmstmp(Date dt_lst_updt_tmstmp) {
	this.dt_lst_updt_tmstmp = dt_lst_updt_tmstmp;
}
public Double getRate_mol_cst() {
	return rate_mol_cst;
}
public void setRate_mol_cst(Double rate_mol_cst) {
	this.rate_mol_cst = rate_mol_cst;
}
public Double getRate_eff() {
	return rate_eff;
}
public void setRate_eff(Double rate_eff) {
	this.rate_eff = rate_eff;
}
public Date getDt_expctd_dlvy() {
	return dt_expctd_dlvy;
}
public void setDt_expctd_dlvy(Date dt_expctd_dlvy) {
	this.dt_expctd_dlvy = dt_expctd_dlvy;
}
public Double getPct_tax_efnyld_setmt() {
	return pct_tax_efnyld_setmt;
}
public void setPct_tax_efnyld_setmt(Double pct_tax_efnyld_setmt) {
	this.pct_tax_efnyld_setmt = pct_tax_efnyld_setmt;
}
public Double getRate_factr_setmt() {
	return rate_factr_setmt;
}
public void setRate_factr_setmt(Double rate_factr_setmt) {
	this.rate_factr_setmt = rate_factr_setmt;
}
public Double getCnt_warm_setmt() {
	return cnt_warm_setmt;
}
public void setCnt_warm_setmt(Double cnt_warm_setmt) {
	this.cnt_warm_setmt = cnt_warm_setmt;
}
public String getCd_tax_amtn_meth() {
	return cd_tax_amtn_meth;
}
public void setCd_tax_amtn_meth(String cd_tax_amtn_meth) {
	this.cd_tax_amtn_meth = cd_tax_amtn_meth;
}
public Double getRate_tax_bss_setmt() {
	return rate_tax_bss_setmt;
}
public void setRate_tax_bss_setmt(Double rate_tax_bss_setmt) {
	this.rate_tax_bss_setmt = rate_tax_bss_setmt;
}
public String getId_src_sys_invstmt() {
	return id_src_sys_invstmt;
}
public void setId_src_sys_invstmt(String id_src_sys_invstmt) {
	this.id_src_sys_invstmt = id_src_sys_invstmt;
}
public Double getNbr_src_sys_trd_vrsn() {
	return nbr_src_sys_trd_vrsn;
}
public void setNbr_src_sys_trd_vrsn(Double nbr_src_sys_trd_vrsn) {
	this.nbr_src_sys_trd_vrsn = nbr_src_sys_trd_vrsn;
}
public String getId_create_procss() {
	return id_create_procss;
}
public void setId_create_procss(String id_create_procss) {
	this.id_create_procss = id_create_procss;
}
public String getId_create_srce() {
	return id_create_srce;
}
public void setId_create_srce(String id_create_srce) {
	this.id_create_srce = id_create_srce;
}
public String getId_lst_updt_procss() {
	return id_lst_updt_procss;
}
public void setId_lst_updt_procss(String id_lst_updt_procss) {
	this.id_lst_updt_procss = id_lst_updt_procss;
}
public String getId_lst_updt_srce() {
	return id_lst_updt_srce;
}
public void setId_lst_updt_srce(String id_lst_updt_srce) {
	this.id_lst_updt_srce = id_lst_updt_srce;
}
public String getId_src_sys_fund() {
	return id_src_sys_fund;
}
public void setId_src_sys_fund(String id_src_sys_fund) {
	this.id_src_sys_fund = id_src_sys_fund;
}
public String getCd_postn_efct() {
	return cd_postn_efct;
}
public void setCd_postn_efct(String cd_postn_efct) {
	this.cd_postn_efct = cd_postn_efct;
}
public Double getRate_cpn_setmt() {
	return rate_cpn_setmt;
}
public void setRate_cpn_setmt(Double rate_cpn_setmt) {
	this.rate_cpn_setmt = rate_cpn_setmt;
}
public Double getAmt_swap_accrd_int_leg1() {
	return amt_swap_accrd_int_leg1;
}
public void setAmt_swap_accrd_int_leg1(Double amt_swap_accrd_int_leg1) {
	this.amt_swap_accrd_int_leg1 = amt_swap_accrd_int_leg1;
}
public Double getAmt_swap_accrd_int_leg2() {
	return amt_swap_accrd_int_leg2;
}
public void setAmt_swap_accrd_int_leg2(Double amt_swap_accrd_int_leg2) {
	this.amt_swap_accrd_int_leg2 = amt_swap_accrd_int_leg2;
}
public Double getAmt_usd_fee_cswap() {
	return amt_usd_fee_cswap;
}
public void setAmt_usd_fee_cswap(Double amt_usd_fee_cswap) {
	this.amt_usd_fee_cswap = amt_usd_fee_cswap;
}
public Double getRate_psa_setlmt() {
	return rate_psa_setlmt;
}
public void setRate_psa_setlmt(Double rate_psa_setlmt) {
	this.rate_psa_setlmt = rate_psa_setlmt;
}
public Double getId_srce_sys_trd_srs() {
	return id_srce_sys_trd_srs;
}
public void setId_srce_sys_trd_srs(Double id_srce_sys_trd_srs) {
	this.id_srce_sys_trd_srs = id_srce_sys_trd_srs;
}
public Date getDt_pool_alltn_trd() {
	return dt_pool_alltn_trd;
}
public void setDt_pool_alltn_trd(Date dt_pool_alltn_trd) {
	this.dt_pool_alltn_trd = dt_pool_alltn_trd;
}
public String getCd_invn_acctg_dsgntn() {
	return cd_invn_acctg_dsgntn;
}
public void setCd_invn_acctg_dsgntn(String cd_invn_acctg_dsgntn) {
	this.cd_invn_acctg_dsgntn = cd_invn_acctg_dsgntn;
}
public String getCd_invn_tax_dsgntn() {
	return cd_invn_tax_dsgntn;
}
public void setCd_invn_tax_dsgntn(String cd_invn_tax_dsgntn) {
	this.cd_invn_tax_dsgntn = cd_invn_tax_dsgntn;
}
public String getCd_invn_tax_isu() {
	return cd_invn_tax_isu;
}
public void setCd_invn_tax_isu(String cd_invn_tax_isu) {
	this.cd_invn_tax_isu = cd_invn_tax_isu;
}
public String getCd_invn_tax_isu_seq() {
	return cd_invn_tax_isu_seq;
}
public void setCd_invn_tax_isu_seq(String cd_invn_tax_isu_seq) {
	this.cd_invn_tax_isu_seq = cd_invn_tax_isu_seq;
}
public Date getDt_invn_tax_isu() {
	return dt_invn_tax_isu;
}
public void setDt_invn_tax_isu(Date dt_invn_tax_isu) {
	this.dt_invn_tax_isu = dt_invn_tax_isu;
}
public void setDt_estd_mty(Date dt_estd_mty) {
	this.dt_estd_mty = dt_estd_mty;
}
public String getText_fail_rsn() {
	return text_fail_rsn;
}
public void setText_fail_rsn(String text_fail_rsn) {
	this.text_fail_rsn = text_fail_rsn;
}
public Double getQty_unit() {
	return qty_unit;
}
public void setQty_unit(Double qty_unit) {
	this.qty_unit = qty_unit;
}
public Inventory() {
	super();
	// TODO Auto-generated constructor stub
}
public Inventory(Long id_invn, Date dt_estd_mty, String text_fail_rsn, Double qty_unit, Double amt_par,
		Double amt_setmt, Date dt_setmt, Double amt_trdd_accrd_int, String cd_invn_intent, String id_instmt,
		String id_trd, Date dt_create_tmstmp, Date dt_lst_updt_tmstmp, Double rate_mol_cst, Double rate_eff,
		Date dt_expctd_dlvy, Double pct_tax_efnyld_setmt, Double rate_factr_setmt, Double cnt_warm_setmt,
		String cd_tax_amtn_meth, Double rate_tax_bss_setmt, String id_src_sys_invstmt, Double nbr_src_sys_trd_vrsn,
		String id_create_procss, String id_create_srce, String id_lst_updt_procss, String id_lst_updt_srce,
		String id_src_sys_fund, String cd_postn_efct, Double rate_cpn_setmt, Double amt_swap_accrd_int_leg1,
		Double amt_swap_accrd_int_leg2, Double amt_usd_fee_cswap, Double rate_psa_setlmt, Double id_srce_sys_trd_srs,
		Date dt_pool_alltn_trd, String cd_invn_acctg_dsgntn, String cd_invn_tax_dsgntn, String cd_invn_tax_isu,
		String cd_invn_tax_isu_seq, Date dt_invn_tax_isu) {
	super();
	this.id_invn = id_invn;
	this.dt_estd_mty = dt_estd_mty;
	this.text_fail_rsn = text_fail_rsn;
	this.qty_unit = qty_unit;
	this.amt_par = amt_par;
	this.amt_setmt = amt_setmt;
	this.dt_setmt = dt_setmt;
	this.amt_trdd_accrd_int = amt_trdd_accrd_int;
	this.cd_invn_intent = cd_invn_intent;
	this.id_instmt = id_instmt;
	this.id_trd = id_trd;
	this.dt_create_tmstmp = dt_create_tmstmp;
	this.dt_lst_updt_tmstmp = dt_lst_updt_tmstmp;
	this.rate_mol_cst = rate_mol_cst;
	this.rate_eff = rate_eff;
	this.dt_expctd_dlvy = dt_expctd_dlvy;
	this.pct_tax_efnyld_setmt = pct_tax_efnyld_setmt;
	this.rate_factr_setmt = rate_factr_setmt;
	this.cnt_warm_setmt = cnt_warm_setmt;
	this.cd_tax_amtn_meth = cd_tax_amtn_meth;
	this.rate_tax_bss_setmt = rate_tax_bss_setmt;
	this.id_src_sys_invstmt = id_src_sys_invstmt;
	this.nbr_src_sys_trd_vrsn = nbr_src_sys_trd_vrsn;
	this.id_create_procss = id_create_procss;
	this.id_create_srce = id_create_srce;
	this.id_lst_updt_procss = id_lst_updt_procss;
	this.id_lst_updt_srce = id_lst_updt_srce;
	this.id_src_sys_fund = id_src_sys_fund;
	this.cd_postn_efct = cd_postn_efct;
	this.rate_cpn_setmt = rate_cpn_setmt;
	this.amt_swap_accrd_int_leg1 = amt_swap_accrd_int_leg1;
	this.amt_swap_accrd_int_leg2 = amt_swap_accrd_int_leg2;
	this.amt_usd_fee_cswap = amt_usd_fee_cswap;
	this.rate_psa_setlmt = rate_psa_setlmt;
	this.id_srce_sys_trd_srs = id_srce_sys_trd_srs;
	this.dt_pool_alltn_trd = dt_pool_alltn_trd;
	this.cd_invn_acctg_dsgntn = cd_invn_acctg_dsgntn;
	this.cd_invn_tax_dsgntn = cd_invn_tax_dsgntn;
	this.cd_invn_tax_isu = cd_invn_tax_isu;
	this.cd_invn_tax_isu_seq = cd_invn_tax_isu_seq;
	this.dt_invn_tax_isu = dt_invn_tax_isu;
}

}