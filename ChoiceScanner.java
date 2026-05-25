import java.util.Scanner;

public class ChoiceScanner {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Choose program:-");
		int z = sc.nextInt();

		int x = 4;
		switch (x) {
		case 1:
			System.out.println("Factorial");

			int a = 5;
			int f = 1;

			for (int i = 1; i <= a; i++) {
				f = f * i;
			}
			System.out.println("Fatorial of " + a + " is " + f);

			break;

		case 2:

			int u1 = 0, u2 = 1, u3;

			System.out.println("Fibonacci Series \nEnter any range -");
			int ab = sc.nextInt();

			for (int i = 1; i <= ab; i++) {
				u3 = u1 + u2;
				System.out.println(u3);

				u1 = u2;
				u2 = u3;
			}
			break;

		case 3:

			System.out.println("Even /Odd \nEnter any number :-");
			int j = sc.nextInt();

			if (j % 2 == 0) {

				System.out.println("Entered number is Even");
			} else {

				System.out.println("Entered number is Odd");
			}
			break;

		case 4:
			System.out.println("Greatest Number \nEnter any number :-");
			int e = sc.nextInt();
			int d = 18;
			if (e < d) {
				System.out.println(d + " is greater than " + e);
			} else if (e > d) {
				System.out.println(e + " is greater than " + d);
			} else if (e == d) {
				System.out.println("Both numbers are equal");
				break;

			}
		}
	}
}
