import java.util.Scanner;

public class Pattern_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n/2;
        int space = 1;

        while(row <= n)
        {
            // spaces
            int col1 = 1;
            while(col1 <= star)
            {
                System.out.print("  ");
                col1++;
            }
            // Then Star
            int col2 = 1;
            while(col2 <= space)
            {
                System.out.print("* ");
                col2++;
            }
            if(row < n/2+1)
            {
                space += 2;
                star--;
            }
            else{
                space -= 2;
                star++;
            }
            System.out.println();
            row++;
        }
        sc.close();
        }
}
