package practicejavap;

import java.util.Scanner;

public class OddEven {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number: ");
	int number=scanner.nextInt();
	if(number%2==0) {
		System.out.println(number +"is even");
	}
		else {
			System.out.println(number +"is odd");
		}
	}
	
}

