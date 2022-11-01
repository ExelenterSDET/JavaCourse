package Day57.Tohir.Ex2;

public class App {
    public static void main(String[] args) {
        ByTwo byTwo = new ByTwo(0);
        ByThree byThree = new ByThree(0);
        for (int i = 0;i<5 ; i++){
            try {
                byTwo.getNext();
                byThree.getNext();
            }catch (RuntimeException e){
                System.out.println(e);
            }

            System.out.println(byTwo.val + " - " + byThree.val);
        }
        System.out.println("==============");
        for (int i = 0; i < 2; i++) {
            byTwo.getPrev();
            byThree.getPrev();
            System.out.println(byTwo.val + " - " + byThree.val);
        }

    }
}
