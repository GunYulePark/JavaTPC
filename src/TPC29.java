import kr.poly.*;

public class TPC29 {

	public static void main(String[] args) {
		Object a=new A();
		((A)a).display();
		System.out.println(a); // toString()의 default 기능은, a를 출력할 때 a의 주소값을 출력하는 것이다.
		// 만약 toString() override 안하면 a의 주소 출력.
		
		Object o=new A();
		((A)o).display();
		System.out.println(o.toString());
	}

}
