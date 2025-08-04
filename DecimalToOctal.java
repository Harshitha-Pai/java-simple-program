
package training;
import java.util.Scanner;

public class Training {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    String binary="";
	    
	    while(n!=0) {
	    	binary=(n%8)+binary;
	    	n=n/8;
	    }
	    System.out.println(binary);
	    
	    
	    	
	    
    }
	    
}
