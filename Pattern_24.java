import java.util.Scanner;

public class Pattern_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;

        while(row <= n)
        {
            // Space 
            int col1 = 1;
            while(col1 <= space)
            {
                System.out.print("  ");
                col1++;
            }

            int col2 = 1;
            while(col2 <= star)
            {
                System.out.print(row + " ");
                col2++;
            }

            // Prep for the next Iteration
            System.out.println();
            row++;
            space--;
            star+=2;
        }
        sc.close();
    }
}
