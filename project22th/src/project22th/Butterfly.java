package project22th;
class critter
{
	 static int count=0;
	int legs=4;
	int eyes=2;
	int nose=1;
	int mouth=1;
	void dispCritter_prop()
	{
	System.out.println("legs="+legs);
	System.out.println("eyes="+eyes);
	System.out.println("nose="+nose);
	System.out.println("mouth="+mouth);
}}
class Butterflydemo extends critter
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
	void dispButerfly_prop()
	{
		dispCritter_prop();
		System.out.println("wings="+wings);
		System.out.println("colour="+col);
		
	}
	
	
}


public class Butterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Butterflydemo ob=new Butterflydemo();
     ob.dispButerfly_prop();
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
