import java.util.Scanner;

public class quotient {
        public static void main(String[] args) {
                System.out.println("enter numerator");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("enter a denominator");
		Scanner sc1 = new Scanner(System.in);
		int den = sc1.nextInt();
		int quo = num / den;
		int rem = num % den;
		System.out.println("quotient : " + quo);
		System.out.println("denominator : " + rem);
	}
}
