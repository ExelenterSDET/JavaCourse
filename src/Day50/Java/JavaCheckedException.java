package Day50.Java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class JavaCheckedException {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("test.txt");
        }catch(Exception e){

        }
    }
}
