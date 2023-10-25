package com.amdocs.bank;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	/*	BankAccount B1=new BankAccount(11,500);
       B1.deposit(0);
       B1.withdraw(400);
       B1.showBalance(); 
       
       BankAccount B2=new BankAccount(1000, 0);     
       B2.withdraw(500);*/
     
       
		
			
		savingAccount s1=new savingAccount(11,500);
		s1.showBalance();
		s1.deposite(200);
		s1.showBalance();
		s1.withdraw(200);
		s1.showBalance();
		
		
//		currentAccount c1=new currentAccount(101,1000);
//		c1.showBalance();
//		c1.withdraw(800);
//		c1.showBalance();
//		
		
		/*savingAccount s1=new savingAccount(101,2000);
		savingAccount s2=new savingAccount(102,1000);
		currentAccount c1=new currentAccount(103,3000);
		s1.transfer(500, s2);*/
//		c1.transfer(500, s1);
//		s1.showBalance();
//		c1.showBalance();
//		
		
		
		
		
		
		
		
	

	
		
	}
	}


