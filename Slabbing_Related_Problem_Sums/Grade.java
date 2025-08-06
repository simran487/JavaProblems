import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int m = sc.nextInt();
        if(m>=90){
            System.out.println("A");
        }
        else if(m>=70 && m<=89){
            System.out.println("B");
        }
        else if(m>=50 && m<=69){
            System.out.println("C");
        }
        else{
            System.out.println("D");
        }
    }
}
