
package training;
import java.util.Scanner;

public class Training {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    String binary="";
	    
	    while(n!=0) {
	    	binary=(n%2)+binary;
	    	n=n/2;
	    }
	    System.out.println(binary);
	    
	    
	    	
	    
    }
	    
}
