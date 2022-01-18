package testing;

import java.util.Scanner;

public class Accesscard {
	public main() {
		System.out.println("Hi form another main");
	}
	public static void main(String[] args) {
	char tasty;
	Scanner obj= new Scanner(System.in);
	do {
		System.out.println("For continue press 1 otherwise 0");
		tasty = obj.next().charAt(1);
		}while(flag=='y');
		obj.close();
	   }
}
