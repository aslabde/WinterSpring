package tk.ebalsa.dao;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import tk.ebalsa.model.Book;

public class BookDAOImpl extends HibernateDaoSupport implements BookDAO {

	//Saves customer to DB
	@Override
	public void addBook(Book book) {
		getHibernateTemplate().save(book);
		
	}

	//Return according to query
	@Override
	public List<Book> listBooks() {
		return getHibernateTemplate().find("from book");
	}

}
