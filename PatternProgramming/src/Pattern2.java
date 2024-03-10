import java.util.*;//importing the util library
//Creating the QNo11 class 
public class Pattern2 {

	public static void main(String[] args) {
		//Creating the object of Scanner class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		System.out.println("Enter what to be printed ");
		char ch=scan.next().charAt(0);
		/*Using for loop
		for(int i=1;i<=n;i++) {
			System.out.println(ch);
		}*/
		/*Using while
		int i=1;
		while(i<=5) {
			System.out.println(ch);
			i++;
		}*/
		//Using Do-while
		int i=1;
		do {
			System.out.println(ch);
			i++;
		}while(i<=5);
	}

}
