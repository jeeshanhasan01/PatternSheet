import java.util.Scanner;

public class Pattern_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 2*n-1;
        int space = 0;

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
            System.out.println();
            star -= 2;
            space++;
            row++;
        }
        sc.close();
    }
}
