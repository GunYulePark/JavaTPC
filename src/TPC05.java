
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
		
		// 3x3 9���� ������ ������ ������
		
		int[][] arr=new int[3][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(i*3)+(j+1);
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// �������� �迭
		int[][] star=new int[5][];
		for(int i=0; i<star.length; i++) {
			star[i]=new int[i+1];
			for(int j=0; j<star[i].length; j++) {
				star[i][j]='*';
				System.out.print((char)star[i][j]+"\t"); //ascii code�� ��µǴϱ� (char)�� ��ȯ.
			}		
			System.out.println();
		}
		
	}
}
