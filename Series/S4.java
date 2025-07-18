package Series;
import java.util.*;
public class S4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit : ");
        int n = sc.nextInt();
        double sum = 0;
        for(double i=1, j=2, k=1;k<=n;i+=2,j+=2,k++){
            double t = i/j;
            sum += t;
        }
        System.out.println(sum);
        sc.close();
    }
}
