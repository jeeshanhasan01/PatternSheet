import java.util.Scanner;

public class Pattern_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n;
        int row = 1;

        while(row <= n)
        {
            int col1 = 1;
            while(col1 <= star)
            {
                if(row == 1 || row == n || col1 == n || col1 == 1)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                col1++;
            }
            row++;
            System.out.println();
        }
        sc.close();
    }
}
