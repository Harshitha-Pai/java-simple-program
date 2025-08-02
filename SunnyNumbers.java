package training;
import java.util.Scanner;

public class Training {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    boolean IsSunny=false;
	    int nextNum=n+1;
	    
	    for(int i=1;i*1<=nextNum;i++) {
	    	if(i*i==nextNum) {
	    		IsSunny=true;
	    	}
	    }
	    if(IsSunny) {
	    	System.out.println("Is a sunny number");
	    }
	    System.out.println("not");
	    
	 
	}   
}

