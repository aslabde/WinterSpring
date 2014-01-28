package tk.ebalsa.bo;

import java.util.List;

import tk.ebalsa.dao.BookDAO;
import tk.ebalsa.model.Book;

public class BookBoImpl implements BookBo{

	BookDAO bookDAO;
	//DI with Spring setter
	public void setBookDAO (BookDAO bookDAO){
		this.bookDAO = bookDAO;
	}
	
	
	
	//Uses DAO interface; Implementation remains hidden.

	public void addBook(Book book) {
		bookDAO.addBook(book);
		
	}

	//Uses DAO interface; Implementation remains hidden.

	public List<Book> listBooks() {
		
		return bookDAO.listBooks();
	}

}
