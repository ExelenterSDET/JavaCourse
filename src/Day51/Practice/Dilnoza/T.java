package Day51.Practice.Dilnoza;

public class T {

    public class Main {
    public String name;
     public void run() {
              System.out.print("1");
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
       public void main(String[] args) {
                 Main m = new Main();
                m.run();
               System.out.print("6");
           } }
}
