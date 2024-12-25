public class Counting{

    static void Count(int n){
        if( n > 0 ){
            System.out.println("n");
            Count(n-1);
        }
        System.out.println(n);
    }
    
    public static void main(String []args){
        Count(5);

    }
    
}
