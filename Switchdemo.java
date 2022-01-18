package testing;

import java.util.Scanner;

public class Switchdemo {
	public static void main(String[] args)
	{
	int a,b,result;
	Scanner obj=new Scanner(System.in);	
	System.out.println("Enter the value of a");
	a=obj.nextInt();
	System.out.println("Enter the value of b");
	b=obj.nextInt();
	System.out.println("Choose Your Obtion: \n 1. Addition \n 2. Subtraction \n 3.Multiplication \n 4.Division");
	int choice=obj.nextInt();
	switch(choice)
	{
		case 1:
			result=a+b;
			System.out.println(result);
			break;
		case 2:
			result=a-b;
			System.out.println(result);
			break;
		case 3:
			result=a/b;
			System.out.println(result);
			break;
		case 4:
			result=a*b;
			System.out.println(result);
			break;
	}
	
	}

}
