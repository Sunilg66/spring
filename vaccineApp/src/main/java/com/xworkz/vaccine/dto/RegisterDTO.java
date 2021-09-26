package com.xworkz.vaccine.dto;

public class RegisterDTO {
	
	private String userName;
	
	private String email;
	
	private String password;
	
	private String confirmPassword;
	
	private String phone;
	
	private String vaccineType;
	
	private Long aadharNo;
	
	private String gender;
	
	public RegisterDTO() {
		// TODO Auto-generated constructor stub
	}

	public RegisterDTO(String userName, String email, String password, String confirmPassword, String phone,
			String vaccineType, Long aadharNo, String gender) {
		super();
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
		return "RegisterDTO [userName=" + userName + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", phone=" + phone + ", vaccineType=" + vaccineType
				+ ", aadharNo=" + aadharNo + ", gender=" + gender + "]";
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
