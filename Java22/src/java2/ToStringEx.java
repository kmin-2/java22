package java2;
/*
class Book {
	String title;
	String author;
	Book(String title,String author){
		this.title=title;
		this.author=author;}
	public String toString() {
		return title+", "+author;}}

public class ToStringEx{
	public static void main(String[] args) {
		Book book=new Book("JAVA","È«±æµ¿");
		System.out.println(book);
		
		String str=new String("test");
		System.out.println(str);
	}}
*/

import java.util.Date;
class Bk{
	int booknumber;
	String bookTitle;
	Bk(int booknumber, String bookTitle){
		this.booknumber=booknumber;
		this.bookTitle=bookTitle;}
	public String toString() {
		return booknumber+" " +bookTitle;
	};
}

public class ToStringEx{
	public static void main(String[] args) {
		Object obj1=new Object();
		Date obj2=new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		Bk book1=new Bk(200,"°³¹Ì");
		System.out.println(book1);
		System.out.println(book1.toString());
		
		
	}
}
