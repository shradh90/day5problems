import java.util.Scanner;

public class quadratic {
        public static void main(String[] args) {
                System.out.println("enter point  a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("enter a point b");
		Scanner sc1 = new Scanner(System.in);
		int b = sc1.nextInt();
		System.out.println("enter a point c");
                Scanner sc2 = new Scanner(System.in);
                int c = sc2.nextInt();

		int delta = (b*b - 4*a*c);
		double root1 = (-b + Math.sqrt(delta))/(2*a);
		double root2 = (-b - Math.sqrt(delta))/(2*a);
		System.out.println("delta : " + delta);
 		System.out.println("root1 : " + root1);
		System.out.println("root2 : " + root2);
	}
}
