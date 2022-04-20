import kr.poly.*;

public class TPC30 {
	//

	public static void main(String[] args) {
//		기본
		Object a=new A();
		Object b=new B();
		
		((A)a).go();
		((B)b).go();
		
//		다형성 인수
		dp(new A());
		dp(new B());
		
//		다형성 배열
		Object[] o=new Object[2];
		o[0]=new A();
		o[1]=new B();
		for(int i=0;i<o.length;i++) {
			if (o[i] instanceof A) {
				((A)o[i]).go();
			} else if(o[i] instanceof B) {
				((B)o[i]).go();
			}
		}
		
		printGo(o);
	}
	
	private static void printGo(Object[] o) {
		for(int i=0;i<o.length;i++) {
			if (o[i] instanceof A) {
				((A)o[i]).go();
			} else if(o[i] instanceof B) {
				((B)o[i]).go();
			}
		}
	}

	public static void dp(Object o) { // 다형성 인수
		if (o instanceof A) {
			((A)o).go();
		} else if(o instanceof B) {
			((B)o).go();
		}
	}
}
