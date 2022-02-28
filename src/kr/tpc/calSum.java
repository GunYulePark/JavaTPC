package kr.tpc;

public class calSum {
//	동작(method)으로만 이루어진 객체
//	이건 왜 없어도 잘 작동하나?
//	public calSum() {
//		
//	}
	
	public void calSum(float a, float b) {
		System.out.println(a+b);
	}
	public void calSum(int a, float b) {
		System.out.println(a+b);
	}
	public void calSum(float a, int b) {
		System.out.println(a+b);
	}
	public void calSum(int a, int b) {
		System.out.println(a+b);
	}
}
