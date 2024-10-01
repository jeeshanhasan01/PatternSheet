import java.util.Scanner;

public class Pattern_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int space = 0;
        int row = 1;

        while(row <= n)
        {
            // For Spaces
            int col1 = 1;
            while(col1 <= space)
            {
                System.out.print("  ");
                col1++;
            }
            // For Stars
            int col2 = 1;
            while(col2 <= star)
            {
                System.out.print("* ");
                col2++;
            }
            row++;
            space++;
            star--;
            System.out.println();
        }
        sc.close();
    }
}
