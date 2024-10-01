import java.util.Scanner;

public class Pattern_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = n;
        int row = 1;
        while(row <= n)
        {
            int col1 = 1;
            int count = n;
            while(col1 <= star)
            {
                System.out.print(count+" ");
                col1++;
                count--;
            }
            // Prep for the next Iter
            System.out.println();
            row++;
        }
        sc.close();
    }
}
