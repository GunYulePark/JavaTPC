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
		
//		ani.night(); 작동X. Animal형인 ani에는 night()가 없다.
//		downcasting 
//		upcasting이 되면 반드시 downcasting이 된다.

		((Cat)ani).night();
		// test. gitub 적용 되나??
		//
		
		Cat c=(Cat)ani;
		c.night();
		// 혹은 바로 하려면.
		((Cat)ani).night();
//		다형성(message polymorphism)
//		상위클래스가 하위클래스에게 동일한 메세지로 서로 다르게 동작시키는 원리
//		앞으로 적용 : 부모 클래스가 object인 경우. API에서 그런 경우 많다. 부모 클래스로 자식 클래스 조종하는 경우.
//		Object는 Animal 위에 있다.
		Object o=new Dog();
//		o.eat(); XXX o의 형이 Object로 아직 이걸로는 Dog 형 컨트롤할 수 없다.
		((Dog)o).eat();
	}

}
