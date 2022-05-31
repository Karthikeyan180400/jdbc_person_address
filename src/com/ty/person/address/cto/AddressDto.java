package com.ty.person.address.cto;

public class AddressDto {
	int aid;
	String street;
	String door_num;
	String city;
	long pinCode;
	int pid;
	
	
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", street=" + street + ", door_num=" + door_num + ", city=" + city
				+ ", pinCode=" + pinCode + ", pid=" + pid + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDoor_num() {
		return door_num;
	}
	public void setDoor_num(String door_num) {
		this.door_num = door_num;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
	
   
}
