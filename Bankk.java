import java.util.*;
class  BankATMException extends Exception
{
	public BankATMException()
	{
		super("Exception occured. Balance is below 10000 or withdrawal amount is greater than available amount!");
	}
}
class BankAtm
{
	int atmId = 9542;
	String bankName = "Indian Bank";
	String location = "Delhi";
	double balance;

	Scanner obj = new Scanner(System.in);
	
	public void AvailB()
	{
		System.out.println("atmId : "+atmId + "\n bankName : "+bankName + "\n location :"+location+" \n balance : "+balance);
	}
	public void balanc()
	{
	System.out.println("Enter Balance: ");
	balance = obj.nextDouble();
	

}
	 public void withdraw(double amt) throws BankATMException
	 {
		System.out.println("W I T H D R A W A L");
		 double x= amt;
		 if(balance<10000 || x>balance)
		 {
			 try
			 {
				 throw new BankATMException();
			 }
			 catch(BankATMException e)
			 {
				 System.out.println(e);
			 }
		 }
		 else
		 {
			 balance = balance - x;
			 System.out.println("Available Balance after withdrawal of "+x+ " : "+balance);
		 }
		 
	 }
	 
	 public void deposit(double amt)
	 {
		 double y = amt;
		 balance = balance+y;
		 System.out.println("Available Balance after deposit of "+y+" : "+balance);
	 }
}

class Bankk
{
	public static void main(String[] args) throws BankATMException
	{
		BankAtm b = new BankAtm();
	b.deposit(13000.00);
		b.AvailB(); 

		b.withdraw(111000.00);
	
b.withdraw(4000.00);
		b.withdraw(6000.00);

	}

}
