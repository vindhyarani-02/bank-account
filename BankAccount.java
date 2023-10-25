package com.amdocs.bank;

public class BankAccount
{
public int accountNo;
public double balance;

public BankAccount( int accountNo, double balance) 
{
	this.accountNo=accountNo;
	this.balance=balance;
	System.out.println("successfully created bank account");
	
}
 
	public double getbalance()
	{
		return balance;
		
	}

 protected void setbalance(double balance) 
 {
	this.balance=balance;
	
}




public void deposite(double amount)
 {
	 if(amount>0) 
	 {
		this. balance =this.balance +amount;
		
	 }
	else
	{
		 
			 System.out.println("invalid deposit amount.please enter a valid amount");
	}
		 
	
}
 
 public void withdraw(double with)
  {
	if(with>0  && with <=balance)
	{
		this.balance = balance-with;
		System.out.println("withdraw  is completed remaining balance is:" + balance );
		
	}
	else
		System.out.println("invalid withdraw amount or insufficient balance");
	 
}
 
 public void transfer(double amount, BankAccount b1) 
 {
	 if(amount>0 && amount<=balance)
	 {
		 this.withdraw(amount);
		b1.deposite(amount);
		 System.out.println("Transferred "+amount+"To another account");
	 }
	 else
		 System.out.println("invalid transfer amount or insufficient balance");
}
 

 public  double showBalance()
 {
	System.out.println(this.accountNo+" : "+balance);
	return accountNo; 
	
}

}
