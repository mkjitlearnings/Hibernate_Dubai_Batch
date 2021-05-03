package com.p1;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	
	@OneToMany(mappedBy="book",cascade=CascadeType.ALL)
	private List<BookPublisherRelationship> bookpublishers = new ArrayList<BookPublisherRelationship>();

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Book(String name) {
		super();
		this.name = name;
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

	public List<BookPublisherRelationship> getBookpublishers() {
		return bookpublishers;
	}

	public void setBookpublishers(List<BookPublisherRelationship> bookpublishers) {
		this.bookpublishers = bookpublishers;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", bookpublishers=" + bookpublishers + "]";
	}
	
	
	
}//end class
