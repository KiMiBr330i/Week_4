import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please input a number for the size of the array: ");
		int a = Integer.parseInt(scan.nextLine());
		int[] group = new int[a];
		System.out.println("array elements: " + group.length);
		
		for (int index = 0; index < group.length; index++) // loads the array of specified length
		{
			System.out.println("Enter array element number" + (index+1) + ": ");
			group[index] = scan.nextInt();
		}
		
		}

	

	public static void nextLargest(int[] group) {
		
		int max = group[0]; //gives largest value in the array
		for (int i = 1; i<= group.length; i++) {
			if (group[i] > max)
				 max = group[i];
		}
		for (int i = 1; i<=group.length; i++) {
			if (group[i] == max)
				System.out.println(group[i] + ": " + Integer.MAX_VALUE);
			
			
		}
	}

}
