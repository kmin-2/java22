package java2;

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle=new Circle(10,20,30);
		Circle copycircle=(Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copycircle);
		
		//해시코드 되기전값 >>해쉬값
		System.out.println(System.identityHashCode(circle));  //실제 주소값확인
		System.out.println(System.identityHashCode(copycircle));//
	}
}

