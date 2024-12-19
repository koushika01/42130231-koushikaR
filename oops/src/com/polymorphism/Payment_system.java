package com.polymorphism;

abstract class Payment{
	abstract void processPayment();
}
class CashPayment extends Payment{
	void processPayment(){
		System.out.println("cash payment processing...");
	}
}
class CardPayment extends Payment{
	void processPayment(){
		System.out.println("card payment processing...");
	}
}


public class Payment_system {

	public static void main(String[] args) {
	
   CashPayment c1=new CashPayment();
    c1.processPayment();
    CardPayment c2=new CardPayment();
    c2.processPayment();
    
	}

}
