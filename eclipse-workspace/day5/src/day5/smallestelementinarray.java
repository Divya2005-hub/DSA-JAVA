package day5;

public class smallestelementinarray {
	public static void main(String[] args) {
		int[]arr = {25,7,32,5};
		int smallest = arr[0];
		for(int i = 1; i < arr.length;i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("smallest element in the array: "+smallest);
			}
		
	}
	


