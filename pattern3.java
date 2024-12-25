public class pattern3 {
    static void rows(int row , int col){
        if(row > 0){
            column(col);
            System.out.println();
            rows(row-1,col-1); 
        }
    }

    static void column(int col){
        if(col > 0){
            System.out.print("* ");
            column(col-1);
        }
    }

    public static void main(String []args){
        rows(5 , 5);
    }  
    
}
