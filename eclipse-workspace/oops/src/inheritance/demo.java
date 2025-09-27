package inheritance;

 abstract class payment {

 abstract void pay(int amount);
 
 void showpaymentgateway() {
	 System.out.println(" using secure payment gateway...");
 }

}
 
 class creditcardpayment extends payment {
	 
	 void pay(int amount) {
		 System.out.println("paid ");
	 }
	 
 }
