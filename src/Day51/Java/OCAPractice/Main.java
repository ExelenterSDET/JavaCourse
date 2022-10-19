package Day51.Java.OCAPractice;

public class Main {
    public String name;

    public void run() {
        System.out.print("1"); // print
        try {
            System.out.print("2");
            name.toString();
            System.out.print("3");
        } catch (NullPointerException e) {
            System.out.print("4");
            throw e;
        }
        System.out.print("5");
    }


    public void start() {
        try {
            System.out.print("AAA");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("BBB");
            System.exit(0);
        } finally {
            System.out.print("CCC");
        }
    }

//        public static void main (String[]args){
//            Main m = new Main();
//            m.run();
//            System.out.print("6");
//        }

    public static void main(String[] args) {
        new Main().start();
    }
}
