package kr.tpc;

public class Dog extends Animal{
	public void eat() {
		System.out.println("개처럼 잘 먹다.");
	}
//	Override
	public void follow() {
		System.out.println("주인을 잘 따른다.");
	}
}
