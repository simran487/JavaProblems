import java.util.Scanner;

public class S57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int sum, mul = 1;
        for(int i = 1;i<=n;i++){
            sum = 0;
            for(int j = 1; j<=i;j++){
                sum+=j;
            }
            mul*=sum;
        }
        System.out.println(mul);
    }
}
