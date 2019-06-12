package project22th;
class critter1
{
	static int count=0;
}
class Butterflydemo1 extends critter
{
	int wings=2;
	String col="yellow";
	void fly()
	{
		System.out.println(" butterfly is flying with "+wings+"wings");
		count++;
		string(count);
		
	}
	void string(int count)
	{
		if(count%2==0)
			System.out.println(+count+" move = a");
		else
			System.out.println(+count+" move = x");
	}
	
	
	
}


public class But {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Butterflydemo ob=new Butterflydemo();
     ob.fly();
     ob.fly();
     ob.fly();
     ob.fly();
     ob.fly();
     ob.fly();
     ob.fly();
     ob.fly();
	}

}

