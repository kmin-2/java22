package java2;
//hascode
//identityhashcode
//===============================================
//hashcode + map = hashmap

//hashcode	 >> 맥주(key)
//map        >> 치킨(value)
// 맥주 : 치킨
// 사과 : 과일                     키값과 매핑되어 있는

public class key {
	public int number;
	public key(int number) {
	this.number=number;
	}

	public int hashCode() {
		return number;
	}
	public boolean equals(Object obj) {
		//부모객체와 자식객체가 형성되어서 형변환이 가능한지 판단
		if (obj instanceof key) {
			key comparekey= (key)obj; //다운캐스팅으로 comparekey로 대입
		//this의 number와 comparekey의 number값이 같으면 true 아니면 flase
			if (number==comparekey.number) {
				return true;
			}else return false;
		}return false;
	}
	
}

//36.3
//37.1