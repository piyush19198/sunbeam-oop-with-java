package com.app.core;
//isbn(string),category(enum),price(double),publishDate,authorName(string),quantity(int)

import java.time.LocalDate;

public class Book {
	private String isbn;
	private Category category;
	private double price;
	private LocalDate publishDate;
	private String authorName;
	private int quantity;

	public Book(String isbn, Category category, double price, LocalDate publishDate, String authorName, int quantity) {
		super();
		this.isbn = isbn;
		this.category = category;
		this.price = price;
		this.publishDate = publishDate;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", category=" + category + ", price=" + price + ", publishDate=" + publishDate
				+ ", authorName=" + authorName + ", quantity=" + quantity + "]";
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public Category getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public String getAuthorName() {
		return authorName;
	}
	
	
	

}
