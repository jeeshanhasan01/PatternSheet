import java.util.Scanner;

public class Pattern_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        while(row <= n)
        {
            int col1 = 1;
            while(col1 <= n)
            {
                if((row+col1 == n+1)|| col1 == row)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                col1++;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
