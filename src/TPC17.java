import kr.tpc.calSum;

public class TPC17 {

	public static void main(String[] args) {
//		method의 OverLoading
		calSum cs=new calSum();
		
//		정적 바인딩 / 컴파일 할 때 이미 호출될 메서드가 결정되어있다.
//		calSum_float_float()
		cs.calSum(4.3f, 5.2f);
//		calSum_int_float()
		cs.calSum(4, 5.2f);
		cs.calSum(4.3f, 5);
		cs.calSum(4, 5);
		
	}

}
