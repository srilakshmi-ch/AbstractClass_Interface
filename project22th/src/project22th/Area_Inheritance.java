package project22th;

import java.util.Scanner;
class CircleArea {
	static double pi=3.14;

	void circleArea()
	{// TODO Auto-generated method stub
       @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
       System.out.println("enter radius");
       int r=sc.nextInt();
       double area=pi*r*r;
       System.out.println("area of circle="+area);
       
	}
}
 class RectArea extends CircleArea {

	void rectArea()
	{
		// TODO Auto-generated method stub
		double area;
		float l,b;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter lenth of l value");
	   l=sc.nextFloat();
	   System.out.println("enter breadth of b value");
	   b=sc.nextFloat();
	   area=l*b;
	   System.out.println("area of rectangle is"+area);;
	}
}
 class SquareArea extends RectArea{

		void squareArea() {
			// TODO Auto-generated method stub
	     float a;
	     @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter side of a value");
	     a=sc.nextFloat();
	     double per=a*a;
	System.out.println(" area of square is"+per);
		}

	}
class SphereArea extends SquareArea
{
	void sphereArea()
	{
		 @SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	       System.out.println("enter radius");
	       int r=sc.nextInt();
	       double area=4*pi*r*r;
	       System.out.println("sarea of sphere="+area);
	       
}
}
 
public class Area_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SphereArea ob=new SphereArea();
		System.out.println("____________________circle Area");
		ob.circleArea();
		System.out.println("____________________rectangle Area");
		ob.rectArea();
		System.out.println("____________________square Area");
		ob.squareArea();
		System.out.println("____________________sphere Area");
		ob.sphereArea();

		
	}

}
