import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("Enter any number:_");
		Scanner N = new Scanner(System.in);
		num = N.nextInt();
		for(int i=1; i<=20; i++)
		{
			System.out.println(num*i);
		}
		

}
}