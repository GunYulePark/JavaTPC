package kr.poly;

public class TV implements RemoCon{
	public void chUp() {
		System.out.println("TV 채널이 올라간다.");
	}
	public void chDown() {
		System.out.println("TV 채널이 내려간다.");
	}
	public void internet() {
		System.out.println("인터넷이 된다.");
	}
}
