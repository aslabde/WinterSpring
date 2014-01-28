package tk.ebalsa.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import tk.ebalsa.model.Book;

public class BookDAOImpl extends HibernateDaoSupport implements BookDAO {

	//Saves customer to DB
	public void addBook(Book book) {
		getHibernateTemplate().save(book);
		
	}

	//Return according to query
	public List<Book> listBooks() {
		return getHibernateTemplate().find("from book");
	}

}
