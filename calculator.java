import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,ch;
		System.out.print("Enter any two number:-");
		Scanner S = new Scanner(System.in);
		a= S.nextInt();
		b= S.nextInt();
		System.out.print("Enter your choice");
		ch= S.nextInt();
		
		switch(ch)
		{
		case 1: c= a+b;
		      System.out.print("Addition "+ c);
		      break;
		case 2 : c = a-b;
		      System.out.print("Subtraction "+ c);
		      break;
		case 3 : c = a*b;
		      System.out.print("Multiplication "+ c);
		      break;
		case 4 : c = a/b;
		      System.out.print("Division "+ c);
		      break;
		case 5 : c = a%b;
		      System.out.print("Remainder "+ c);
		     break;
		 default: System.out.print("Invalid choice.....");
			 
		 }
		 
		}

	}

