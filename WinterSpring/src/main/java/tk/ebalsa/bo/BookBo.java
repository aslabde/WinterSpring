package tk.ebalsa.bo;

import tk.ebalsa.model.Book;
import java.util.List;

public interface BookBo {
	
	void addBook (Book book);
	List<Book> listBooks();

}
