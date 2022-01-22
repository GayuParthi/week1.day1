package week1.day1;

public class LearnMethods {
	
	public void printName() {
		System.out.println("Mounish");
	}
	public int addNumbers(int a,int b) {
		return a+b;
		
	}
	public void displayMyScreen() {
		System.out.println("Displayed");
	}
	public static void main(String[] args) {
		LearnMethods obj = new LearnMethods();
		int result = obj.addNumbers(2, 5);
		System.out.println(result);
		obj.displayMyScreen();
		obj.printName();
		
	}

}
