package kr.tpc;

public class BookDTO4 {
//	1. private으로 information hiding
	private String title;
	private int price;
	private String company;
	private int page;
//	2.디폴트 생성자를 명시적으로 만들고, 오버로딩 생성자를 만들어 적절하게 초기화한다.
//	사용 안해도 만들어놔야 error 안난다.
	public BookDTO4() {
		
	}
	
	public BookDTO4(String title, int price, String company, int page) {
		this.title = title;
		this.price = price;
		this.company = company;
		this.page = page;
	}
	
//	3. private 변수에 접근하기 위해 getter과 setter method 만들기
	public void setTitle(String title) {
		this.title=title; // 여기서 this는 BookDTO3를 가리키는 듯하다.
	}
	public String getTitle() {
		return title;
	}
	
	public void setPrice(int price) {
//		너무 큰 값이 들어가면 안들어가도록 문지기
		if(price>=1000000) {
			this.price=-1;
		} else {
			this.price=price; // 여기서 this는 BookDTO3를 가리키는 듯하다.
		}
		
	}
	
	public int getPrice() {
		return price;
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
	
//	4. toString() method 재정의. 객체가 갖고 있는 값 전체를 출력
	public String toString() {
		return "BookDTO4 [title="+title+", price="+price+", company="+company+", page="+page+"]";
	}
	
}
