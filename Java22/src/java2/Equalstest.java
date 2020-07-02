package java2;
class Student{
	int StudentId;
	String name;
	Student(int StudentId,String name){
		this.StudentId=StudentId;
		this.name=name;}
	public String toString(){
		return StudentId+", " +name;}
	
	public boolean equals(Object obj) {  //���� 
		//instanceof ���� >> �����ڷν� ��üŸ�� ����ȯ�� ���������� �����Ǵ�  >>boolean������ ��ȯ
		if (obj instanceof Student) {
			Student std=(Student) obj;  //�ٿ�ĳ���� : �θ�Ŭ���� ��ü�� �ڽ�Ŭ���� ��ü�� ����ȯ
				if (StudentId==std.StudentId) {
					return true;
				}else return false;
			}return false;
		}
	public int hashCode() {  //������ 
		return StudentId;
	}
}
public class Equalstest {
	public static void main(String[] args) {
		Student studentLee=new Student(100,"�̻��");
		Student studentLee2= studentLee;
		Student studentSang=new Student(100,"�̻��");
		
		System.out.println(studentLee);
		System.out.println(studentLee2);
		System.out.println(studentSang);
		

		//�����ּ��� �� �ν��Ͻ� �� 
		if (studentLee==studentLee2) {
			System.out.println("���� �ּ�");  //����
		}else System.out.println("�ٸ� �ּ�");
		if (studentLee.equals(studentLee2)) {
			System.out.println("���� �����մϴ�");  //����
		}else System.out.println("���� �������� �ʽ��ϴ�");
		
		
		//�ٸ��ּ��� �� �ν��Ͻ� ��
		if (studentLee==studentSang) {
			System.out.println("���� �ּ�");
		}else System.out.println("�ٸ� �ּ�");  //�ٸ���
		if (studentLee.equals(studentSang)) {
			System.out.println("���� �����մϴ�");  //�������̵��� ���Գ���
		}else System.out.println("���� �������� �ʽ��ϴ�");  //�������̵� �� �ٸ���
		//�ְ�����??? ���� �������� �ʴٰ� ������...  >>
		//���� �������� ����Ŭ���� �̹Ƿ� ���������� Object �޾Ƽ� ���� �Ǿ����� �׷��� �̿��ô� �����
		//Ŭ���� �̹Ƿ�  equals�� ������ �Ǿ����� �ʾƼ� �̴�.
		//>>���� ������, ���� �������̵� �ʿ���
		
		
		//�ν��Ͻ� ���� �־����� ���� �ּ�
		System.out.println("studentLee�� �����ּ� �� : " +System.identityHashCode(studentLee));
		System.out.println("studentSang�� �����ּ� �� : " +System.identityHashCode(studentSang));
		
		//�ν��Ͻ� ������ ��������� heap�޸� �ּ�
		System.out.println("studentLee�� haahcode �� : " +studentLee.hashCode());
		System.out.println("studentSang�� haahcode �� : " +studentSang.hashCode());
		
		//hascode
		//identityhashcode
		//===============================================
		//hashcode + map = hashmap
		
		//hashcode	 >> ����(key)
		//map        >> ġŲ(value)
		// ���� : ġŲ
		// ��� : ����                     Ű���� ���εǾ� �ִ�
		
	}
}
