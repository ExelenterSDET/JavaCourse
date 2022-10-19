package Day51.Practice.Dilnoza;

public class Questions {
    public static void main(String[] args)throws Exception {


   Object obj = new Integer(3);
    String str = (String ) obj;
        System.out.println("str = " + str);
        System.out.println(1/0);
        throw new RuntimeException("Exception");
}
   }