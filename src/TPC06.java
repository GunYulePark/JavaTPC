
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
