import java.util.Scanner;

public class sum {
        public static void main(String[] args) {
                System.out.println("enter number of row ");
                Scanner sc = new Scanner(System.in);
                int m = sc.nextInt();
                int i;
                int j;
		int k;
                int a[] = new int[m];
                System.out.println("enter matri element");
                for(i=0;i<m;i++) {
                        a[i] = sc.nextInt();
                }

		for(i=0;i<=m-2; i++) {
                	for(j=i+1;j<=m-1;j++) {
				for(k=j+1;k<=m-2;k++) {
              			int sum = a[i] + a[j] + a[k];
 					if(sum == 0){
						System.out.println("pair of elements whos sum is 0 :");
						System.out.println("a[i]: " + a[i] + "  a[j]: " + a[j] + "  a[k]: " +a[k]);
					}

				}
			}

		}
	}
}
