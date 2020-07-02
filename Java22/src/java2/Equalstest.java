package java2;
class Student{
	int StudentId;
	String name;
	Student(int StudentId,String name){
		this.StudentId=StudentId;
		this.name=name;}
	public String toString(){
		return StudentId+", " +name;}
	
	public boolean equals(Object obj) {  //논리적 
		//instanceof 연산 >> 연산자로써 객체타입 형변환이 가능한지의 여부판단  >>boolean값으로 변환
		if (obj instanceof Student) {
			Student std=(Student) obj;  //다운캐스팅 : 부모클래스 객체가 자식클래스 객체로 형변환
				if (StudentId==std.StudentId) {
					return true;
				}else return false;
			}return false;
		}
	public int hashCode() {  //물리적 
		return StudentId;
	}
}
public class Equalstest {
	public static void main(String[] args) {
		Student studentLee=new Student(100,"이상원");
		Student studentLee2= studentLee;
		Student studentSang=new Student(100,"이상원");
		
		System.out.println(studentLee);
		System.out.println(studentLee2);
		System.out.println(studentSang);
		

		//동일주소의 두 인스턴스 비교 
		if (studentLee==studentLee2) {
			System.out.println("같은 주소");  //같다
		}else System.out.println("다른 주소");
		if (studentLee.equals(studentLee2)) {
			System.out.println("내용 동일합니다");  //같다
		}else System.out.println("내용 동일하지 않습니다");
		
		
		//다른주소의 두 인스턴스 비교
		if (studentLee==studentSang) {
			System.out.println("같은 주소");
		}else System.out.println("다른 주소");  //다르다
		if (studentLee.equals(studentSang)) {
			System.out.println("내용 동일합니다");  //오버라이딩후 같게나옴
		}else System.out.println("내용 동일하지 않습니다");  //오버라이딩 전 다르다
		//왜같은데??? 내용 동일하지 않다고 나오닝...  >>
		//앞의 예제들은 래퍼클래스 이므로 내장형으로 Object 받아서 쓰게 되어있음 그런데 이예시는 사용자
		//클래스 이므로  equals이 재정의 되어있지 않아서 이다.
		//>>따라서 물리적, 논리적 오버라이딩 필요함
		
		
		//인스턴스 전에 주어지는 실제 주소
		System.out.println("studentLee의 실제주소 값 : " +System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제주소 값 : " +System.identityHashCode(studentSang));
		
		//인스턴스 생성시 만들어지는 heap메모리 주소
		System.out.println("studentLee의 haahcode 값 : " +studentLee.hashCode());
		System.out.println("studentSang의 haahcode 값 : " +studentSang.hashCode());
		
		//hascode
		//identityhashcode
		//===============================================
		//hashcode + map = hashmap
		
		//hashcode	 >> 맥주(key)
		//map        >> 치킨(value)
		// 맥주 : 치킨
		// 사과 : 과일                     키값과 매핑되어 있는
		
	}
}
