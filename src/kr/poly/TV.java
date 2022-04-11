package kr.poly;

public class TV implements RemoCon{
	int currCH=70;
	public void chUp() {
		if(currCH<RemoCon.MAXCH) {
			//MAXCH는 RemoCon에서 static 변수이기 때문에 RemoCon.MAXCH으로 접근.
			currCH++;
		} else {
			currCH=RemoCon.MINCH;
		}
		System.out.println("TV 채널이 올라간다.:"+currCH);
		
	}
	public void chDown() {
		if(currCH>RemoCon.MINCH) {
			currCH--;
		} else {
			currCH=RemoCon.MAXCH;
		}
		System.out.println("TV 채널이 내려간다.:"+currCH);
	}
	
	public void internet() {
		System.out.println("인터넷이 된다.");
	}
}
