import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter what to be printed ");
		char ch=scan.next().charAt(0);
		/*using for loop
		 * for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}*/
		/*using while
		 int i=1;
		 while(i<=n) {
			int j=1;
			while(j<=n-i+1) {
				System.out.print(ch);
				j++;
			}
			i++;
			System.out.println();
		}*/
		int i=1;
		do {
			int j=1;
			do {
				System.out.print(ch);
				j++;
			}while(j<=n-i+1);
			i++;
			System.out.println();
		}while(i<=n);

	}

}
