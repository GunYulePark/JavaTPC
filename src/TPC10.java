import kr.tpc.BookDTO;

public class TPC10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDTO b=new BookDTO();
		// '.':����. b.�̸� b�� ����Ű�� �� 
		b.title="Graph QL";
		b.price=16000;
		b.company="�Ѻ��̵��";
		b.page=170;
		
		System.out.print(b.title+" (");
		System.out.print(b.price+", ");
		System.out.print(b.company+", ");
		System.out.print(b.page+")");
		System.out.println();
	}
}
