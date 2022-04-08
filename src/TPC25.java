import kr.poly.*;

public class TPC25 {

	public static void main(String[] args) {
//		upcasting(부모의 역할로 사용: 명령을 내리는 쪽)
		Animal ani=new Dog();
//		Animal ani=new Ani(); XXX Ani는 abstract class로 자체 객체 생성 불가.
//		부모가 absract class이면 자식은 무조건 abstract method에 대해서 override 해줘야 한다.
		ani.eat(); // eat{?}-->eat{개처럼 먹다.}
//		동적 바인딩. 다형성 보장.
//		override 돼있는 상황이어야 발동
		
		
		ani.move();
		
		ani=new Cat();
		ani.eat(); // eat{?}-->eat{고양이처럼 먹다.}
		ani.move();
		((Cat)ani).night();
	}

}
