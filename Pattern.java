public class Pattern {


    static void rows(int m, int n){
        if(m > 0 || n > 0){
            System.out.println("* ");
            rows(m-1,n-1);
        }

    }

    static void column(int n){
        if(n > 0){
            System.out.print("* ");
            column(n-1);
        }
    }


    public static void main(String []args){
        rows(5 , 5);
        column(5);
    }
    
}
