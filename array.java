import java.util.Scanner;

public class array {
        public static void main(String[] args) {
                System.out.println("enter number of row ");
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                System.out.println("enter number of colomn ");
                Scanner sc1 = new Scanner(System.in);
                int n = sc1.nextInt();
                int i;
                int j;
                int a[][] = new int[m][n];
                System.out.println("enter matri element");
                for(i=0;i<=m;i++) {
                for(j=0;j<=n;j++) {
                        a[i][j] = sc.nextInt();
                        }
                }
                 System.out.println("entered matrix is :");
                for(i=0;i<=m;i++) {
                for(j=0;j<=n;j++) {
                         System.out.println(a[i][j]+ " ");
                        }
                System.out.println();
                }
        }
}

