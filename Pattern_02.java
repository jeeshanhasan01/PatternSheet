import java.util.Scanner;

public class Pattern_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        while(row <= n)
        {
            int col = 1;
            while(col <= star)
            {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            star++;
            row++;
        }
        sc.close();
    }
}
