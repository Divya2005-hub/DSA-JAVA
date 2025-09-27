package Encapsulation;

import java.util.Scanner;

public class checkifpersonisadult_teenager_or_child {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a age");
		int age=sc.nextInt();{
			if (age < 13) {
		System.out.println(age + " person is child");
		}
		else if (age >= 13 && age <= 19) {
			System.out.println(age + " person is teenager");
		}
		else {
			System.out.println(" person is adult");
		}
		}
	}
}

	


