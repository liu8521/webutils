package cn.liuning.domain;

public class Book {
	/**
	 * 书的条形码
	 */
	private String barcode;
	/**
	 * 书名
	 */
	private String bookname;
	/**
	 * 责任者
	 */
	private String author;
	/**
	 * 借阅日期
	 */
	private String borrowdate;
	/**
	 * 应还日期
	 */
	private String returndate;
	/**
	 * 馆藏地
	 */
	private String collectplace;
	public String getBarcode() {
		return barcode;
	}
	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBorrowdate() {
		return borrowdate;
	}
	public void setBorrowdate(String borrowdate) {
		this.borrowdate = borrowdate;
	}
	public String getReturndate() {
		return returndate;
	}
	public void setReturndate(String returndate) {
		this.returndate = returndate;
	}
	public String getCollectplace() {
		return collectplace;
	}
	public void setCollectplace(String collectplace) {
		this.collectplace = collectplace;
	}
	
	
}
