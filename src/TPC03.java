import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// ���踦 �����϶�. PDT vs. UDDT
		// ���� 1���� �����ϱ� ���� ������ �����Ͻÿ�.
		int a;
		a=10;
		
		// å 1���� �����ϱ� ���� ������ �����Ͻÿ�
		Book b;
		b=new Book(); // argument: title price company page
		b.title="���� �Ӽ�";
		b.price=15000;
		b.company="snowfox";
		b.page=350;
		System.out.print(b.title+"\t("); // �ٸ� �� �����Ϸ��� print�� �ؾ��Ѵ�.
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page+")");
		
		PersonVO p; // argument: nickName; realName;address;phoneNumber;
		p=new PersonVO();
		p.nickName="yule_mu";
		p.realName="�ڰǷ�";
		p.address="Ǫ���ַ�";
		p.phoneNumber="010-8460-8640";
		System.out.print(p.nickName+"\t(");
		System.out.print(p.realName+"\t");
		System.out.print(p.address+"\t");
		System.out.println(p.phoneNumber+")");
		
	}

}
