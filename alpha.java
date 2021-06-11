import java.util.Scanner;

public class alpha {
        public static void main(String[] args) {
                System.out.println("enter a character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		switch(ch)
		{
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o':
 			case 'u' :
 			case 'A' :
 			case 'E' :
 			case 'I' :
 			case 'O' :
 			case 'U' : 
				System.out.println(ch + ": it is vowel ");
				break;
			default:
				System.out.println(ch + ": it is not a vowel ");
		}
	}
}
