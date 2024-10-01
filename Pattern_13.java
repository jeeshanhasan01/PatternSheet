import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int stars = 1;
        while(row <= 2*n-1)
        {
            int col = 1;
            while(col <= stars)
            {
                System.out.print("* ");
                col++;
            }
            if(row < n)
                stars++;
            else
                stars--;
            System.out.println();
            row++;
        }
        sc.close();
    }
}
