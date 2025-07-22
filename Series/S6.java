import java.util.*;
public class S6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum+=i*i-1;
        }
        System.out.println(sum);
    }
}
