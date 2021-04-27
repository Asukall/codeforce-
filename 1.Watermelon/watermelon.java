package CFF;

import java.util.Scanner;

public class watermelon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		if(n%2==0&&n!=2)
			System.out.println("Yes");
		else
			System.out.println("No");
		scanner.close();
	}

}
