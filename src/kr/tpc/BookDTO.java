package kr.tpc;

public class BookDTO {
	public String title;
	public int price;
	public String company;
	public int page;
	// 디폴트 생성자 메서드(생략됨)
	public BookDTO() {
		// 객체를 생성하는 작업 수행 (기계어 코드 단에서 heap메모리에 생성)
		// 그러면서 자기자신을 가리키는 'this'라는 객체도 만들어진다.
		super();
	}
}