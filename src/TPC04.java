
public class TPC04 {

	public static void main(String[] args) {
//		int[] array;
//		array=new int[3];

		int[] array=new int[3];
		for(int i=0; i<3; ++i) {
			array[i]=(i+1)*10;
		}

		for(int x:array) {
			System.out.print(" "+x);
		}
			
	}

}
