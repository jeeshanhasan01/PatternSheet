import java.util.Scanner;
public class Pattern_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = 1;
        int count1 = 1;
        while(row <= 2*n-1)
        {
            int col1 = 1;
            int count = row;
            if(row > n)
            {
                count = row - ++count1;
                count1++;
            }
            while(col1 <= star)
            {
                if(col1 % 2 != 0)
                {
                    System.out.print(count + " ");
                }else{
                    System.out.print("* ");
                }
                col1++;
            }

            // Prep for the next iter 
            if(row <= n-1)
            {
                star += 2;
            }else{
                star -= 2;
            }
            System.out.println();
            row++;
        }
        sc.close();
    }
}
