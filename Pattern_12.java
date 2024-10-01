import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int space = n-1;

        while(row <= n)
        {
            // For Spaces
            int col1 = 1;
            while(col1 <= space)
            {
                System.out.print("  ");
                col1++;
            }

            //  For Star
            int col2 = 1;
            while(col2 <= star)
            {
                if(col2 %2 != 0)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
                col2++;
            }
            System.out.println();
            star += 2;
            space--;
            row++;
        }
        sc.close();
    }
}
