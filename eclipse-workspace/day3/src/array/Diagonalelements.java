package array;

public class Diagonalelements {
	public static void main(String[] args) {
		int[][] matrix = {{1,4,3,2},{4,3,5,6,},{7,5,8,9,},{3,4,5,6}};
		
		int sum = 0;
		
		for(int i = 0; i < matrix.length; i++)
		{
			sum = sum + matrix[i][i];
		}
		System.out.println("sum of diagonal elements is :" +sum);
		
	}


}
