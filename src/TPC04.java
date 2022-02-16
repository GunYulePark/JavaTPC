
public class TPC04 {

	public static void main(String[] args) {
		// 4. 데이터를 이동하라(변수 vs 배열)
		// 1) 변수
		int a,b,c;
		a=10;
		b=20;
		c=30;
		sum(a,b,c);
		// 2) 배열
		int[] arr=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		sum1(arr);
	}
	
	public static void sum(int x, int y, int z) {
		int sum=x+y+z;
		System.out.println(sum);
	}
	public static void sum1(int[] arr) {
		int sum=0;
		for(int x:arr) {
			sum+=x;
		}
		System.out.print(sum);
	}
	
//	int[] array=new int[3];
//	for(int i=0; i<3; ++i) {
//		array[i]=(i+1)*10;
//	}
//
//	for(int x:array) {
//		System.out.print(" "+x);
//	}	
}
		
