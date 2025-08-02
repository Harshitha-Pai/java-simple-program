package training;
import java.util.Scanner;

public class Training {
	public static int factorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    int orginal=n;
	    int rem;int sum=0;
	    while(n!=0) {
	    	rem= n%10;
	    	sum+=factorial(rem);
	    	n/=10;
	    }
	   
	    
	    
	    if(sum==orginal) {
	    	System.out.println("The number is strong number");

	    }else {
	    	System.out.println("The number is not a strong number");

	    }
	 
	}   
}

