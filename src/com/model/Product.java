package com.model;

import java.time.LocalDate;

public class Product {
	
	private int id;  //PK,AI
	private String name;
	private String company;
	private int price;
	private LocalDate mdfDate;
	private LocalDate expDate;
	
	public LocalDate getMdfDate() {
		return mdfDate;
	}
	public void setMdfDate(LocalDate mdfDate) {
		this.mdfDate = mdfDate;
	}
	public LocalDate getExpDate() {
		return expDate;
	}
	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "\n Product [id=" + id + ", name=" + name + ", company=" + company + ", price=" + price + ", mdfDate="
				+ mdfDate + ", expDate=" + expDate + "]";
	}
	
}
