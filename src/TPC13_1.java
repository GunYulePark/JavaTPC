import kr.tpc.PrivatePractice_1;

public class TPC13_1 {

	public static void main(String[] args) {
		// 1. private P.P를 안했을 때:
		
		
		PrivatePractice_1 pp=new PrivatePractice_1();
		pp.tpc();
//		pp.java(); // > 이거 되지만 굳이 이렇게 하는 사람 없다. static이니까 바로 PrivatePracitice.java()로 하지.
		// 객체 생성해서 접근 하는 방식
	
		PrivatePractice_1.java();
		// static에 있으니까 객체 생성하지 않고도 접근 가능.
	}

}
