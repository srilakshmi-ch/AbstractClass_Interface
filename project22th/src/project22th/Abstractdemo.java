package project22th;

import java.util.Scanner;

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}
 class Book_child extends Book
{

	@Override
	void setTitle(String s) {
		title=s;
		
	}
	
}
public class Abstractdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book title");
		str=sc.nextLine();
		Book obj=new Book_child();
		obj.setTitle(str);
		System.out.println("title of book is ="+obj.getTitle());
		
	}
}

