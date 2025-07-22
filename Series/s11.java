import java.util.Scanner;

public class s11 {
    public static void main(String[] args) {
        Scanner s3c =new Scanner(System.in);
        int n = sc.nextInt();
        int count=0, sum=0;
        for(int i = 1;i<=n;i++){
            count = count*10+5;
            sum+=count;
        }
        System.out.println(sum);
    }
}
