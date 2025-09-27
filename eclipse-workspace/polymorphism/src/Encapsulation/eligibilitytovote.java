package Encapsulation;
import java.util.Scanner;

public class eligibilitytovote {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a age");
		int age=sc.nextInt();{
			if (age > 18) {
		System.out.println(age + "eligibility to vote");
		}
		else  {
			System.out.println(age + " not eligibility to vote ");
		}
		}
	}
}
		

		
	


