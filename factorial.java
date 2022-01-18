package testing;

public class factorial {

	public static void main(String[] args) 
{
		// TODO Auto-generated method stub
int a=17;
long fact=1;
for(a=17;a>=1;a--)
{
	fact=fact*a;
	System.out.println(" " +fact);
}
System.out.println("Factorial of " +17+ " is " +fact);
if(fact<1700)
{
	System.out.println("GIRI");
}
else
{
	System.out.println("INTHU");
}
}
}
