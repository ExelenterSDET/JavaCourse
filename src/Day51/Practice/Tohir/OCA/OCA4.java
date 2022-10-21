package Day51.Tohir.OCA;

public class OCA4 {
    public String name;
    public void run(){
        System.out.println("1");
        try {
            System.out.println("2");
            name.toString();
            System.out.println("3");
        }catch (NullPointerException e){
            System.out.println("4");
            //throw e;
        }
        System.out.println("5");
    }

    public static void main(String[] args) {
        OCA4 oca4 = new OCA4();
        oca4.run();
        System.out.println(6);
    }
}
