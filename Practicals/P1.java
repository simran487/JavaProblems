import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int d = sc.nextInt();
        System.out.println("Enter the year: ");
        int y = sc.nextInt();
        System.out.println("Date after the prev. day: ");
        int n = sc.nextInt();
        int count=0;
        method1();

        public int method1(int d, int y, int n){
            checkday();
            checkmonth();
            checkyear();

            if(checkday==true && count==4){
                int arr[12] = {31,28,31,30,31,30,31,31,30,31,30,31};
                int arr1[12] = {31,29,31,30,31,30,31,31,30,31,30,31};

                if(y%400==0 || y%100!=0 && y%4==0){
                    for(int i = 0 ;i<n;i++){
                        if(arr1[i]<=d){
                            sum+=arr[i];
                            
                        }
                    }
                }
                System.out.println("Date: "+);
            }
        }
        boolean checkday(int d){
            if(d<366){
                return true;
            }
            else{
                return false;
            }
        }

        int checkmonth(int m){
            while(y!=0){
                int temp = y%10;
                count++;
                y/=10;
            }
            return count;
        }
    }
}
