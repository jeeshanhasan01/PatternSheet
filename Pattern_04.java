import java.util.Scanner;

public class Pattern_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int space = n-1;
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
            System.out.println();
            space--;
            star++;
            row++;
        }
        sc.close();
    }
}
