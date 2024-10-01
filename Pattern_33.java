import java.util.Scanner;

public class Pattern_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int space = n-1;
        int star = 1;

        while(row <= n)
        {
            int col1 = 1;
            while(col1 <= space)
            {
                System.out.print("  ");
                col1++;
            }

            int col2 = 1;
            int count = n-row+1;
            while(col2 <= star)
            {
                if(col2 == star/2+1)
                {
                    System.out.print("0 ");
                }
                else{
                    System.out.print(count+" ");
                }
                if(col2 <= star/2)
                {
                    count++;
                }else{
                    count--;
                }
                col2++;
            }

            //  Prep for the next Iter
            System.out.println();
            row++;
            space--;
            star += 2;
        }
        sc.close();
    }
}
