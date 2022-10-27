package Day57.Java.Ex2;

public class App {
    public static void main(String[] args) {
        ByTwo byTwo = new ByTwo();
        ByThree byThree = new ByThree();
        for (int i = 0; i < 5; i++) {
            try{
                byTwo.getNext();
                byThree.getNext();
            }catch(RuntimeException e){
                System.out.println(e);
            }

            System.out.println(byTwo.val + " - " + byThree.val);
        }
        System.out.println("====================");
        for (int i = 0; i < 2; i++) {
            byTwo.getPrev();
            byThree.getPrev();
            System.out.println(byTwo.val + " - " + byThree.val);
        }
    }
}
