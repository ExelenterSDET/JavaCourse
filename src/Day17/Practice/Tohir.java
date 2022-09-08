//package Day17.Practice;
//
//
//public class Day20.Practice.Tohir {
//
//            public static void main(String[] args) {
//            //1
//                String str ="ABC";
//            int number = 5;
//            //print A1, A2,A3, A4, A5, B1, ...
//            for(int i=0; i<str.length();i++){
//                for (int j=1; j<number+1;j++){
//                    System.out.print(""+str.charAt(i)+j+" ");
//                }
//                System.out.println();
//            }
//            //2
//            for (int i=1; i <11; i++) {
//                for (int j = 1; j < 11; j++) {
//                    System.out.println(i + " times " + j + " is equals to " + i * j);
//                }
//                for (int i = 1; i < 11; i++) {
//                    for (int j = 1; j < 11; j++) {
//                        System.out.print("#");
//                    }
//                    System.out.println("");
//                }
//            }
//            //3
//                for (int i = 1; i<6; i++) {
//                    for (int j = 0; j <= i - 1; j++) {
//                        System.out.print("*");
//                    }
//                    System.out.println("");
//                }
//            //4
//                    String str = "xyz";
//                    String str2 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwangyy";
//                    for (int i=0; i<str.length();i++){
//                        int total = 0;
//                        for (int j = 0; j<str2.length();j++)
//                        {
//                            total+=str2.charAt(j)==str.charAt(i) ? 1:0;
//                        }
//                        System.out.println("total = " + total);
//                    }
//                    // char c = str.charAt(i);
//                    // String st = String.valueOf(c);
//                    //System.out.println(st+"=" + (str2.length()-str2.replace(st, "").length()));
//                }
//
//
//
//
//
//
//    /*
//Homework
//String num1 = "368"
//String num2 = "1020304050"
//
//10 20 30 40 50 60
// 3  3  3  3  3  3 = 12345
// 6  6  6  6  6  6 = 42042
// 8  8  8  8  8  8 = 24602
//*/
//    public static void main(String[] args) {
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter yor first number = ");
//        String str1 = scan.nextLine();
//        System.out.println("Enter yor second number = ");
//        String str2 = scan.nextLine();
//        for(int i=0;i<str1.length();i++){
//            int num_1 = Integer.valueOf(str1.substring(i,i+1));
//            System.out.println("");
//            for(int j=0;j<str2.length();j+=2){
//                int num_2 = Integer.valueOf(str2.substring(j,j+2));
//                System.out.print(num_2%num_1);
//            }
//
//        }
//
//    }
//}
//
