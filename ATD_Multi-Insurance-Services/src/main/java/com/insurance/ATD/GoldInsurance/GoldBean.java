package com.insurance.ATD.GoldInsurance;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GoldBean")
public class GoldBean {
	@Id
	@Column(name="Policynumber")
	private int Policynumber;
	@Column(name="Materials")
	private String Materials;
	@Column(name="Amount")
	private int Amount;
	@Column(name="Tenure")
	private int Tenure;
	@Column(name="Percentage")
	private int Percentage;
	public int getPolicynumber() {
		return Policynumber;
	}
	public void setPolicynumber(int policynumber) {
		Policynumber = policynumber;
	}
	public String getMaterials() {
		return Materials;
	}
	public void setMaterials(String materials) {
		Materials = materials;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getTenure() {
		return Tenure;
	}
	public void setTenure(int tenure) {
		Tenure = tenure;
	}
	public int getPercentage() {
		return Percentage;
	}
	public void setPercentage(int percentage) {
		Percentage = percentage;
	}
	

}
