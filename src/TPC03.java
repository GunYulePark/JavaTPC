import kr.bit.Book;
import kr.bit.PersonVO;

public class TPC03 {

	public static void main(String[] args) {
		// 관계를 이해하라. PDT vs. UDDT
		// 정수 1개를 저장하기 위한 변수를 선언하시오.
		int a;
		a=10;
		
		// 책 1권을 저장하기 위한 변수를 선언하시오
		Book b;
		b=new Book(); // argument: title price company page
		b.title="돈의 속성";
		b.price=15000;
		b.company="snowfox";
		b.page=350;
		System.out.print(b.title+"\t("); // 다른 거 삽입하려면 print로 해야한다.
		System.out.print(b.price+"\t");
		System.out.print(b.company+"\t");
		System.out.println(b.page+")");
		
		PersonVO p; // argument: nickName; realName;address;phoneNumber;
		p=new PersonVO();
		p.nickName="yule_mu";
		p.realName="박건률";
		p.address="푸른솔로";
		p.phoneNumber="010-8460-8640";
		System.out.print(p.nickName+"\t(");
		System.out.print(p.realName+"\t");
		System.out.print(p.address+"\t");
		System.out.println(p.phoneNumber+")");
		
	}

}
