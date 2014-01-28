package tk.ebalsa.model;

public class Book implements java.io.Serializable{

	private Long bookId;
	private String author;
	private String editor;

	
	public Book(){
		
	}
	
	
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	
	
	
}
