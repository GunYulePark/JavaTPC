import kr.tpc.BookDTO3;

public class TPC15 {

	public static void main(String[] args) {
		BookDTO3 dto=new BookDTO3();
		dto.setTitle("자바");
		// 범위 넘어가서 안들어감 > 그러면 price==0
		dto.setPrice(1000000);
		
		System.out.println(dto.getTitle());
		System.out.println(dto.getPrice());
	}
}
