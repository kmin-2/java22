package java2;

public class StringEqualsExample {
	public static void main(String[] args) {
		String strVar1 = new String("��ȣ��");
		String strVar2 = "��ȣ��";
		
		System.out.println(strVar1);
		System.out.println(strVar2);  
		
		//������ ���Ǵ�
		if (strVar1==strVar2) {
			System.out.println("���� String ��ü�� ����");
		}else System.out.println("�ٸ� String ��ü�� ����"); //�ٸ�,,������ ������ ������ ��ġ�� �ٸ��� ������
		
		//�������Ǵ�
		if (strVar1.equals(strVar2)) {
			System.out.println("���� String ��ü�� ����"); //����,, 
		}else System.out.println("�ٸ� String ��ü�� ����");

		
		
		
		//StringEquals
		String str1=new String("abc");
		String str2=new String("abc");
		
		//���������Ǵ�
		System.out.println(str1==str2);  //�ٸ�, �� String �ν��Ͻ� �ּҰ�(heap�޸�)�� �ٸ�
		//String Ŭ������ equals �޼ҵ尡 ������ �Ǿ� ���� ���� ������ ����
		//�������Ǵ�
		System.out.println(str1.equals(str2));  //����, 
		
		
		
		Integer i1=new Integer(100);
		Integer i2=new Integer(100);
		System.out.println(i1==i2);  //�ٸ�
		System.out.println(i1.equals(i2));  //����
	} 
}



