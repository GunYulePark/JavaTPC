
public class TPC09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=56;
		int b=40;
		TPC09 tpc=new TPC09(); // 객체 생성 : heap area에. 맨 앞 TPC09는 class type
		int v=tpc.sum(a, b);
		System.out.println(v);

	}
	public int sum(int a, int b) {
		int v=a+b;
		return v;
	}
}
