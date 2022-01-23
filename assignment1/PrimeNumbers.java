package week1.day2.assignment1;

public class PrimeNumbers {
public static void main(String[] args) {
	int input = 13;
	boolean flag = false;
	for (int i = 2; i < input; i++) {
		      if(input % i == 0) {
		          flag = true;
			      	break;
		      }	
		}
		if(flag) {
			System.out.println(input   + "is a Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		
		
	}
}
}
