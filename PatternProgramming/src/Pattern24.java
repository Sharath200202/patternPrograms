import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		/*using for loop
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n+1-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print();
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
		 }*/
		//Using the Do-while Loop
		 int i=1;
		 do{
			 int j=1;
			do{
				 System.out.print("-");
				 j++;
			 } while(j<=n+1-i);
			 j=1;
			  do{
				 if(j==1||j==i) {
					 System.out.print("1 ");
				 }
				 else {
					 System.out.print(i-1+" ");
				 }
				 j++;
			 }while(j<=i);
			 i++;
			 System.out.println();
		 }while(i<=n);


	}

}

