package training;
import java.util.Scanner;

public class Training {
	public int factorial(int n) {
		int fact=1;
    	for(int i=1;i<n;i++) {
    		fact=fact*i;
    	}
		return fact;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
	    int n= sc.nextInt();
	    
	    Training train = new Training();
        int result = train.factorial(n);

	    System.out.println(result);
	}
	
}
