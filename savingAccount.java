package com.amdocs.bank;

public class savingAccount extends BankAccount 
{

	public savingAccount(int accountNo, double balance)
	{
		super(accountNo, balance);
		// TODO Auto-generated constructor stub
	}
	
	public void deposite(double dep)
	{
		if(dep>0)
		{
			double bal=getbalance();
			setbalance(bal+dep+dep*0.03);
			
			
		}
		else
		{
			System.out.println("invalid amount");
		}
	}
  
}