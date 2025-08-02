package training;
import java.util.Scanner;

public class Training {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    boolean isPrime=true;
	    
	    if(n<=1) {
	    	isPrime=false;
	    }
	    
	    for(int i=2;i*i<n;i++) {
	    	if(n%2==0) {
	    		isPrime=false;
	       }
	    }
	    if(isPrime) {
	    	System.out.println("Is a prime number");
	    }else {
	    	System.out.println("Not a prime number");
	    }
	}
	
}
