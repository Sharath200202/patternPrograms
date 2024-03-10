import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter what to be printed ");
		char ch=scan.next().charAt(0);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		/*using while
		 int i=1;
		 while(i<=n) {
			int j=1;
			while(j<=i) {
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
			}while(j<=i);
			i++;
			System.out.println();
		}while(i<=n);


	}

}
