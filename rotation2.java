import java.util.Scanner;

public class rotation2{
    static int findLength(int n){
        if(n==0){
            return 0;
        }
        // for finding absolute length
        // return (int) Math.log10(Math.abs(n)) + 1;
        return 1 + findLength(n/10);
    }

    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number");
        int num = sc.nextInt();
        System.out.println("Input rotation value");
        int rotate = sc.nextInt();
        sc.close();

        int length = findLength(num);

        // for negative rotation and rotation > length
        rotate = rotate % length ;
        if(rotate < 0){

            rotate = rotate + length ;
        }
            // for rotation operation
            int divisor = (int) Math.pow(10, rotate);
            int remainder = num % divisor;
            int quotient = num / divisor;
            int multiplier = (int) Math.pow(10,length - rotate);
            int rotatednum = remainder * multiplier + quotient;
            num = rotatednum;

        System.out.println(num);
    }
}
 