public class pattern4{
    static void rows(int row){
    if(row > 0){
        System.out.println();
        column(row);
        rows(row-1);
        
    }
}

static void column(int col){
    if(col > 0){
        System.out.print("* ");
        column(col-1);
        
    }
}

public static void main(String []args){
    rows(5);
    // column(5);
}   
    
}
