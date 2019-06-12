package project22th;

import java.util.Scanner;

interface Advance_Arithmetic
{
	 int divisior_sum(int n);
}
class calculator implements Advance_Arithmetic
{

	@Override
	public

   int divisior_sum(int n) {
		int sum=0,i;
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
				System.out.print(i+" + ");
			}
		}
		return sum;
	}
	
}
public class Interfacedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
    Advance_Arithmetic obj=new calculator();
    @SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
    System.out.println("enter value");
    n=sc.nextInt();
  int sum=obj.divisior_sum(n);
  System.out.println("sum of divisiors="+sum);
	}

}
