import java.util.Scanner;//importing the util library
//Creating the QNo11 class 
public class Pattern19 {
	//Creating the main method
	public static void main(String[] args) {
		//Creating the object of Scanner class
		Scanner scan=new Scanner(System.in);
		//Asking for the user input
		System.out.println("Enter the value of n");
		//Storing the n in a variable
		int n=scan.nextInt();
		/*using for loop
		//initializing the num variable to n*n
		int num=n*n;
		//from 1 to n
		for(int i=1;i<=n;i++) {
			//from 1 to n
			for(int j=1;j<=n;j++) {
			    //checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print(num+"  ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//decrementing the num 
				num--;
			}
			//moving the cursor to the next line
			System.out.println();
		}*/
		/*using while loop
		//initializing the num variable to 1
		int num=n*n;
		//initializing the i variable to 1
		int i=1;
		//Check if i less than n
		while(i<=n){
		//initializing the j variable to 1
			int j=1;
			//Check if j less than n
			while(j<=n) {
				//checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print(num+"  ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//decrementing the num 
				num--;
				//incrementing j
				j++;
			}
			//incrementing i
			i++;
			//moving the cursor to the next line
			System.out.println();
		}*/
		//using do wile loop
		//initializing the num variable to 1
		int num=n*n;
		//initializing the i variable to 1
		int i=1;
		do{
			//initializing the j variable to 1
			int j=1;
			do {
				//checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print(num+"  ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//decrementing the num 
				num--;
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
