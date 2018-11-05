package com.innovapptive.odatav2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.innovapptive.odatav2.annotations.SAPLineItem;
import com.innovapptive.odatav2.annotations.Sap;

@Entity
@IdClass(AppConfigPK.class)	
@Table(name = "APPCONFG")
public class AppConfig {

	@Id
	private String appID;

	@Sap(filterable = true, sortable = true)
	@SAPLineItem
	private String appname;

	@Sap(filterable = true, sortable = true)
	@SAPLineItem
	private String appconfig;

	@Id
	private String uname;

	@Id
	private String customerID;

	@Sap(filterable = true, sortable = true)
	@SAPLineItem
	private String appdescription;

	@Sap(filterable = true, sortable = true)
	@SAPLineItem
	private String createdon;

	@Sap(filterable = true, sortable = true)
	@SAPLineItem
	private String apppublish;

	public AppConfig() {
	}

	public AppConfig(String appID, String appname, String appConfig, String uname, String customerID,
			String appDescription, String createdOn, String appPublish) {
		this.appID = appID;
		this.appname = appname;
		this.appconfig = appConfig;
		this.uname = uname;
		this.customerID = customerID;
		this.appdescription = appDescription;
		this.createdon = createdOn;
		this.apppublish = appPublish;
	}

	@Override
	public String toString() {
		return String.format(
				"AppConfig[appID='%s', appname='%s',appconfig='%s', uname='%s',customerID='%s', appdescription='%s',createdon='%s', apppublish='%s']",
				appID, appname, appconfig, uname, customerID, appdescription, createdon, apppublish);
	}

	public String getAppID() {
		return appID;
	}

	public void setAppID(String appID) {
		this.appID = appID;
	}

 

	public String getAppname() {
		return appname;
	}

	public void setAppname(String appname) {
		this.appname = appname;
	}



	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getAppconfig() {
		return appconfig;
	}

	public void setAppconfig(String appconfig) {
		this.appconfig = appconfig;
	}

	public String getAppdescription() {
		return appdescription;
	}

	public void setAppdescription(String appdescription) {
		this.appdescription = appdescription;
	}

	public String getCreatedon() {
		return createdon;
	}

	public void setCreatedon(String createdon) {
		this.createdon = createdon;
	}

	public String getApppublish() {
		return apppublish;
	}

	public void setApppublish(String apppublish) {
		this.apppublish = apppublish;
	}

	

}
