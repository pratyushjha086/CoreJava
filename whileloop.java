import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("Enter any number:-");
		Scanner N = new Scanner( System.in);
        num = N.nextInt();
        while(num >=0) {
        	if(num % ==0 ) 
        	{
        		System.out.println("Number is Even");
        		break;
        	}
        	else {
        		System.out.println("Number is Odd");
        		break;
        		
        	}
        }
	}

}
