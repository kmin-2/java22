package java2;

public class Exit {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) {
				//System.exit(i); //������Ʈ ��ü�� ����
				break; //for���� ���� ���� 
			}
		}
		System.out.println("������Ʈ ����");
		
		//systemtime
		long time1=System.nanoTime();
		int sum=0;
		for (int i = 0; i < 1000000; i++) {
			sum+=i;
		}
		long time2=System.nanoTime();
		System.out.println("1~1000000������ �� : " + sum);
		System.out.println("��꿡 " +(time2-time1) + "�����ʰ� �ҿ�Ǿ���");

	
		//�ڽ̰� ��ڽ�
		//�ڽ� >>�⺻���� ��üȭ ��Ű�°�
		Integer obj1=new Integer(100);
		Integer obj2=new Integer("200");
		//Integer obj3=new Integer.valueOf("300" );
	
		//��ڽ� >>��ü�� �⺻Ÿ������ 
		int val1=obj1.intValue();
		int val2=obj2.intValue();
		System.out.println(val1);
		System.out.println(val2);
	}
}
