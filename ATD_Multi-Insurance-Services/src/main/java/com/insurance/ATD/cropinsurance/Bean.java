package com.insurance.ATD.cropinsurance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crop")
public class Bean {
	@Id
private int policynumber;

private String claimreason;
private int premiumrate;
private String cropseason;
private String cropname;
private int estimatedcropvalue;
public int getEstimatedcropvalue() {
	return estimatedcropvalue;
}
public void setEstimatedcropvalue(int estimatedcropvalue) {
	this.estimatedcropvalue = estimatedcropvalue;
}
public int getPolicynumber() {
	return policynumber;
}
public void setPolicynumber(int policynumber) {
	this.policynumber = policynumber;
}
public String getClaimreason() {
	return claimreason;
}
public void setClaimreason(String claimreason) {
	this.claimreason = claimreason;
}
public int getPremiumrate() {
	return premiumrate;
}
public void setPremiumrate(int premiumrate) {
	this.premiumrate = premiumrate;
}
public String getCropseason() {
	return cropseason;
}
public void setCropseason(String cropseason) {
	this.cropseason = cropseason;
}
public String getCropname() {
	return cropname;
}
public void setCropname(String cropname) {
	this.cropname = cropname;
}
public int getInsuranceperiod() {
	return insuranceperiod;
}
public void setInsuranceperiod(int insuranceperiod) {
	this.insuranceperiod = insuranceperiod;
}
public int getTotalcost() {
	return totalcost;
}
public void setTotalcost(int totalcost) {
	this.totalcost = totalcost;
}
private int insuranceperiod;
private int totalcost;

}
