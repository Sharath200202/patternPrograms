import java.util.Scanner;//importing the util library
//Creating the QNo11 class 
public class Pattern16 {
	//Creating the main method
	public static void main(String[] args) {
		//Creating the object of Scanner class
		Scanner scan=new Scanner(System.in);
		//Asking for the user input
		System.out.println("Enter the value of n");
		//Storing the n in a variable
		int n=scan.nextInt();
		/*using for loop
		//from 1 to n
		for(int i=1;i<=n;i++) {
			//from 1 to n
			for(int j=1;j<=n;j++) {
			    //print the i value
				System.out.print(i);
			}
			//moving the cursor to the next line
			System.out.println();
		}*/
		/*using while loop
		//initializing the i variable to 1
		int i=1;
		//Check if i less than n
		while(i<=n){
		//initializing the j variable to 1
			int j=1;
			//Check if j less than n
			while(j<=n) {
				//print the i value
				System.out.print(i);
				//incrementing j
				j++;
			}
			//incrementing i
			i++;
			//moving the cursor to the next line
			System.out.println();
		}*/
		//using do wile loop
		//initializing the i variable to 1
		int i=1;
		do{
			//initializing the j variable to 1
			int j=1;
			do {
				//print the i value
				System.out.print(i);
				//incrementing j
				j++;
			}while(j<=n);//Check if j less than n
			//incrementing i
			i++;
			//moving the cursor to the next line
			System.out.println();
		}while(i<=n);//Check if i less than n

	}

}
