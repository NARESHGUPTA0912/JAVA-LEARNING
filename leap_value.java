import java.util.Scanner;

public class leap_value {
    public static void main(String []args){
        System.out.println("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if(year%400 == 0){
            System.out.println("Year is a leap year");
        }
        else if(year % 100 == 0){
            System.out.println("not a leap year");
        }
        else if(year % 4 == 0){
            System.out.println("Year is a leap year");
        }
        else{
            System.out.println("not a leap year");
        }

    }
    
}
