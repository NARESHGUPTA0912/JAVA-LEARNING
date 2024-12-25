import javax.sound.sampled.SourceDataLine;

public class armstrong{

    public static void main(String[] args) {
        
    
    
    int num = 153;
    int original_num  = num ;
    int original_num2 = num ;
    int count = 0;
    int power = 1;


    while(original_num != 0){
        original_num /= 10;
        count++;
    }

    while(original_num != 0){
            power = 1;
        int rem = original_num % 10;
        for(i=0;i<count;i++){
            power = power * rem;
        }
        sum = sum + power;
        original_num /= 10;

    }




}



}
