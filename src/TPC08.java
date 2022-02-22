
public class TPC08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		int b=50;
		int v=sum(a, b); // static method call - 글 기울어져 있다.
		System.out.println(v);
	}
	
	public static int sum(int a, int b) {
		int sum=a+b;
		return sum;
	}

}
