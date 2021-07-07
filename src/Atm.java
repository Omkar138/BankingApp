import java.util.Scanner;

public class Atm {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		BankAcc b=new BankAcc("Omkar K","OK1308");
		b.showMenu();
		
	}

}
 
class BankAcc
{
	int bal;
	int PreviousTransaction;
	String CustName;
	String CustId;
	
	BankAcc(String cname,String cid)
	{
		CustName=cname;
		CustId=cid;
	}
	void deposit(int amt)
	{
		if(amt >= 0)
		{
			bal=bal+amt;
			PreviousTransaction=amt;
		}
	}
		void withdraw(int amt)
		{
			if(amt>=0)
			{
				bal=bal-amt;
				PreviousTransaction= -amt;
				//Withdrawing some amount
			}
		}
		
		void getPreviousTransaction()
		{
			if(PreviousTransaction > 0)
			{
				System.out.println("Deposited Amount = " +PreviousTransaction);
				
			}
			else if(PreviousTransaction < 0)
			{
				System.out.println("Withdrawn Amount = " +Math.abs(PreviousTransaction));
				//math.abs will takes any value n give us a +ve value.
			}
			else 
			{
				System.out.println("No transaction Has Occurred");
			}
	}
		
		void showMenu()
		{
			char option='\0';
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Welcome To IDFC Bank!!!!!");
			System.out.println("Welcome  = " +CustName);
			System.out.println("Your Personal Bank ID is = " +CustId);
			System.out.println("\n");
			System.out.println("\n");
			System.out.println("A.Check Balance");
			System.out.println("B.Deposit");
			System.out.println("C.Withdraw");
			System.out.println("D.Previous Transactions");
			System.out.println("E.Exit");
			
			
			do
			{
				System.out.println("*****************************************************************");
				System.out.println("Enter an Option = ");
				System.out.println("*****************************************************************");
				option=sc.next().charAt(0);
				System.out.println("\n");
				
				switch(option)
				{
					case 'A' :
					{
					System.out.println("**************************************************************");
					System.out.println("Balance = " +bal);
					System.out.println("**************************************************************");
					System.out.println("\n");
					break;
					}
					case 'B' :
					{
						System.out.println("**************************************************************");
						System.out.println("Enter amount to deposit = ");
						System.out.println("**************************************************************");
						int amt=sc.nextInt();
						deposit(amt);
						System.out.println("\n");
						break;
					}
				
					case 'C':
					{
						System.out.println("**************************************************************");
						System.out.println("Enter amount to withdraw = ");
						System.out.println("**************************************************************");
						int amt2=sc.nextInt();
						withdraw(amt2);
						System.out.println("\n");
						break;
					}
					case 'D':
					{
						System.out.println("**************************************************************");
						System.out.println("Previous Transactions = ");
						getPreviousTransaction();
						System.out.println("**************************************************************");
						System.out.println("\n");
						break;
					}
					
					case 'E':
					{
						System.out.println("**************************************************************");
						break;
					}
					default: 
					{
						System.out.println("Invalid Option!!!Please Enter a Valid Option!!");
						break;
					}
			
				}
		}while(option != 'E');
				System.out.println("Thank You For Using this ATM!!!Thank You For Banking with US!!"
										+ "Do visit us Again To serve you better!!");
				
		}
}
	
