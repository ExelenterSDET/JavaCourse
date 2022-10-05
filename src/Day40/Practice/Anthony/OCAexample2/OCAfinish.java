package Day40.Practice.Anthony.OCAexample2;

public class OCAfinish {
    public static void main(String[] args) {
        OCA2.MyField m1 = new OCA2.MyField();
        m1.x = 100;
        m1.y = 200;
        OCA2.MyField m2 = new OCA2.MyField();
        m2.doStuff(m1.x, m1.y);
        m1.display();
        m2.display();
    }
}
