package testing;

import java.util.Scanner;

public class Area  
{

	public static void main(String[] args){
			int a,b,area=0;
			Scanner obj=new Scanner(System.in);	
			System.out.println("Enter the value of a");
			a=obj.nextInt();
			System.out.println("Enter the value of b");
			b=obj.nextInt();
			System.out.println("Choose Your Obtion: \n 1. Area of Circle \n 2. Area of Square \n 3.Area of Rectangle \n 4.Area of Triangle");
			int choice=obj.nextInt();
			switch(choice)
			{
				case 1:
					area=(22*a*a)/7;
					System.out.println(area);
					break;
				case 2:
					area=a*a;
					System.out.println(area);
					break;
				case 3:
					area=a*b;
					System.out.println(area);
					break;
				case 4:
					area=(a*b)/2;
			}
	}
}


