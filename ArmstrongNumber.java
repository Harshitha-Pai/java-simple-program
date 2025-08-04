package training;
import java.util.Scanner;

public class Training {
	public static int power(int rem, int count) {
		int result=1;
		for (int i=1;i<=count;i++) {
			result*=rem;
		}
		return result;
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number n");
	    int n= sc.nextInt();
	    int orginal=n;
	    int num=n;
	    int rem;int sum=0;
	    int count=0;
	    while(n!=0) {
	    	rem= n%10;
	    	count++;
	    	n/=10;
	    }
    	System.out.println(count);

    	while(num!=0) {
	    	rem=num%10;
	    	sum+=power(rem,count);
	    	num/=10;
	    }
	   
	    
	    
	    if(sum==orginal) {
	    	System.out.println("The number is Amstrong number");

	    }else {
	    	System.out.println("The number is not a Amstrong number");

	    }
	 
	}   
}

