package training;
import java.util.Scanner;
//sum of n natural number
public class Training {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the range n");
	    int n= sc.nextInt();
	    int sum=1;
	    
	    for(int i=1;i<=n;i++) {
	    	sum= sum*i;
	    } 
	    System.out.println("Total prod-"+sum);
	}
}
