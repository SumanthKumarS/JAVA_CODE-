package com.emc.entities;

public class Participants extends EMBase{
//	private Long id;
//	private String name;
	private String email;
	private String checkedIn;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(String checkedIn) {
		this.checkedIn = checkedIn;
	}
}
