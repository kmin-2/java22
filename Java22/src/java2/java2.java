package java2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class java2 {
	public static void main(String[] args) {
		
		String str1="";
		String str2="";
		Double num1, num2;
		char ch='A';
		//Scanner k=new Scanner(System.in);
		num1=Double.parseDouble(JOptionPane.showInputDialog("��1"));
		num2=Double.parseDouble(JOptionPane.showInputDialog("��2"));
		if (num2!=0) {
			System.out.println(num1/num2);
		}
		
		if(Character.isDigit(ch))
			System.out.println(ch+"�� ���ڰ� �ƴմϴ�.");
		else System.out.println(ch+"�� �����Դϴ�.");
	}
}
