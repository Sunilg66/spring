package com.xworkz.vaccine.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vaccineRegistration")
public class RegisterEntity implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="r_registerId")
	private int registerId;
	
	@Column(name="r_username")
    private String userName;
	
	@Column(name="r_email")
	private String email;
	
	@Column(name="r_password")
	private String password;
	
	@Column(name="r_confirmPassword")
	private String confirmPassword;
	
	@Column(name="r_phone")
	private String phone;
	
	@Column(name="r_vaccineType")
	private String vaccineType;
	
	@Column(name="r_aadharNo")
	private Long aadharNo;
	
	@Column(name="r_gender")
	private String gender;
	
	public RegisterEntity() {
		// TODO Auto-generated constructor stub
	}

	public RegisterEntity(int registerId, String userName, String email, String password, String confirmPassword,
			String phone, String vaccineType, Long aadharNo, String gender) {
		super();
		this.registerId = registerId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phone = phone;
		this.vaccineType = vaccineType;
		this.aadharNo = aadharNo;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "RegisterEntity [registerId=" + registerId + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + ", confirmPassword=" + confirmPassword + ", phone=" + phone
				+ ", vaccineType=" + vaccineType + ", aadharNo=" + aadharNo + ", gender=" + gender + "]";
	}

	public int getRegisterId() {
		return registerId;
	}

	public void setRegisterId(int registerId) {
		this.registerId = registerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getVaccineType() {
		return vaccineType;
	}

	public void setVaccineType(String vaccineType) {
		this.vaccineType = vaccineType;
	}

	public Long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(Long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	


}
