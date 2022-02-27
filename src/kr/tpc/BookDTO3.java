package kr.tpc;

public class BookDTO3 {
	private String title;
	private int price;
	private String company;
	private int page;
	
	public void setTitle(String title) {
		this.title=title; // 여기서 this는 BookDTO3를 가리키는 듯하다.
	}
	public String getTitle() {
		return title;
	}

}
