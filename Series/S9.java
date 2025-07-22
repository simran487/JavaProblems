import java.util.*;
public class S9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int no = 1;
        int sum = 1;
        if(n==1){
            System.out.println(1);
        }
        else{
            for(int i= 2;i<=n;i++){
                no = no*2;
                sum+=no;
            }
        }
        System.out.println(sum);
    }
}
