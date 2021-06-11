import java.util.Scanner;

public class leapyear {
        public static void main(String[] args) {
                System.out.println("enter a year");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		Boolean flag = true;
		if((year % 4)==0 || (year % 100)==0 || (year % 400)==0) 
		{
			flag = true;  
			System.out.println(flag);
			System.out.println("it is a leap year : " + year);
		}
		else {
			flag = false;
			System.out.println(flag);
			System.out.println("it is not a leap year : " + year );
		}
	}
}
