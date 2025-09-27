package demo;


abstract class Payment1 {

abstract void Pay(int amount);
		 
void showPaymentgateway() {
	 System.out.println(" using secure payment gateway...");
   }

}
		 
class CreditCardPayment extends Payment1 {
			 
	 void pay(int amount) {
		System.out.println("paid ₹" + amount + " using credit card.");
	 }
}
		 
		 
class UPIPayment extends Payment1 {
	void pasy(int amount) {
		System.out.println("paid ₹ " + amount + " using UPI");
	}
}
class CashPayment extends Payment1 {
	void pay (int amount) {
		System.out.println("paid ₹" = amount +"in cash");
		
			 
			 
			 }
		 }
			 
		

