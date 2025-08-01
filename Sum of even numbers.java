package training;
import java.util.Scanner;

public class Training {
	public static void main(String[] args) {
		int i, sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range from");
		int from=sc.nextInt();
		System.out.println("Enter the range to");
		int to=sc.nextInt();
		for( i=from;i<=to;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
