import java.util.*;

public class S29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(1/(Math.pow(a, i))+ " ");
        }
    }
}
