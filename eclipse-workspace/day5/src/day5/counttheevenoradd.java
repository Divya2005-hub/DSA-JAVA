package day5;
import java.util.Scanner;
public class counttheevenoradd {
 public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("enter the num of the array:");
	int n = sc.nextInt();
	int evencount = 0, oddcount = 0;
	System.out.println("enter"+n +"elements");
	for(int i = 0; i <n;i++) {
		int num = sc.nextInt();
		if (num % 2 == 0)
		{
			
			evencount++;
		}
		else {
			
			oddcount ++;
			
		}
	}
	System.out.println("total even numbers:"+evencount);
	System.out.println("total even numbers:"+oddcount);
	
	
}

}
