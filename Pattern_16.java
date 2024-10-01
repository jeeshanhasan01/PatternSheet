import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = n-1;
        while(row <= 2*n-1)
        {
            // For Spaces
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

            if(row < n)
            {
                star--;
                space--;
            }
            else{
                star++;
                space++;
            }
            // Next Prep
            System.out.println();
            row++;
        }
        sc.close();
    }
}
