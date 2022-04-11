package kr.poly;

public interface RemoCon { //자체 객체생성 불가.
//	public static final(상수)이 생략 되어 있음.
//	객체를 생성하지 않고 접근하는 방법(현재 RemoCon함수는 자체 객체 생성 불가) : className.static 변수 > 그래서 static
//	final이 붙는 이유 : 상수. 자식 class에서 바꾸면 안됨.
	
	int MAXCH=100;
	int MINCH=1;
	
	public abstract void chUp(); //abstract 생략 가능.
	public void chDown();
	public void internet();
}