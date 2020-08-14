import java.util.Arrays;
import java.util.Scanner;

public class Numbers {
//pass the array into the method
//scan the array elements
//take one element of the array and find the next largest number to it
//compare values in the array
	public static void main(String[] args) {
		Integer MAX_VALUE = 266606503;

		Scanner scan = new Scanner(System.in);
		System.out.println("please input a number for the size of the array: ");
		int a = Integer.parseInt(scan.nextLine());
		int[] group = new int[a];

		for (int index = 0; index <= group.length; index++) // loads the array of specified length
		{
			System.out.println("Enter array element number" + (index + 1) + ": ");
			group[index] = scan.nextInt();
		}

		int max = group[0]; // finds the largest array element
		for (int i = 1; i <= group.length; i++) {
			if (group[i] > max)
				max = group[i];
		}
	}

	public static void nextLargest(int[] group) {
		// should accept an array of numbers of varying length input by the user. Done.
		// output the next biggest number for each array element in the form "element:
		// next largest"
		// -test? -print each element of the array.
		// print element at index [x]: + next largest integer
		// need a way to ascribe largest integer in array as "max" Done.
		// for element

	}

}
