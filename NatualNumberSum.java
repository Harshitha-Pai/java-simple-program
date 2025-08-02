package training;
import java.util.Scanner;
//sum of n natural number
public class Training {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range n");
	    int n= sc.nextInt();
	    int sum=0;
	    
	    for(int i=0;i<=n;i++) {
	    	sum=(n*(n+1)/2);
	    } 
	    System.out.println("Total sum-"+sum);
	}
}
