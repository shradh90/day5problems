import java.util.Scanner;

public class distance {
        public static void main(String[] args) {
                System.out.println("enter point  x");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("enter a point y");
		Scanner sc1 = new Scanner(System.in);
		int y = sc1.nextInt();
		double sum = (x*x + y*y);
		double dist = Math.sqrt(sum);
		System.out.println("distance between two points : " + dist);
 	}
}
