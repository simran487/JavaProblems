import java.util.*;
public class S7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            if(i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
        System.out.println(sum);
    }
    
}
