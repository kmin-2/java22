package java2;

public class ArrayCloneTest {
	public static void main(String[] args) {
	//clone - ��ü����
	int[] arr1= {1, 2, 3, 4, 5};
	int[] arr2;
	arr2=arr1.clone();

	System.out.print("����� arr2 �迭 : ");
	for(int num: arr2) {  
		System.out.print(num + " ");}
	System.out.println();
	
	arr2[3]=0;  //arr2�� ��Ұ��� ����
	System.out.print("����� arr2 �迭 : ");
	for(int num: arr2) {  
		System.out.print(num + " ");}
	}
			
}
 