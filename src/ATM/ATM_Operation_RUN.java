package ATM;

import java.util.HashMap;
import java.util.Map;

public class ATM_Operation_RUN implements ATM_Operations {

	ATM atm = new ATM();
	
	Map<Double,String> min = new HashMap<>();
	
	
	@Override
	public void viewBalance() {
		// TODO Auto-generated method stub
		
		System.out.println("Available Balance :"+ atm.getBalance());
		
	}

	@Override
	public void withdrawAmount(double withdrawAmount) {
		
		if(withdrawAmount<=atm.getBalance())
		{
			min.put(withdrawAmount, "WithdrawAmount");
			System.out.println("Please Collect Your Cash  :"+ withdrawAmount);
			atm.setBalance(atm.getBalance()-withdrawAmount);
			viewBalance();
		}
		else
		{
			System.out.println(" Sorry Insufficiant balance");
		}
	
		
	}

	@Override
	public void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		min.put(depositAmount, "Deposit Amount");
		System.out.println(depositAmount+" despositSuccessfully");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewBalance();
		
	}

	@Override
	public void viewMiniStatement() {
		// TODO Auto-generated method stub
		if(min.isEmpty())
		{
			System.out.println("Currently Not Available Balance");
		}
		else
		{
			System.out.println("-----------Your Mini Statement is-----");
			for(Map.Entry<Double, String>  m: min.entrySet())
			{
				System.out.println(m.getKey() +" "+m.getValue());
			}
			viewBalance();
		}
	}

}
