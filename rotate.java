import java.util.Scanner;

public class rotate {


    static int findLength(int n){
        if(n==0){
            return 0;
        }
        return 1 + findLength(n/10);
    }

    public static void main(String []args){

        int mul = 0;
        int remainder = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number");
        int num = sc.nextInt();
        System.out.println("Input rotation value");
        int rotate = sc.nextInt();
        sc.close();

        if(rotate < 0){

            rotate = rotate - findLength(num) ;
        }
        for(int i = 0; i<rotate; i++){

            remainder = num % 10;
            num = num / 10;
            mul = remainder * 10000 + num;
            num = mul;

        }

        System.out.println(num);
    }
}
