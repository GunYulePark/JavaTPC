package kr.poly;

public abstract class Animal{ // 추상 클래스(불완전한 객체) > Animal ani=new Ani(); XXX 객체 생성 불가
//	Dog, cat > eat()
	public abstract void eat(); // 추상 메서드(불완전한 메서드)
	public void move() {
		System.out.println("무리를 저어서 이동한다.");
	}
}
