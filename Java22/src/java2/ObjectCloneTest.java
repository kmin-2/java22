package java2;

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle=new Circle(10,20,30);
		Circle copycircle=(Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copycircle);
		
		//�ؽ��ڵ� �Ǳ����� >>�ؽ���
		System.out.println(System.identityHashCode(circle));  //���� �ּҰ�Ȯ��
		System.out.println(System.identityHashCode(copycircle));//
	}
}

