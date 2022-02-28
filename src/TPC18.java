import kr.tpc.MovieVO;

public class TPC18 {

	public static void main(String[] args) {
//		배열 방법1
		int[] arr=new int[5];
		for(int i=0; i<5; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
//		배열 방법2
		int[] b= {10, 20, 30, 40, 50};
		for(int x:b) {
			System.out.print(x+"\t");
		}
		System.out.println();
//		배열 방법3
		int[] c=new int[] {100, 200, 300, 400, 500};
		for(int x:c) {
			System.out.print(x+"\t");
		}
		System.out.println();
		
//		class 영화(제목, 가격, 주인공, 등급, 시간
		MovieVO mv=new MovieVO("Frozen", 18000, "Elsa", 12, 15.3f);
		
//		Object 배열
		MovieVO[] mv_arr=new MovieVO[3];
		mv_arr[0]=new MovieVO("Fargo", 15000, "Jerry", 19, 12.1f);
		mv_arr[1]=new MovieVO("Magnolia", 17000, "Tim", 12, 18.0f);
		mv_arr[2]=new MovieVO("Negotiator", 13000, "Nick", 15, 10.5f);
		for(MovieVO x:mv_arr) {
			System.out.println(x);
		}

	}

}
