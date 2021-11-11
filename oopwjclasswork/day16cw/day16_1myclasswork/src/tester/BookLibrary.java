package tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Book;
import com.app.core.Category;

import custom_exceptions.BookHandlingException;

import static com.app.core.Category.*;
import static java.time.LocalDate.parse;

import static utils.CollectionUtils.populateSampleData;

public class BookLibrary {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated books
			HashMap<String, Book> books = populateSampleData();
			System.out.println(books);
			boolean exit = false;
			while (!exit) {
				System.out.println("1. Add a Book 2.Display All Books 100.Exit");
				try {
					switch (sc.nextInt()) {
					case 1: // add a book
						System.out.println("Enter ISBN");
						String isbn = sc.next();
						Book b = books.get(isbn);
						// chk if the book with same isbn exists : containsKey
						if (b != null) {
							// book exists : ask for qty
							System.out.println("Enter qty");
							// update qty
							b.setQuantity(b.getQuantity() + sc.nextInt());
							System.out.println("Updated the qty for Book : " + isbn);
						} else { // no dup book
							System.out.println(
									"Enter other details :  category,  price,  publishDate,  authorName,  quantity");
							b = new Book(isbn, valueOf(sc.next().toUpperCase()), sc.nextDouble(), parse(sc.next()),
									sc.next(), sc.nextInt());
							books.put(isbn, b);
							System.out.println("New book added to a library....");

						}

						break;
					case 2:
						System.out.println("All Books in library");
						// can you iterate over the map directly ? NO
						// soln : convert the Map ---> Collection<V> : public Collection<V> values()
						for (Book b1 : books.values())
							System.out.println(b1);
						break;
					case 3:// issue a book
						System.out.println("Enter ISBN");
						isbn = sc.next();
						b = books.get(isbn);
						if (b == null)
							throw new BookHandlingException("Book doesn't exist!!!!");
						// => book exists : chk qty
						if (b.getQuantity() == 0) // =>currently un available
							throw new BookHandlingException("Book un available currently");
						// =>book available
						b.setQuantity(b.getQuantity() - 1);
						System.out.println("Book : " + isbn + " issued to the user....");
						break;
					case 4:// ret the book
						System.out.println("Enter ISBN");
						isbn = sc.next();
						b = books.get(isbn);
						if (b == null)
							throw new BookHandlingException("You have entered invalid ISBN!!!!");
						// =>book available
						b.setQuantity(b.getQuantity() + 1);
						System.out.println("Book : " + isbn + " returned to library");
						break;
					case 5: // remove book(all copies of the books) from the library
						System.out.println("Enter ISBN");
						isbn = sc.next();
						b = books.remove(isbn);
						if (b == null)
							throw new BookHandlingException("You have entered invalid ISBN: Removal Failed");
						System.out.println("Book removed : " + b);
						break;

					case 6:// Display book isbn for all books by specific author n category
						System.out.println("Enter author n category");
						String author = sc.next();
						Category bookCategory = valueOf(sc.next().toUpperCase());
						System.out.println("Book ISBNs for author " + author + " under the category " + bookCategory);
						// since it involves searching by : value based criteria : convert Map --->
						// Collection(values)
						for (Book b1 : books.values())
							if (b1.getAuthorName().equals(author) && b1.getCategory() == bookCategory)
								System.out.println(b1.getIsbn());
						break;
					case 7:// Display book isbn , qty n price for books published after a specific date.
						System.out.println("Enter publish date (yr-mon-day) ");
						LocalDate date = parse(sc.next());
						System.out.println("Details for books published after " + date);
						for (Book b1 : books.values())
							if (b1.getPublishDate().isAfter(date))
								System.out.println(b1.getIsbn() + " " + b1.getQuantity() + " " + b1.getPrice());

						break;
					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
				sc.nextLine();
			}

		}

	}

}
