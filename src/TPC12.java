import kr.tpc.BookVO2;

public class TPC12 {

	public static void main(String[] args) {
		BookVO2 b1=new BookVO2();
		System.out.println(b1.getTitle());
		
		BookVO2 b2=new BookVO2("자바", 20000, "길벗", 790);
		System.out.print(b2.getTitle()+"\t");
		System.out.print(b2.getPrice());
//		System.out.print(b2.company+"\t");
//		System.out.println(b2.page);
	}
}