
import java.util.Scanner;

public class Problem1Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set up string scanner
		Scanner sc = new Scanner(System.in);
		
		//create blank string
		String userString = "";
		
		//scan their integer
		System.out.print("Please enter the 4 digit integer: ");
		int userInt = sc.nextInt();
		userString = Integer.toString(userInt);
		System.out.println("");
		
		//cupid shuffle the numbers
		userString += ((Integer.parseInt(String.valueOf(userString.charAt(2)))+7)%10);
		userString += ((Integer.parseInt(String.valueOf(userString.charAt(3)))+7)%10);
		userString += ((Integer.parseInt(String.valueOf(userString.charAt(0)))+7)%10);
		userString += ((Integer.parseInt(String.valueOf(userString.charAt(1)))+7)%10);
		
		//print their new number
		System.out.print("The encrypted code is: ");
		System.out.println(userString.substring(4,userString.length()));
		System.out.println("");
		
		//un-cupid shuffle the numbers
		userString += (((Integer.parseInt(String.valueOf(userString.charAt(2)))+10)-7)%10);
		userString += (((Integer.parseInt(String.valueOf(userString.charAt(3)))+10)-7)%10);
		userString += (((Integer.parseInt(String.valueOf(userString.charAt(0)))+10)-7)%10);
		userString += (((Integer.parseInt(String.valueOf(userString.charAt(1)))+10)-7)%10);
		
		//print decrypted value
		System.out.print("The decrypted code is: ");
		System.out.println(userInt);
	}

}
