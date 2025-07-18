package Series;
import java.util.*;
public class S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            double c = 1.0/i;
            sum+=c;
        }
        System.out.println(sum); 
        sc.close();
    }
}
