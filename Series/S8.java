import java.util.*;
public class S8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit: ");
        int n = sc.nextInt();
        int sum = 0, count = 0;
        for(int i=1;i<=n;i++){
            int no = (i*2)-1;
            if(no%2!=0){
                count++;
                if(count%2!=0){
                    sum+=no;
                }
                else{
                    sum-=no;
                }
            }
        }
        System.out.println(sum);
    }
}
