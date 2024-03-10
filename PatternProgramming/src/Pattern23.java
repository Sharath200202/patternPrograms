import java.util.Scanner;//importing the util library
//Creating the QNo11 class 
public class Pattern23 {
	//Creating the main method
	public static void main(String[] args) {
		//Creating the object of Scanner class
		Scanner scan=new Scanner(System.in);
		//Asking for the user input
		System.out.println("Enter the value of n");
		//Storing the n in a variable
		int n=scan.nextInt();
		if(n%2==0) {
		/*using for loop
		//initializing the num variable to 2
		int num=2;
		//from 1 to n
		for(int i=1;i<=n/2;i++) {
			//from 1 to n
			for(int j=1;j<=n;j++) {
			    //checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print("0"+num+" ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//incrementing the num by 2
				num=num+2;
			}
			//moving the cursor to the next line
			System.out.println();
		}
		//reassigning the num variable to 1
		num=1;
		//from (n/2)+1 to n
		for(int i=(n/2)+1;i<=n;i++) {
			//from 1 to n
			for(int j=1;j<=n;j++) {
			    //checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print("0"+num+" ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//incrementing the num by 2
				num=num+2;
			}
			//moving the cursor to the next line
			System.out.println();
		}*/
		/*using while loop
		//initializing the num variable to 2
		int num=2;
		//initializing the i variable to 1
		int i=1;
		//Check if i less than or equal to n
		while(i<=n){
		//initializing the j variable to 1
			int j=1;
			//Check if j less than or equal to n
			while(j<=n) {
				//checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print("0"+num+" ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//incrementing the num by 2
				num=num+2;
				//incrementing j
				j++;
			}
			//incrementing i
			i++;
			//moving the cursor to the next line
			System.out.println();
		}
		//reassigning the num variable to 1
		num=1;
		//initializing the i variable to 1
		int i=1;
		//Check if i less than or equal to n
		while(i<=n){
		//initializing the j variable to 1
			int j=1;
			//Check if j less than or equal to n
			while(j<=n) {
				//checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print("0"+num+" ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//incrementing the num by 2
				num=num+2;
				//incrementing j
				j++;
			}
			//incrementing i
			i++;
			//moving the cursor to the next line
			System.out.println();
		}*/
		//using do wile loop
		//initializing the num variable to 2
		int num=2;
		//initializing the i variable to 1
		int i=1;
		do{
			//initializing the j variable to 1
			int j=1;
			do {
				//checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print("0"+num+" ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//incrementing the num 
				num+=2;
				//incrementing j
				j++;
			}while(j<=n);//Check if j less than or equal to n
			//incrementing i
			i++;
			//moving the cursor to the next line
			System.out.println();
		}while(i<=n/2);//Check if i less than or equal to n/2
		//reassigning the num variable to 1
		num=1;
		//reassigning the i variable to (n/2)+1
		i=(n/2)+1;
		do{
			//initializing the j variable to 1
			int j=1;
			do {
				//checking if num is less than 10
				if(num<10) {
					//print the num value
					System.out.print("0"+num+" ");
				}
				else {
					//print the num value
					System.out.print(num+" ");
				}
				//incrementing the num 
				num+=2;
				//incrementing j
				j++;
			}while(j<=n);//Check if j less than or equal to n
			//incrementing i
			i++;
			//moving the cursor to the next line
			System.out.println();
		}while(i<=n);//Check if i less than or equal to n
		}
		else {
			System.out.println("Please enter the even number");
		}
	}

}
