package java2;
class SmartPhone{
	private String company;
	private String os;
	SmartPhone(String company, String os){
		this.company=company;
		this.os=os;};
	public String com() {
		return company;}
	public String os() {
		return os;}
	public String toString() {
		return com() + " " +os();}}                                                                                                                                                                              
public class SmartPhoneExample {

	public static void main(String[] args) {
		 SmartPhone myphone=new SmartPhone("����","�ȵ���̵�");
		 
		 //System.out.println(myphone);
		 String strObj = myphone.toString();
		 System.out.println(strObj);
		 
		 
	   /*String str="";
		 String str1="Hi everybody";
		 String str2="Hava a nice Day!";
		 
		 str=str1+str2;
		 System.out.println(str);
		 System.out.println("str1 ���ڼ� : "+str1.length());
		 System.out.println("str1 d���ڼ� : "+str1.indexOf('d'));
		 System.out.println("str1 ��� �ҹ��ڷ� ��ȯ : "+str1.toLowerCase());
		 System.out.println("str1 ��� �빮�ڷ� ��ȯ : "+str1.toUpperCase());
		 
		 System.out.println("str2 ���ڼ� : "+str2.length());
		 System.out.println("str2 d���ڼ� : "+str2.indexOf('n'));
		 System.out.println("str2 ��� �ҹ��ڷ� ��ȯ : "+str2.toLowerCase());
		 System.out.println("str2 ��� �빮�ڷ� ��ȯ : "+str2.toUpperCase());*/
		 
		 
	}
}
