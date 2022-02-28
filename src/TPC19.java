import java.text.Format;

import com.google.gson.Gson;

import kr.tpc.BookDTO4;
import kr.tpc.MyUtil;

//import java.lang.*; // * 안에 있는 모든 요소들 불러옴. String과 System도 포함
//default package
public class TPC19 {

	public static void main(String[] args) {
//		1. Java에서 제공해주는 class들.. API
//		String이라는 class
//		String 하위에 있는 method를 이용
		String str=new String("APPLE");
		System.out.println(str.toLowerCase());
			
//		2. 직접 만들어서 사용하는 class들..DTO/VO, DAO, Utility ..API
		MyUtil mu=new MyUtil();
		System.out.println(mu.sum());
		
//		3. 외부에서 만들어서 놓은 class들..API
//		Gson > Json
		
		Gson g=new Gson();
		BookDTO4 dto=new BookDTO4("자바", 13000, "영진", 800);
		String json=g.toJson(dto);
		System.out.println(json);
		
//		json : 문자열 format으로 만든다. {"key": value}
//		data exchange Format / 다른 쪽으로 데이터 보낼 때 활용 많이 한다.
//		{"title":"자바","price":13000,"company":"영진","page":800}
	}


}
