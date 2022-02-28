import kr.tpc.BookDTO4;

public class TPC16 {

	public static void main(String[] args) {
//		맨 처음 초기화 해서 하는 방법
		BookDTO4 dto1=new BookDTO4("파이썬", 15000, "나랑출판사", 300);
		System.out.println(dto1.toString());
		// .toString은 생략 가능
		System.out.println(dto1);
		
		
//		그냥 초기화 시점엔 데이터 안넣고 그 다음에 넣는 방법
//		혹은 dto1을 수정할 때도 이 방법 써도 된다.
		BookDTO4 dto2=new BookDTO4();
		dto2.setTitle("자바");
		// 범위 넘어가서 안들어감 > 그러면 price==0
		dto2.setPrice(1000000);
		dto2.setCompany("한빛출판사");
		dto2.setPage(520);
		System.out.println(dto2);
	}
}