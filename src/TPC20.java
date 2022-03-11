import kr.tpc.Animal;
import kr.tpc.Cat;
import kr.tpc.Dog;

public class TPC20 {

	public static void main(String[] args) {
//		Dog, Cat --> Animal
		
		Dog d=new Dog();
		d.eat();
		
		Cat c=new Cat();
		c.eat();
		
//		Dog.java(x), Dog.class(o) 보안 때문에.
//		다른 사람의 코드 사용할 때, 소스코드 없으면 열어서 eat라는 동작 있는지 알 수 없다.
//		eclipse 쓰면 '.'찍으면 팝업창 올라오니까 가용한 method알 수 있다.
		
//		Animal < [Dog.class, Cat.class]
//		Animal을 통해 Dog와 Cat을 실행시키는 방법
		
//		Animal ani=new Dog();
//		ani.eat();
////		ani.follow(); // 이건 안됨. Animal(부모)가 Dog(자식)의 기능을 상속받은 것은 아니잖냐
//		
//		
//		Animal ani=new Cat();
//		ani.eat();
	}

}
