
public class TPC06 {

	public static void main(String[] args) {
		// 5. 메서드 > 동작(method), 기증(function)
		// 정수 2개를 더하여 총합을 구하여 return하는 method를 정의하시오.
		int a=2;
		int b=3;
		
		int result=sum(a, b);
		System.out.println(result);
		
		// 값 여러개 array로 return 받기
		int[] arr=makeArr();
		int result2=0;
		for(int x:arr) {
			result2+=x;
		}
		System.out.println(result2);
	}
	
	public static int sum(int x, int y) {
		int v=x+y;
		return v;
	}
	
	
	// 여러개의 값을 return하고 싶을 때. > return array
	public static int[] makeArr() {
		int x=10;
		int y=20;
		int z=30;
		
		int[] list=new int[3];
		list[0]=x;
		list[1]=y;
		list[2]=z;
		
		return list;
	}
	
}
