package com.amdocs.bank;

public class currentAccount extends BankAccount 
{
     

	public currentAccount(int accountNo,double bal)
	{
		
		super(accountNo,bal);
		
	}
	
	public void withdraw(double with)
	{
		if(with+200<=getbalance()&& with>0)
		{
			double bal=getbalance();
			setbalance(bal-with-200);
			System.out.println(" thank you.....remaining balance :"+getbalance());
			
		}
		else
		{
			System.out.println("enter valid amount");
		}
	}
	


}
