package java2;
//hascode
//identityhashcode
//===============================================
//hashcode + map = hashmap

//hashcode	 >> ����(key)
//map        >> ġŲ(value)
// ���� : ġŲ
// ��� : ����                     Ű���� ���εǾ� �ִ�

public class key {
	public int number;
	public key(int number) {
	this.number=number;
	}

	public int hashCode() {
		return number;
	}
	public boolean equals(Object obj) {
		//�θ�ü�� �ڽİ�ü�� �����Ǿ ����ȯ�� �������� �Ǵ�
		if (obj instanceof key) {
			key comparekey= (key)obj; //�ٿ�ĳ�������� comparekey�� ����
		//this�� number�� comparekey�� number���� ������ true �ƴϸ� flase
			if (number==comparekey.number) {
				return true;
			}else return false;
		}return false;
	}
	
}

//36.3
//37.1