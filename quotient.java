import java.util.Scanner;

public class quotient {
        public static void main(String[] args) {
                System.out.println("enter a numerator");
		Scanner sc = new Scanner(System.in);
		int numr = sc.nextInt();
		System.out.println("enter a denomenator");
		Scanner sc2 = new Scanner(System.in);
		int den = sc2.nextInt();
		int quot = numr / den;
		int rem = numr % den;		                
		System.out.println("quotient : " + quot);                
		System.out.println("remender : " + rem);
	}
}	
