import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDTO b=new BookDTO();
		// '.':참조. b.이면 b가 가리키는 곳 
		b.title="Graph QL";
		b.price=16000;
		b.company="한빛미디어";
		b.page=170;
		
		System.out.print(b.title+" (");
		System.out.print(b.price+", ");
		System.out.print(b.company+", ");
		System.out.print(b.page+")");
		System.out.println();
	}
}