import java.util.Scanner;
public class TP05_01 {

	static void prime_number(int num)
	{
		
		int i, j, check;

		// Printing display message
		System.out.print("\n\t\tThe primary number between 2 and "+ num + "are : ");

		for (i = 1; i <= num; i++) {

			
			if (i == 1 || i == 0)
				continue;

			
			check = 1;

			for (j = 2; j <= i / 2; ++j) {
				if (i % j == 0) {
					check = 0;
					break;
				}
			}

			
			if (check == 1)
				System.out.print(i + " ");
		}
	}

	// The Driver code
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
        System.out.print("Input number to list prime numbers from 2 to it: ");
        int number=in.nextInt();

		prime_number(number);
	}
}
