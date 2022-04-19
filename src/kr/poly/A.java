package kr.poly;

//기본적으로 생략 되어있는 부분
import java.lang.*;
public class A extends Object {
	public A() {
		super();
	}
//	생략 되어있는 부분 여기까지
	
	public void display() {
		System.out.println("나는 A이다.");
	}
	
	public void go() {
		System.out.println("A 앞으로!");
	}
	@Override
	public String toString() {
		return "재정의된 method입니다.";
	}
	
//	toString() 재정의
	
}
