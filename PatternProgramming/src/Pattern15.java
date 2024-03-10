import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter what to be printed ");
		char ch=scan.next().charAt(0);
		/*Using for loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
				for(int j=1;j<=i*2-1;j++) {
				if(i==1||i==n||j==1||j==2*i-1) {
					System.out.print(ch);
				}
				else{
					System.out.print(" ");
				}
		}
		System.out.println();
		}*/
		/*Using while loop
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n+1-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=i*2-1) {
				if(i==1||i==n||j==1||j==2*i-1) {
				System.out.print(ch);
				}
				else{
					System.out.print(" ");
					}
				j++;
			}
			i++;
			System.out.println();
		}*/
		//Using do while loop
		int i=1;
		do {
			int j=1;
			 do{
				System.out.print(" ");
				j++;
			}while(j<=n+1-i);
			
			j=1;
			do {
				if(i==1||i==n||j==1||j==i*2-1) {
				System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
				j++;
			}while(j<=i*2-1);
			i++;
			System.out.println();
	}while(i<=n);
	}
}


