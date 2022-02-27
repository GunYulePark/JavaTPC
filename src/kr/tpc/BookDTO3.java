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
	
	public void setPrice(int price) {
//		너무 큰 값이 들어가면 안들어가도록 문지기
		if(price>=1000000) {
		} else {
			this.price=price; // 여기서 this는 BookDTO3를 가리키는 듯하다.
		}
		
	}
	
	public int getPrice() {
		if (price==0) {
			return -1;
		} else {
			return price;
		}

	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
}
