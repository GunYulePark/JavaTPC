import kr.tpc.PrivatePractice_2;

public class TPC13_2 {

	public static void main(String[] args) {
		
		// 2. private P.P했을 때
		// 가동되는 경우
		PrivatePractice_2.java();
		
		// Java API 생성자가 private인 경우
//		System sys=new System(); // 이게 안되는 건 System이 private인 경우.
		System.out.println("출력");
		
		int v=Math.max(10, 20);
		System.out.println(v);
	}

}
