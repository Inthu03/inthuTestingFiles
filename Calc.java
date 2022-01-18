package testing;

public class Calc {
	int a,b;
	public calc(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	int add(a, b)
	{
		return a+b;
	}
	int sub(a, b)
   {
		return a-b;
   }
	int mul(a, b)
	   {
			return a*b;
	   }
	int div(a, b)
	   {
			return a/b;
	   }
	int mod(a, b)
	   {
			return a%b;
	   }
	void printval()
	{

		System.out.println("Sum"+add());
		System.out.println("sub"+sub());
		System.out.println("mul"+mul());
		System.out.println("div"+div());
		System.out.println("mod"+mod());
	}
}
public class CalcExample
{
	public static void main(String[] args)
	{
		Calc c1=new Calc(25,5);
		c1.printval();
		System.out.println("***********");
		cal c2 = new cal(15,3);
		c2.printval();
		System.out.println("***********");
		cal c3= new cal()
	}
}

