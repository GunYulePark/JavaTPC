import kr.tpc.*;

public class TPC23 {

	public static void main(String[] args) {
//		1. 다형성 인수
		Dog d=new Dog();
		display(d);
		Cat c=new Cat();
		display(c);

	}

	private static void display(Animal r) {
//		r: 다형성 인수
		r.eat();
		if ( r instanceof Cat ) {
//			r이 Cat type으로 만들어진 instance라면 true
//			Dog일 때에는 night() 발동되지 않도록. 여기서는 Dog일 때 아예 night함수가 없다.
//			downcasting
			((Cat)r).night();
		}
	}

//	밑에 방식은 argument의 형이 달라질 때마다 따로 함수를 만들어야 해서 번거롭. 
//	private static void display(Cat c) {
//		c.eat();
//	}
//
//	private static void display(Dog d) {
//		d.eat();
//	}

}
