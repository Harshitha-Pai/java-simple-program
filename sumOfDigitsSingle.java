package training;
import java.util.Scanner;
//sum of n natural number
public class Training {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    int sum=0;
	    
	    while(n!=0) {
	    	int rem=n%10;
	    	sum=sum+rem;
	    	n=n/10;
	    	if(n==0) {
	    		if(sum>9) {
	    			n=sum;
	    			sum=0;
	    		}	
	    	}
	    }
	    System.out.println(sum);
	}   
}

