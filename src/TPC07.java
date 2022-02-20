
public class TPC07 {

	public static void main(String[] args) {
		// 1) Call by value
		int a=20;
		float b=256.7f;
		float v=sum(a, b);
		System.out.println(v);
		
		// 2) Call by reference
		int[] arr= {10, 20, 30};
		int v2=arrSum(arr);
		System.out.println(v2);
	}
	public static float sum(int a, float b) {
		float v=a+b;
		return v;
	}
	
	public static int arrSum(int[] arr) {
		int sum=0;
		for (int x:arr) {
			sum+=x;
		}
		return sum;
	}

}
