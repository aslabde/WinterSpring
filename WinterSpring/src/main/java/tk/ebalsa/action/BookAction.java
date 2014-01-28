package tk.ebalsa.action;

import java.util.ArrayList;
import java.util.List;

import tk.ebalsa.bo.BookBo;
import tk.ebalsa.model.Book;

import com.opensymphony.xwork2.ModelDriven;

public class BookAction implements ModelDriven {
	
	Book book = new Book();
	List<Book> bookList = new ArrayList<Book>();
		
	BookBo bookBo;
	
	//DI with Spring
	
	public void setBookBo(BookBo bookBo){
		this.bookBo=bookBo;
	}
	

	public Object getModel() {
		return book;
	}

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	
	
	//BUSINESS OPERATIONS:
	
	//Save book
	public String addBook() throws Exception{
		
		//save
		bookBo.addBook(book);
		
		//update list
		bookList=null;
		bookList=bookBo.listBooks();
		
		return "success";
		
	}
	
	
	//List books.
	public String listBooks() throws Exception{
		
		bookList=bookBo.listBooks();
		
		return "sucess";
	}

	


}
