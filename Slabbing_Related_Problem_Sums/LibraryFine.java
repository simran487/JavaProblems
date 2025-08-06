import java.util.*;
public class LibraryFine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the days: ");
        int days = sc.nextInt();
        if(days>=1 && days<=5){
            int fine = 40.days;
        }
        else if(days>=6 && days<=10){
            int fine = 65*(days-6)+40
        }
    }
}
