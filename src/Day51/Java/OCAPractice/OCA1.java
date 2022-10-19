package Day51.Java.OCAPractice;

import java.io.IOException;

public class OCA1 {
    public static void main(String[] args) {


    }


    public void ohNo() throws IOException {
        System.out.println("it's ok");
//        throw new IllegalArgumentException();
        throw new RuntimeException();
    }
}

/*
System.out.println("it's ok");
throw new Exception();
throw new IllegalArgumentException();
throw new java.io.IOException();
throw new RuntimeException();
 */
