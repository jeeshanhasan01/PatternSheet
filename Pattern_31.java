import java.util.Scanner;
public class Pattern_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =  1;
        int star = n;

        while(row <= n)
        {
            int col1 = 1;
            int count = n;
            while(col1 <= star)
            {
                if(row + col1 == n+1){
                    System.out.print("* ");
                    count--;
                }else{
                    System.out.print(count+" ");
                    count--;
                }
                col1++;
            }

            // Prep for the next Iter
            System.out.println();
            row++;
        }
        sc.close();
    }
}
