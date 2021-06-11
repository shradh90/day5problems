import java.util.Scanner;

public class even {
        public static void main(String[] args) {
                System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if((num % 2) == 0) {
		System.out.println("it is a even number : " + num);
		}
		else {
		System.out.println( + num + " : it is a odd number  ");
 		}
	}
}
