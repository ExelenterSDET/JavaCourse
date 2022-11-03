package OCA.Q73;

public class Q73 {
}

class Test{
    int x;
    int y;

    public void doStaff(int x, int y){
        x = x;
        y = this.y;
    }

    public void display(){
        System.out.println(x + " : " + y);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.x = 10;
        t.y = 20;
        Test t2 = new Test();
        t2.doStaff(10,20);

        t.display();
        t2.display();
    }

}
