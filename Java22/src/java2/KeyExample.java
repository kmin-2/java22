package java2;

import java.util.HashMap;

public class KeyExample {
	public static void main(String[] args) {
		//hascode
		//identityhashcode
		//===============================================
		//hashcode + map = hashmap
		
		//hashcode	 >> ����(key)
		//map        >> ġŲ(value)
		// ���� : ġŲ
		// ��� : ����                     Ű���� ���εǾ� �ִ�
		
		
		//key��ü�� �ĺ�Ű�� �Ͽ� String ���� �����ϴ� hashmap ��ü ����
		HashMap<key, String> hashmap= new HashMap<key, String>();
			//key�� class�� ��������
		
		//�ĺ�Ű(hashcode)�� put���� �Է�                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
		hashmap.put(new key(1), "ȫ�浿");
			//hashmap.put(new key(1), "����Ʈ����");
			//hashmap.put(new key(1), "100");
			//hashmap.put(new key(1), "3.9");
			
		//�ĺ�Ű(hashcode)�� �̿��Ͽ� ��(String)�� �о��
		String value=hashmap.get(new key(1));
		System.out.println(value);
		
	}
}
