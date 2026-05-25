

import java.util.Scanner;

public class FScanner {

public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter any number :-");
    int a=sc.nextInt();
	int f=1;
	
	
	for(int i=1;i<=a;i++)
	{
	f=f*i;
	}
	System.out.println("Factorial of " + a +" is " + f);

	}
	}	