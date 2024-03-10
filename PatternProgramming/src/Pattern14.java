import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter what to be printed ");
		char ch=scan.next().charAt(0);
		/*Using for loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(" ");
			}
				for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n){
					System.out.print(ch);
					}
				else{
					System.out.print(" ');
					
				}
				}
			System.out.println();
			}*/
		/*Using while loop
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n) {
			if(i==1||i==n||j==1||j==n){
				System.out.print(ch);
				j++;
			}
			else{
				System.out.print(" ");
			}
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
			}while(j<=n);
			j=1;
			do {
				if(i==1||i==n||j==1||j==n) {
				System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
				j++;
			}while(j<=n);
			i++;
			System.out.println();
		}while(i<=n);

	}

}
