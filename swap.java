import java.util.Scanner;

public class swap {
        public static void main(String[] args) {
                System.out.println("enter number1");
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		System.out.println("enter a number2");
		Scanner sc1 = new Scanner(System.in);
		int n2 = sc1.nextInt();
		int temp = n2;
		n2 = n1;
		n1 = temp;
		System.out.println("value of n1 after swaping: " + n1);
		System.out.println("value of n2 after swaping: " + n2);
	}
}
