package Atmproject;

import java.util.Scanner;

public class ATM {
     
	float Balance;
	int PIN = 1234;

	public void checkpin() {
		System.out.println("Enter Your Pin: ");
		Scanner sc = new Scanner(System.in);
		int enterpin = sc.nextInt();
		if(enterpin==PIN) {
			menu();
		}
		else {
			System.out.println("Enter a valid PIN: ");
			checkpin();
		}
	}
	
	public void menu() {
		System.out.println("Enter Your Choice: ");
		System.out.println("1. Check account Balance");
		System.out.println("2. Witdhraw Money");
		System.out.println("3. Deposite Money");
		System.out.println("4. EXIT");
		
       Scanner sc =new Scanner(System.in);
       int opt = sc.nextInt();
      
       if(opt==1) {
    	   checkBalance();
       }
       else if(opt==2) {
    	   withdrawMoney();
       }
       else if (opt==3) {
    	   depositMoney();
       }
       else if (opt==4) {
   		System.out.println("Thankyou... Visit Again!!!!");
    	   return;
       }
       else {
    	   System.out.println("Enter a Valid Choice");
       }
        
	}
	
	
	public void checkBalance() {
		System.out.println("Balance: " + Balance);
		menu();
	}
	
	public void withdrawMoney() {
		System.out.println("Enter a Amount To Withdrawl: ");
		Scanner sc = new Scanner(System.in);
		float amount = sc.nextFloat();
		if(amount>Balance) {
			System.out.println("Insufficient Balance");
		}
		else{
			Balance= Balance - amount;
			System.out.println("Money Withdrawl Successful");
			}
		menu();
	}
	
	public void depositMoney() {
		System.out.println("Enter the Amount: ");
		Scanner sc= new Scanner(System.in);
		float amount2 = sc.nextFloat();
		Balance = Balance + amount2;
		System.out.println("Money Deposited Successful");
		menu();
	}
	
	
}
