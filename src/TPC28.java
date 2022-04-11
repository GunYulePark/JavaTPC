import kr.tpc.*;

public class TPC28 {

	public static void main(String[] args) {
//		Oracle, MySQL -> Driver class 필요
		Dbconnect conn=new JavaOracle();
		conn.getConnection("url", "bit", "12345");
		
		
	}

}
