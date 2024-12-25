import java.util.Scanner;

public class rotation {
    static int findLength(int n){
        if(n==0){
            return 0;
        }
        return findLength(n/10) + 1;
    }

    public static void main(String []args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number");
        int num = sc.nextInt();
        System.out.println("Input rotation value");
        int rotate = sc.nextInt();
        sc.close();

        int length = findLength(num);

        rotate = rotate % length ;

        if(rotate < 0){

            rotate = rotate - findLength(num) ;
        }
        for(int i = 0; i<rotate; i++){
            int remainder = num % 10;
            num = num / 10;
            int multiplier = (int) Math.pow(10,length - 1);
            int rotatednum = remainder * multiplier + num;
            num = rotatednum;

        }
        System.out.println(num);
    }
}

