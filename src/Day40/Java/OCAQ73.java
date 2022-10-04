package Day40.Java;

public class OCAQ73 {
    int x;
    int y;

    public void doStaff(int x, int y){
        x = x;
        y = this.y;
    }

    public void print(){
        System.out.println(x + " " + y );
    }

}
class Test{
    public static void main(String[] args) {
        OCAQ73 m1 = new OCAQ73();
        m1.x = 100;
        m1.y = 200;
        OCAQ73 m2 =  new OCAQ73();
        m2.doStaff(m1.x, m1.y);
        m1.print();
        m2.print();
    }
}
