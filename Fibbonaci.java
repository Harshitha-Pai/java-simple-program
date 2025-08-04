
package training;
import java.util.Scanner;

public class Training {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    int a=0; int b=1, next,i;
	    
	    if(n<=0) {
	    	System.out.println("Enter positive girl");
	    }else if(n==1) {
	    	System.out.println(a); 
	    }else {
	    	System.out.print(a+" "+b);
	    for(i=3;i<=n;i++) {
	    	next= a+b;
	    	System.out.print(next);
	        a=b;
	        b=next;
	    }
	    
	    }

	    }
	}
	

// fibonnaci series;
