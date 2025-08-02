package training;
import java.util.Scanner;

public class Training {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    
	    int sqr=n*n;
	    int org=n;
	    int divisor=1;
	    
	    while(n!=0) {
	    	divisor=divisor*10;
	    	n=n/10;
	    }
	    if(sqr%divisor==org) {
	    	System.out.println("The number is automorphic");

	    }else {
	    	System.out.println("The number is not automorphic");

	    }
	 
	}   
}

