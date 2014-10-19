package cn.liuning.action;


import java.util.List;

import cn.liuning.domain.Book;
import cn.liuning.service.LibraryService;

import com.opensymphony.xwork2.ActionSupport;

public class GetLibraryAction extends ActionSupport {
	
	private String number;
	private String password;
	private List booklist;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List getBooklist() {
		return booklist;
	}
	public void setBooklist(List booklist) {
		this.booklist = booklist;
	}
	@Override
	public String execute() throws Exception {
		LibraryService service = new LibraryService();
		try{
			List<Book> booklist = service.find_library(number,password);
			setBooklist(booklist);
			return SUCCESS;
		}catch (Exception e){
			setBooklist(null);
			throw new Exception("—ß∫≈ªÚ’ﬂ√‹¬Î¥ÌŒÛ£°");
		}
	}	
}
