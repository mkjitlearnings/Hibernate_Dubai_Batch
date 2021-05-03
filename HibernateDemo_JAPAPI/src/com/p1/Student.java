package com.p1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity   // HQL 
@Table(name="MyStudents")
public class Student {

	@Id
	@SequenceGenerator(name="mylogic",initialValue=1100,allocationSize=11)
	@GeneratedValue(strategy=GenerationType.AUTO,generator="mylogic")
	private int id;
	
	@Column(name="Student_Name",nullable=false)
	private String name;
	
	@Column(unique=true)
	private String address;
	
	private int marks=0;
	
	
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}
	
	
	
	
}//end class
