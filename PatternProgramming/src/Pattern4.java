import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter the value of m");
		int m=scan.nextInt();
		System.out.println("Enter what to be printed ");
		char ch=scan.next().charAt(0);
		/*Using for loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=m;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}*/
		/*Using while loop
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=m) {
				System.out.print(ch);
				j++;
			}
			System.out.println();
			i++;
		}*/
		//Using DO-while loop
		int i=1;
		 do{
			int j=1;
			do {
				System.out.print(ch);
				j++;
			}while(j<=m);
			System.out.println();
			i++;
		}while(i<=n);
	}

}
