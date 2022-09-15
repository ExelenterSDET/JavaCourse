package Day26.Practice;

public class AnthonyOCAexamples {
    public static void main(String[] args) {
        System.out.println("=========================== OCA 1 ===============================================");
        int numbers [];
        numbers = new int [2];
        numbers [0] = 10;
        numbers [1] =20;

        numbers = new int[4];
        numbers [2] =30;
        numbers [3] =40;
        for (int x : numbers){
            System.out.print(x + ", " );
        }
        System.out.println("\n"+"=========================== OCA 2 ===============================================");

        String str1 = "Java";
        String [] str2 = {"J", "a", "v", "a"};
        String str3 = "";
        for (String str: str2 ){
            str3 = str3+str;
        }
        boolean b1 = (str1.equals(str3));
        boolean b2 = (str1 == str3);
        System.out.println(b1+ ", "+b2);

        System.out.println("=========================== OCA 3 ===============================================");
        String opt = "true";
        switch(opt){
            case "true":
                System.out.print("True");
                break;
            default:
                System.out.print("***");
        }
        System.out.println("Done");
        System.out.println("\n"+"=========================== OCA 5 ===============================================");
        int n [][]= {{1,3}, {2,4}};
        for (int i = n.length-1 ; i>=0; i--){
            for (int y : n[i]){
                System.out.print(y);
            }
        }
        System.out.println("\n"+"=========================== OCA 6 ===============================================");
        int ii =0;
        int jj=7;
        for ( ii = 0; ii < jj-1; ii= ii+2) {
            System.out.print(ii + " ");

        }
    }
}
