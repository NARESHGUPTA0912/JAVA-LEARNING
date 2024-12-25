package java pattern;

public class Pattern1 { 
    public static void main(String [] args){
        Counting(5);

    }
    
    static void Counting(int a){
        if(int i > 0){
            System.out.println(i);
            Counting(i+1);
        }
    }
}
    
    

