import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC21 {

	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.eat();
		
//		Dog.class, Cat.class 파일만 줬을 때.
//		(Dog.java, Cat.java 없을 경우)
		
//		upcasting : 자식 요소를 부모에게 넘겨줌.
		Animal ani=new Dog();
		ani.eat();
		
		ani=new Cat();
		ani.eat();
		
//		ani.night(); Animal형인 ani에는 night()가 없다.
//		upcasting이 되면 반드시 downcasting이 된다.
		((Cat)ani).night();
		// test. gitub 적용 되나??
		//
		
	}

}
