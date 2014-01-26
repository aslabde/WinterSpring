package tk.ebalsa.dao;

import java.util.List;
import tk.ebalsa.model.Book;

public interface BookDAO {
	
	void addBook (Book book);
	List<Book> listBooks();

}
