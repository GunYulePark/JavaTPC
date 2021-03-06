package kr.tpc;

public class BookVO2 {
	
	

	private String title;
	private int price;
	private String company;
	private int page;
	// default constructor method(원래는 생략)
	
	
	// 객체지향에서는 함수의 이름이 같아도 argument의 개수 or type이 다르면 서로 다른 함수로 인식해서 error가 발생하지 않는다.
	// default constructor method
	public BookVO2() {
		this.title="제목";
		this.price=00000;
		this.company="출판사";
		this.page=000;
	} // 앞에 내용들은 없어도 된다.
	//warn 생성자가 하나 만들어져 있으면 default 생성자는 자동으로 만들어지지 않는다!!!!
	//그렇기 때문에 바로 위에 constructor method 만드는 작업 해줘야 한다.
	
	// constructor method의 Overloading
	public BookVO2(String title, int price, String company, int page) {
		// 초기화 작업
		this.title=title;
		this.price=price;
		this.company=company;
		this.page=page;
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
