import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = 2*n-3;
        int star = 1;

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
            while(col2 <= space)
            {
                System.out.print("  ");
                col2++;
            }
            // Star 
            int col3 = 1;
            if(row == n)
                col3 = 2;
            while(col3 <= star)
            {
                System.out.print("* ");
                col3++;
            }
            System.out.println();
            row++;
            space -= 2;
            star++;
        }
        sc.close();
    }
}
