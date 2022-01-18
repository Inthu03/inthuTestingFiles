 package testing;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args)  
	{
	int n, a, b, c, x, m ;
	Scanner obj=new Scanner(System.in);
	System.out.println("kindly enter the value");
	n=obj.nextInt();
    a=n/100;
    x=n%100;
    b=x/10;
    c=x%10;
    m=(c*100)+(b*10)+(c*1);
    if(n==m)
    System.out.println("The number is palidrome");
    else
    System.out.println("The number is not a palidrome");
    }
}
