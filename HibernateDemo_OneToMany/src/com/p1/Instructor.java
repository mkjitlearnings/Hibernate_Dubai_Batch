package com.p1;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Instructor")
public class Instructor {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="Id")
	private int id;
	
	@Column(name="Instructor_Name")
	private String name;
	
	@Column(name="Instructor_email")
	private String email;
	
	/*  One to many code starts */
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Trainer")
	private Set<Course> courses;


	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Instructor(String name, String email, Set<Course> courses) {
		super();
		this.name = name;
		this.email = email;
		this.courses = courses;
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Set<Course> getCourses() {
		return courses;
	}


	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", email=" + email + ", courses=" + courses + "]";
	}
	
	
	
}
