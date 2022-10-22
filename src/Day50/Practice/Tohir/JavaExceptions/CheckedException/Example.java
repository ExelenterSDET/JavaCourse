package Day50.JavaExceptions.CheckedException;

import java.io.FileInputStream;

public class Example {
    public static void main(String[] args) {

        try {
            FileInputStream fls =new  FileInputStream("Test");
        }catch (java.io.FileNotFoundException e) //or Exception
        {
            System.out.println("Checked exception");
        }

    }
}
