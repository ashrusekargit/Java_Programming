import java.io.FileNotFoundException;
import java.io.FileReader;

class LowMarkException extends Exception{
    LowMarkException(String s){
        super(s);
    }
}

public class ExceptionEx2 {
    public static void main(String[] args) throws LowMarkException{
        //FileReader f = new FileReader("Text.text");
        int mark = 30;
        if(mark<40){
            throw new LowMarkException("Marks are lesser - fail"); 
        }
        
    }
    
}
