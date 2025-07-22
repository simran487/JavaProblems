import java.util.*;

public class S30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("enter the value of a: ");
        int a = sc.nextInt();
        float sum = 0;
        for(int i=1;i<=n;i++){
            float temp = 1/(float)(Math.pow(a,i));
            sum+=temp;
        }
        System.out.println(sum);
    }
}
