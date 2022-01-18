package testing;

import java.util.Scanner;

public class Submission {

	public static void main(String[] args) {
			int a, V1=0, V2=0, V3=0, V4=0, sum=0;
			Scanner obj=new Scanner(System.in);	
			System.out.println("Enter the value of a");
			a=obj.nextInt();
			V1=a%3;
		    V2=a%7;
		    V3=a%17;
		    V4=a%25;
			sum=V1+V2+V3+V4;
			System.out.println("The sum of remainders "+sum);
			if(sum/2==0)
			{ 
				System.out.println("The number is Even num");
			}
			else
			{
				System.out.println("The number is Odd");
			}
	}
}

