package emailapp;

import java.util.Scanner;

public class Email {
	private String firstname;
	private String lastname;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private String companysuffix="aeycompany.com";
	int depchoice;
	private String email;
	public Email(String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;	
		System.out.println("email created" +" "+ this.firstname + " " + this.lastname);
		this.department=setDepartment();
		System.out.println("department is  " + this.department);
		if(depchoice==1||depchoice==2||depchoice==3)
		{this.randompassword(8);
		System.out.println("your pass word is " + this.randompassword(8));
		}
		else
		{System.out.println("you dont belong to any dep , so no password");
		}
		email= firstname.toLowerCase()+"." +lastname.toLowerCase()+"@"+department+"." +companysuffix;
		System.out.println("your email is "+ email);
		
	}
	
	
	
	
	private String setDepartment()
	{
		System.out.println("department code \n 1 for sales \n 2 for development \n 3 for accounting \n 0 for none");
		Scanner in=new Scanner(System.in);
	 depchoice=in.nextInt();
		if(depchoice==1) 
		{ return "sales";}
		else if(depchoice==2)
		{return "development";}
		else if(depchoice==3)
		{return "accounting";}
		else 
		{return "nothing";}
	}
	
private String randompassword(int length){
	String passwordset="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789!@#$%&";
	char[] password=new char[length];
	for(int i=0;i<length;i++){
		int rand =(int) (Math.random()*passwordset.length());
		password[i]=passwordset.charAt(rand);
		
		
	}
	return new String(password);
	
}
	public void setmailboxcapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	
	public void setalternateemail(String altemail  )
	{
		this.alternateEmail=altemail;
		
	}
	
	public void changepassword(String password)
	{
		this.password=password;
		
	}
	public int getmailboxcapacity(){return mailboxCapacity;}
	public String getalternateemail(){return alternateEmail;}
	public String getpassword(){return password;}
	
	public String showinfo()
	{
		return "DISPLAY  NAME  "+ firstname+ " "+ lastname  + " \n company email " + email+ " \n mailbox capacity "+ mailboxCapacity;
		        
	}
 
 }
