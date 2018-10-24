import java.util.Scanner;

public class FormLetterWriter{
	public static void main(String [] args){
		Scanner inputDevice = new Scanner (System.in);
		String firstName = "Bob";
		String lastName = "Ross";
		System.out.println();
		displaySalutation(lastName);
		displaySalutation(firstName,lastName);
		
	}
		public static void displaySalutation(String last){
			String lastName = last;
			System.out.println("Dear Mr. or Ms. " + lastName);	
			System.out.println("Thank you for your recent order.");
		
		}
		public static void displaySalutation(String first, String last){
			String firstName = first;
			String lastName = last;
			System.out.println("Dear " + firstName + " "+ lastName);	
			ystem.out.println("Thank you for your recent order.");
	
		}
}