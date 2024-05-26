package ATM;

import java.util.Scanner;

public class ATM_Main {

	public static void main(String[] args) {
		
		
		ATM_Operation_RUN atm_run = new ATM_Operation_RUN();
		
		try
		{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter Your 4 digit PIN");
				int pin = sc.nextInt();
				
				if(pin==1234)
				{
					while(true)
					{
						System.out.println("----------------------------------");
						System.out.println(" 1. View Available Balance :");
						System.out.println(" 2. Withdraw Amount :");
						System.out.println(" 3. Deposit Amount : ");
						System.out.println(" 4. View Mini Statement :");
						System.out.println(" 5. Exit");
						System.out.println(" Please Enter Your Choice = ");
						int ch = sc.nextInt();
						
						if(ch==1)
						{
							
							atm_run.viewBalance();
						}
						else if(ch==2)
						{
							try
							{
									System.out.println("Enter your Amount :");
									double wid_Amount = sc.nextDouble();
									atm_run.withdrawAmount(wid_Amount);
							}
							catch(Exception e)
							{
								System.out.println("Wrong Crediantials");
							}
							
							
						}
						else if(ch==3)
						{
					 		try
							{
							
							System.out.println("Enter your deposit Amount :");
							double dep_Amount = sc.nextDouble();
							atm_run.depositAmount(dep_Amount);
							}
							catch(Exception e)
							{
								System.out.println("Wrong crendtials");
							}
							
						}
						else if(ch==4)
						{
							
							atm_run.viewMiniStatement();
							
						}
						else if(ch==5)
						{
							System.out.println("Thank You...");
							break;
						}
						else
						{
							System.out.println("Invaild Option Try Again later..");
							break;
						}
					}
				}
				else 
				{
					System.out.println("Incorrect PIN ");
				}
			}
		catch(Exception e)
		{
			System.out.println("Wrong Crediantials");
			System.exit(0);
		}
	}
}
