package inheritance;

public class dog {
	{
		System.out.println("eating...");
	}

}

class animal extends dog {
	public void bark()
	{
		System.out.println("barking...");
	}
}

public class main {
	public static void main(String[] args) {
		dog d = new dog();
		d.eat();
		d.bark();
	}`                                  
	
}