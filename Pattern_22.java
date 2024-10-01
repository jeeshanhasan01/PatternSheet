import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int space = 0;
        int row = 1;

        while(row <= n)
        {
            // Star
            int col1 = 1;
            while(col1 <= star)
            {
                System.out.print("* ");
                col1++;
            }

            // Space 
            int col2 = 1;
            while(col2 < space)
            {
                System.out.print("  ");
                col2++;
            }

            // Star
            int col3 = 1;
            if(row == 1)
                col3 = 2;
            while(col3 <= star)
            {
                System.out.print("* ");
                col3++;
            }
            System.out.println();
            row++;
            space += 2;
            star--;
        }
        sc.close();
    }
}
