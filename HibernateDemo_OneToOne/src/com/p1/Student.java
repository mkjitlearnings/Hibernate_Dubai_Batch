package com.p1;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity   // HQL 
@Table(name="MyStudents")
public class Student {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="Student_Name",nullable=false)
	private String name;
	
	private String address;
	
	private int marks;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="StudentDetailsID")
	private StudentDetails studentDetails;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String address, int marks) {
		super();
		this.name = name;
		this.address = address;
		this.marks = marks;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public StudentDetails getStudentDetails() {
		return studentDetails;
	}
	public void setStudentDetails(StudentDetails studentDetails) {
		this.studentDetails = studentDetails;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
	
	
	
}//end class
