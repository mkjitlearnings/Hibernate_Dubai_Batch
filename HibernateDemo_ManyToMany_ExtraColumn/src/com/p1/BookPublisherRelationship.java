package com.p1;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Book_Publisher")
@IdClass(BookPublisherIDClass.class)
public class BookPublisherRelationship {
	
	@Id
	@ManyToOne
	@JoinColumn(name="Book_ID")
	private Book book;
	
	
	@Id
	@ManyToOne
	@JoinColumn(name="Publisher_ID")
	private Publisher publisher;
	
	@Column(name="Book_Publish_Date")
	private Date date; // date of publish

	public BookPublisherRelationship() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BookPublisherRelationship(Book book, Publisher publisher, Date date) {
		super();
		this.book = book;
		this.publisher = publisher;
		this.date = date;
	}

	@Override
	public String toString() {
		return "BookPublisherRelationship [book=" + book + ", publisher=" + publisher + ", date=" + date + "]";
	}
	
	
	

}
