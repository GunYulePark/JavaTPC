
public class TPC06 {

	public static void main(String[] args) {
		// 5. �޼��� > ����(method), ����(function)
		// ���� 2���� ���Ͽ� ������ ���Ͽ� return�ϴ� method�� �����Ͻÿ�.
		int a=2;
		int b=3;
		
		int result=sum(a, b);
		System.out.println(result);
		
		// �� ������ array�� return �ޱ�
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
	
	
	// �������� ���� return�ϰ� ���� ��. > return array
	public static int[] makeArr() {
		int[] arr=new int[3];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(i+1)*10;
		}
		return arr;
	}
	
}
