package java2;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("이호진");
		String strVar2 = "이호진";
		
		System.out.println(strVar1);
		System.out.println(strVar2);  
		
		//물리적 비교판단
		if (strVar1==strVar2) {
			System.out.println("같은 String 객체를 참조");
		}else System.out.println("다른 String 객체를 참조"); //다름,,내용은 같은데 물리적 위치는 다르기 때문에
		
		//논리적비교판단
		if (strVar1.equals(strVar2)) {
			System.out.println("같은 String 객체를 참조"); //같음,, 
		}else System.out.println("다른 String 객체를 참조");

		
		
		
		//StringEquals
		String str1=new String("abc");
		String str2=new String("abc");
		
		//물리적비교판단
		System.out.println(str1==str2);  //다름, 두 String 인스턴스 주소값(heap메모리)이 다름
		//String 클래스의 equals 메소드가 재정의 되어 논리적 값이 같음을 구현
		//논리적비교판단
		System.out.println(str1.equals(str2));  //같음, 
		
		
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		System.out.println(i1==i2);  //다름
		System.out.println(i1.equals(i2));  //같음
	} 
}



