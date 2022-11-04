package OCA.Q85;

import java.io.IOException;

public class Q85 {
}

class MyExceptions extends RuntimeException {}

class Test{

    public static void main(String[] args) {
        try{
            method2();
        }catch(MyExceptions m){
            System.out.println("A");
        }catch (IOException i){
            System.out.println("B");
        }catch (Exception e){
            System.out.println("E");
        }
    }
    public static void method1() {
        try {
            throw 10>3 ? new MyExceptions() : new IOException();
        } catch (IOException i) {
            System.out.println("I");
        }catch (MyExceptions m){
            System.out.println("My exception");
        } catch(Exception e){
            System.out.println("B");
        }
    }

    public static void method2() throws Exception {
      throw 10<3 ? new MyExceptions() : new Exception();


    }

}
