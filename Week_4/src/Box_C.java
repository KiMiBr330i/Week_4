//-----------------------------------------------------------------------
// Lab 4 exercise 1 - CPSC-50100-002
// Kip Brower 08-11-20
// Box_C.java - prints boxes composed of * and c characters respectively.
//-----------------------------------------------------------------------
public class Box_C {

	int size = 0;
	public static char c = 'c';

	public static void main(String[] args) {
		Box_C square = new Box_C();
		square.setSize();
		square.printBox();
		square.printBox(c);
	}

	public void setSize() { //method to set the size variable in the printBox method
		size = 5;
	}

	public void printBox() { //method that prints the box of star characters of specified size.

		for (int num = 1; num <= size; num++) {  //loop for size rows.
			{
				for (int i = 1; i <= size; i++) //loop for size columns.
					System.out.print("*");
				System.out.println();
			}

		}

	}
	
	
	public void printBox(char c) { //nested loop for the "c" box.
		
		for (int num = 1; num <= size; num++) { 
			{
				for (int i = 1; i <= size; i++) 
					System.out.print(c);
				System.out.println();
			}

		}

	}
}
