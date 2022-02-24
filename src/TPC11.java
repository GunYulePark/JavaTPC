import kr.tpc.BookVO;

public class TPC11 {

	public static void main(String[] args) {
		BookVO b=new BookVO();
		b.title="Graph QL in Action";
		b.price=16000;
		b.company="한빛미디어";
		b.page=500;
		
		System.out.print(b.title+"\t");
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page);
	}

}
