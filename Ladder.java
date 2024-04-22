import java.util.Scanner;
public class Ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char marks;
			System.out.print("Enter Your Marks: ");
			Scanner M = new Scanner(System.in);
			marks = M.next().charAt(0);
			
			if (marks >=60 && marks <=100)
			{
			System.out.print("First Division");	
			}
			else if (marks >=45 && marks <60)
			{
				System.out.print("Second Division");	
			}
			else if (marks >=33 && marks <45)
			{
				System.out.print("Third  Division");
				
			}
			else
			{
				System.out.print("Fail");
			}
	}		
}