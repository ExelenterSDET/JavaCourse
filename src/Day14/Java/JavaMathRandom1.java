package Day14.Java;

public class JavaMathRandom1 {

    /*
  Math.random() It returns a double value with a positive sign,
  greater than or equal to 0.0 and less than 1.0.
   */

    public static void main(String[] args) {

        double random = Math.random(); // always returns random double number between 0 and 1
        System.out.println("random = " + random);
        double random2 = random * 3; // return random double number btw 0 and 3
        System.out.println(random2);

        int iRandom = (int)random2; // returns random int number between 0 and 3
        System.out.println("iRandom = " + iRandom);

        int iRandom2 = (int)random2 + 1; // int random number btw 1 and 4
        System.out.println("iRandom2 = " + iRandom2);

        // (int)(Math.random() * (max - min)) + min;
        int rndBtwOneAnd4 = (int)(Math.random()*(4-1))+1;
        System.out.println("rndBtwOneAnd4 = " + rndBtwOneAnd4);
        int rnd = (int)(Math.random()*3)+1;
        System.out.println("rnd = " + rnd);

        // What if we want a random int number between 24 and 26
        int rnd2 = (int)(Math.random()*(26-24))+24;
        System.out.println("rnd2 = " + rnd2);

        // what if we want to have random double number between 24 and 25;
        double db3 = Math.random()*(25-24)+24;
        System.out.println("db3 = " + db3);

    }
}
