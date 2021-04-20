package com.xworkz.xworkzapp.dto;

public class ElectricityBillDTO {

	private String billNo;
	private int customerId;
	private String customerName;
	private String type;
	private int amount;
	private int kw;

	public ElectricityBillDTO(String billNo, int customerId, String customerName, String type, int amount, int kw) {
		super();
		this.billNo = billNo;
		this.customerId = customerId;
		this.customerName = customerName;
		this.type = type;
		this.amount = amount;
		this.kw = kw;
	}

	public String getBillNo() {
		return billNo;
	}

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getKw() {
		return kw;
	}

	public void setKw(int kw) {
		this.kw = kw;
	}

}
