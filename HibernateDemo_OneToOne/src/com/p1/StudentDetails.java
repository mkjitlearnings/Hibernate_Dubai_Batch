package com.p1;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="StudentDeatils")
public class StudentDetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String email;
	private long phoneNumber;
	
	@OneToOne(mappedBy="studentDetails",cascade=CascadeType.ALL)
	private Student stu;
	
	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(String email, long phoneNumber) {
		super();
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	}
	public Student getStu() {
		return stu;
	}
	public void setStu(Student stu) {
		this.stu = stu;
	}
	
	
	
	
}
