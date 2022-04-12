import kr.tpc.*;

public class TPC28 {

	public static void main(String[] args) {
//		Oracle, MySQL -> Driver class 필요
		인터페이스가 있으면 하위 class의 동작 방식 몰라도 조작할 수 있다.
		Dbconnect conn=new JavaOracle();
		conn.getConnection("url", "bit", "12345");
		
		conn=new JavaMySQL();
		conn.getConnection("url", "bit", "12345");
	}

}
