import java.util.*;

public class Pattern_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space1 = n / 2;
		int space2 = -1;
		while (row <= n) {
			// space1
			for (int i = 1; i <= space1; i++) {
				System.out.print("  ");
			}

			// star
			System.out.print("* ");

			// space2
			if (space2 > 0) {
				for (int j = 1; j <= space2; j++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}

			if (row <= n / 2) {
				space1--;
				space2 += 2;
			} else {
				space1++;
				space2 -= 2;
			}

			System.out.println();
			row++;

		}
		sc.close();

	}

}
