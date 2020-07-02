package java2;

public class ArrayCloneTest {
	public static void main(String[] args) {
	//clone - 객체복사
	int[] arr1= {1, 2, 3, 4, 5};
	int[] arr2;
	arr2=arr1.clone();

	System.out.print("복사된 arr2 배열 : ");
	for(int num: arr2) {  
		System.out.print(num + " ");}
	System.out.println();
	
	arr2[3]=0;  //arr2의 요소값을 변경
	System.out.print("변경된 arr2 배열 : ");
	for(int num: arr2) {  
		System.out.print(num + " ");}
	}
			
}
 