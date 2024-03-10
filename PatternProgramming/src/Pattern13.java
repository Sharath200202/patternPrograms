import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter what to be printed ");
		char ch=scan.next().charAt(0);
		/*using for loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for(int i=2;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=n*2(i*2-1);j++) {
				System.out.print(ch);
			}
			System.out.println();
		}*/
		/*Using while loop
		 int i=1;
		 while(i<=n){
			 int j=1;
			 while(j<n+1-i){
				 System.out.print(" ");
				 j++;
			 }
			 j=1;
			 while(j<=i*2-1) {
				 System.out.print(ch);
				 j++;
			 }
			 i++;
			 System.out.println();
			 int k=2;
		 while(k<=n){
			 int j=1;
			 while(j<=k){
				 System.out.print(" ");
				 j++;
			 } while(j<=k)
			 j=1;
			  while(j<=n*2-(k*2-1)){
				 System.out.print(ch);
				 j++;
			 }
			 k++;
			 System.out.println();
		 }
		 }*/
		//Using Do-while loop
		 int i=1;
		 do{
			 int j=1;
			do{
				 System.out.print(" ");
				 j++;
			 } while(j<=n+1-i);
			 j=1;
			  do{
				 System.out.print(ch);
				 j++;
			 }while(j<=i*2-1);
			 i++;
			 System.out.println();
		 }while(i<=n);
		 int k=2;
		 do{
			 int j=1;
			do{
				 System.out.print(" ");
				 j++;
			 } while(j<=k);
			 j=1;
			  do{
				 System.out.print(ch);
				 j++;
			 }while(j<=n*2-(k*2-1));
			 k++;
			 System.out.println();
		 }while(k<=n);

	}

}
