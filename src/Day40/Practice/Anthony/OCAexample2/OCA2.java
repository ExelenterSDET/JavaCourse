package Day40.Practice.Anthony.OCAexample2;

public class OCA2 {
    /*
    question# 73
     */
    public static class MyField {
        int x;
        int y;

        public void doStuff(int x, int y) {
            x = x;
            y = this.y;
        }

        public void display() {
            System.out.println(x + "" + y + " :");
        }
    }
}


