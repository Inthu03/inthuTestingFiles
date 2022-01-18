package testing;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark;
		Scanner input=new Scanner(System.in);
		System.out.println("kindly enter the Mark");
		 
		 if(mark==100)
		 {
			 System.out.println("O");
		 }
		 else if(mark <100 && mark>=95) {
			 System.out.println("A+");
		 }
		 else if(mark < 95 && mark>=85)
		 {
			 System.out.println("A");
		}
		 else if(mark < 75 && mark>=70)
		 {
			 System.out.println("B+");
		 }
		 else if(mark < 70)
		 {
			 System.out.println("Fail");
		 }
}
	
	

}
