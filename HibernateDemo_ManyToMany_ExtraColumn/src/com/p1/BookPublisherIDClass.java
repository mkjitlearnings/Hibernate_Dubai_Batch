package com.p1;

import java.io.Serializable;

public class BookPublisherIDClass implements Serializable{

	int book;
	int publisher;
	
	public BookPublisherIDClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookPublisherIDClass(int book, int publisher) {
		super();
		this.book = book;
		this.publisher = publisher;
	}
	public int getBook() {
		return book;
	}
	public void setBook(int book) {
		this.book = book;
	}
	public int getPublisher() {
		return publisher;
	}
	public void setPublisher(int publisher) {
		this.publisher = publisher;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + book;
		result = prime * result + publisher;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookPublisherIDClass other = (BookPublisherIDClass) obj;
		if (book != other.book)
			return false;
		if (publisher != other.publisher)
			return false;
		return true;
	}
	
	
}
