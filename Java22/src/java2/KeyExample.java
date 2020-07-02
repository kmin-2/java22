package java2;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//hascode
		//identityhashcode
		//===============================================
		//hashcode + map = hashmap
		
		//hashcode	 >> 맥주(key)
		//map        >> 치킨(value)
		// 맥주 : 치킨
		// 사과 : 과일                     키값과 매핑되어 있는
		
		
		//key객체를 식별키로 하여 String 값을 저장하는 hashmap 객체 생성
		HashMap<key, String> hashmap= new HashMap<key, String>();
			//key의 class를 만들어서했음
		
		//식별키(hashcode)에 put으로 입력                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		hashmap.put(new key(1), "홍길동");
			//hashmap.put(new key(1), "소프트웨어");
			//hashmap.put(new key(1), "100");
			//hashmap.put(new key(1), "3.9");
			
		//식별키(hashcode)를 이용하여 값(String)을 읽어옴
		String value=hashmap.get(new key(1));
		System.out.println(value);
		
	}
}
