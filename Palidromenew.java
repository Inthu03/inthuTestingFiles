package testing;

import java.util.Scanner;

public class Palidromenew {
public static void main(String[] args) 
{
	int temp,n,x=0,a;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the Number");
	n = input.nextInt();
	temp=n;
	while(n>0)
{
		a=n%10;
		x=(x*10)+a;
		n=n/10;
}
	if(temp==x)
		System.out.println("palindrome");
	else
		System.out.println("Not Palindrome");
}
}
