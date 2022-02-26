import kr.tpc.BookDTO;
import kr.tpc.BookDTO2;

public class TPC14 {

	public static void main(String[] args) {
//		책>class(BookDTO)>객체>인스턴스
		String title="스프링";
		int price=25000;
		String company="제이펍";
		int page=890;
		
		BookDTO2 dto; // dto(Object : 객체)
		dto=new BookDTO2(title, price, company, page); // dto(Instance : 인스턴스)
		bookPrint(dto);
	}
	
	public static void bookPrint(BookDTO2 dto) {
		System.out.print(dto.title+"\t");
		System.out.print(dto.price+"\t");
		System.out.print(dto.company+"\t");
		System.out.println(dto.page);
	}
}
