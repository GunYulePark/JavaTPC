                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               import kr.tpc.BookDTO2;

public class TPC14 {

	public static void main(String[] args) {
//		책>class(BookDTO)>객체>인스턴스
		String title="스프링";
		int price=25000;
		String company="제이펍";
		int page=890;
		
		BookDTO 2 dto; // dto(Object : 객체)
		dto=new BookDTO2(title, price, company, page); // dto(Instance : 인스턴스)
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO2 dto) {
//		데이터를 하나로 묶어서 이동하기 편하도록(Data Transfer Object)
		System.out.print(dto.title+"\t");
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.println(dto.page);
	}
}
