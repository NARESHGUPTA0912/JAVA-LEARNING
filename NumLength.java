public class NumLength {
    static int findLength(int n){
        if(n==0){
            return 0;
        }
        return 1 + findLength(n/10);
    }

    public static void main(String[] args) {
        System.out.println(findLength(12345));
    }
}
