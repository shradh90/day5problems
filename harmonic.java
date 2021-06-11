import java.util.Scanner;

public class harmonic {
        public static void main(String[] args) {
                System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int i;
		double harm = 0;
		for(i=1;i<=num;i++) {
		harm = harm + (double)1/i ;
		}
                System.out.println("harmonic value" + harm);
	}
}
