import java.util.Scanner;

public class P1 {

    void leapyear(int d, int y){
        int y1 = y;
        int d1 = d;
        int pd = 0;
        if(d1>0 && d1<=31){
            pd=d1;
            System.out.println(pd+" January "+y1);
        }
        else if(d1>31 && d1<=60){
            pd = d1-31;
            System.out.println(pd+" Februray "+y1);
        }
        else if(d1>60 && d1<=91){
            pd = d1-60;
            System.out.println(pd+" March "+y1);
        }
        else if(d1>91 && d1<=121){
            pd = d1-91;
            System.out.println(pd+" April "+y1);
        }
        else if(d1>121 && d1<=152){
            pd = d1-121;
            System.out.println(pd+" May "+y1);
        }
        else if(d1>152 && d1<=182){
            pd = d1-152;
            System.out.println(pd+" June "+y1);
        }
        else if(d1>182 && d1<=213){
            pd = d1-182;
            System.out.println(pd+" July "+y1);
        }
        else if(d1>213 && d1<=244){
            pd = d1-213;
            System.out.println(pd+" August "+y1);
        }
        else if(d1>244 && d1<=274){
            pd = d1-244;
            System.out.println(pd+" September "+y1);
        }
        else if(d1>274 && d1<305){
            pd = d1 - 274;
            System.out.println(pd+" October "+y1);
        }
        else if(d>305 && d<=335){
            pd = d1 - 305;
            System.out.println(pd+" November "+y1);
        }
        else if(d>335 && d<=366){
            pd = d1-335;
            System.out.println(pd+" December "+y1);
        }
        else{
            System.out.println("Date exceeds from the year given!");
        }
        }
        void normalyear(int d, int y){
            int d1 = d;
            int y1 = y;
            int pd = 0;
            if(d1>0 && d1<=31){
                pd = d1;
                System.out.println(pd+" January "+y1);
            }
            else if(d1>31 && d1<=59){
                pd = d1-31;
                System.out.println(pd+" Februray "+y1);
            }
            else if(d1>59 && d1<=90){
                pd = d1-59;
                System.out.println(pd+" March "+y1);
            }
            else if(d1>90 && d1<=120){
            pd = d1-90;
            System.out.println(pd+" April "+y1);
            }
            else if(d1>120 && d1<=151){
            pd = d1-120;
            System.out.println(pd+" May "+y1);
            }
        else if(d1>151 && d1<=181){
            pd = d1-151;
            System.out.println(pd+" June "+y1);
        }
        else if(d1>181 && d1<=212){
            pd = d1-181;
            System.out.println(pd+" July "+y1);
        }
        else if(d1>212 && d1<=243){
            pd = d1-212;
            System.out.println(pd+" August "+y1);
        }
        else if(d1>243 && d1<=273){
            pd = d1-243;
            System.out.println(pd+" September "+y1);
        }
        else if(d1>273 && d1<=304){
            pd = d1 - 273;
            System.out.println(pd+" October "+y1);
        }
        else if(d>304 && d<=334){
            pd = d1 - 304;
            System.out.println(pd+" November "+y1);
        }
        else if(d>334 && d<=365){
            pd = d1-334;
            System.out.println(pd+" December "+y1);
        }
        else{
            System.out.println("Date exceeds from the year given!");
        }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day: ");
        int d = sc.nextInt();
        System.out.println("Enter the year: ");
        int y = sc.nextInt();
        System.out.println("Date after the prev. day: ");
        int n = sc.nextInt();
        int count=0;
        int y2 = y;
        while(y2!=0){
            int t = y2%10;
            count++;
            y2/=10;
        }
        P1 ob = new P1();
        if((d>0 && d<=366) && (y%400==0 || y%4==0 && y%100!=0) && (n>0 && n<=100) && count==4){
            ob.leapyear(d,y);
            ob.leapyear(d+n,y);
        }    
        else if((d>0 && d<=365) && (n>0 && n<=100) && count==4){
            ob.normalyear(d,y);
            ob.normalyear(d+n,y);
        }    
        else{
            System.out.println("enter the days between under 365 and 4 digit year and further day between 0 and 100: ");
        }
    }
}
