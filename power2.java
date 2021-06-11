import java.util.Scanner;

public class power2 {
        public static void main(String[] args) {
                System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i;
		int pow = 1;
		for(i=1;i<=num;i++) {
			pow = pow *2;
		}
		System.out.println("n th power of 2 is" + pow);
	}
}
