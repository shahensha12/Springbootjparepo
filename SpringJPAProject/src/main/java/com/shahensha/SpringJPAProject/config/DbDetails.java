package com.shahensha.SpringJPAProject.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix="db")
public class DbDetails {

	private String DriverClass;
	private String url;
	private String userName;
	private String password;
	public DbDetails() {
		super();
	}
	public DbDetails(String driverClass, String url, String userName, String password) {
		super();
		DriverClass = driverClass;
		this.url = url;
		this.userName = userName;
		this.password = password;
	}
	public String getDriverClass() {
		return DriverClass;
	}
	public void setDriverClass(String driverClass) {
		DriverClass = driverClass;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "DbDetails [DriverClass=" + DriverClass + ", url=" + url + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
}
