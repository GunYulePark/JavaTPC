package kr.poly;

public class Dog extends Animal{
	
//	Override
	public void follow() {
		System.out.println("주인을 잘 따른다.");
	}

@Override
public void eat() {
	System.out.println("개처럼 먹다.");
}
}
