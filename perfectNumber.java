package training;
import java.util.Scanner;

public class Training {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    int n= sc.nextInt();
	    int sum=0;
	    int i;
	    
	    for(i=1;i<n;i++) {
	    	if(n%i==0) {
	    		sum=sum+i;
	    	}
	    }
	    
	    if(sum==n) {
			System.out.println("The given number is perfect");
	    }else {
			System.out.println("The given number is not perfect");

	    }
	}
}
