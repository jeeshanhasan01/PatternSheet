import java.util.Scanner;

public class Pattern_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;
        int space = 0;

        while(row <= n)
        {
            //  For Space
            int col1 = 1;
            while(col1 <= space)
            {
                System.out.print("  ");
                col1++;
            }
            // For Star
            int col2 = 1;
            while(col2 <= star)
            {
                System.out.print("* ");
                col2++;
            }
            star--;
            row++;
            space += 2;
            System.out.println();
        }
        sc.close();
    }
}
