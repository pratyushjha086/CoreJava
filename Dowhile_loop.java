import java.util.Scanner;

public class Dowhile_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.print("Enter any number");
		Scanner N = new Scanner(System.in);
		num = N.nextInt();
		do {
			System.out.print(num+ " ");
			--num;
		
		}
		while(num >= -1);

	}

}
