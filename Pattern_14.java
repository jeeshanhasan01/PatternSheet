import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int stars = 1;
        int spaces = n-1;
        while(row <= 2*n-1)
        {
            // Spaces
            int col1 = 1;
            while(col1 <= spaces)
            {
                System.out.print("  ");
                col1++;
            }
            // Stars
            int col2 = 1;
            while(col2 <= stars)
            {
                System.out.print("* ");
                col2++;
            }
            // Prep For Next Iter
            if(row < n)
            {
                stars++;
                spaces--;
            }else{
                stars--;
                spaces++;
            }
            System.out.println();
            row++;
        }
        sc.close(); 
    }
}
