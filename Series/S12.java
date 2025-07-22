import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0, s = 0;
        for(int i =1;i<=n;i++){
            t = t*10+i;
            s+=t;
        }
        System.out.println(s);
    }
}
