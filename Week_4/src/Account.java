//-----------------------------------------------------------------------
// Lab 4 exercise 2 - CPSC-50100-002
// Kip Brower 08-11-20
// Account.java - prints boxes composed of * and c characters respectively.
//-----------------------------------------------------------------------
public class Account {

	public static int numAccounts = 0;

	public static void main(String[] args) {
		new Account(); 
		new Account();
		new Account();
		new Account();
		new Account();
		Account.getNumAccounts(numAccounts);

	}

	public Account() {  //constructor method for counting number of new account objects created
		numAccounts = numAccounts + 1;

	}

	public static int getNumAccounts(int numAccounts) { //getter for the number of newly created accounts in the main method.
		System.out.println(numAccounts);
		return numAccounts;
	
	}

}
