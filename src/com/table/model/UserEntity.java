package com.table.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="User")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long UserId;
	private String address;
	private int dob;
	private String email;
	private char gender;
	private int mobileNo;
	private String Username;
	private int pincode;
	
	
	public UserEntity(String address, int dob, String email, char gender,
			int mobileNo, String name, int pincode) {
		super();
		this.address = address;
		this.dob = dob;
		this.email = email;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.Username = name;
		this.pincode = pincode;
	}
	public long getUserId() {
		return UserId;
	}
	public void setUserId(long userId) {
		UserId = userId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return Username;
	}
	public void setName(String Username) {
		this.Username = name;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	

	/**
	 * @param args
	 */
	

}
