package training;
import java.util.Scanner;

public class Training {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int i;
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
	}
}
