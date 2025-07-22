import java.util.Scanner;

public class S15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        float t=1, p=0;
        float sum=0;
        for(int i=1; i<=n;i++){
            t *= i;
            p += i;
            float temp = p/t;
            System.out.println(temp);
            sum = sum + temp;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
    
}
