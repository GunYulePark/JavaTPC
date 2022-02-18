
public class TPC05 {

	public static void main(String[] args) {
		int[] a=new int[3];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
		
		// 3x3 9개의 정수형 변수를 만들어라
		
		int[][] arr=new int[3][3];
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j]=(i*3)+(j+1);
			}
		}
		// 출력
		for(int[] x:arr) {
			for(int y:x) {
				System.out.println(y);
			}
		}
	}
}
