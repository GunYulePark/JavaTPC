package kr.tpc;
// 여기 public은 이 class 자체에 대한 접근 가능성
public class PrivatePractice_2 {
	// 여기 private은 이 객체의 공간을 맨 처음 생성할 때 접근 가능하게 할 것인지. 
	private PrivatePractice_2() {
		
	}
	
	// Instance method
	public void tpc() {
		System.out.println("Is there any 'tpc' out there?");
	}
	
	// Class method
	public static void java() {
		System.out.println("I can touch you 'java'!");
	}
}