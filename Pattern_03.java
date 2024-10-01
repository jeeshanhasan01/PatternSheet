import java.util.Scanner;

public class Pattern_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 5;
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
            row++;
            star--;
        }
        sc.close();
    }
}
