import java.util.Scanner;

public class S32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of x: ");
        int  a = sc.nextInt();
        int sum = 0;
        for(int i =1;i<=n;i++){
            int temp = (int)Math.pow(a,i);
            sum+=temp;
        }
        System.out.println(sum);
    }
}
