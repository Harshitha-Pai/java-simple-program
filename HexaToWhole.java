
package training;
import java.util.Scanner;

public class Training {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    String hexa="";
	    
	    while(n!=0) {
	    	int rem=n%10;
	    	if(rem<=9) {
	    		hexa=rem+hexa;
	    	}else {
	    		hexa=(char)(rem+55)+hexa;
	    		n=n/16;
	    	}

	    }
	    System.out.println(hexa);
 
    }
	    
}
