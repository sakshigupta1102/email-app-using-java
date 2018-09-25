package emailapp;

import java.util.Scanner;

public class Emailapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter your first name");
		Scanner in= new Scanner(System.in);
		String firstname= in.nextLine();
		System.out.println("enter your last name");
		Scanner ab=new Scanner(System.in);
		String lastname=in.nextLine();
     Email em1=new Email(firstname,lastname);
     System.out.println(em1.showinfo());
     
	}
	
	

}
