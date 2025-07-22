import java.util.Scanner;

public class S16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        float p=1, q=0, sum=0, o = 1;
        for(int i=1;i<=n;i++){
            p*=o;
            q+=o;
            o+=2;
            float temp = p/q;
            sum+=temp;
            
        }
        System.out.println(sum);
    }
}
