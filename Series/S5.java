package Series;
import java.util.*;
public class S5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n= sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++){
            sum+=i*i;
        }
        System.out.println(sum);
        sc.close();
    }
}
