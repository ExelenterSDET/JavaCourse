package Day17.Practice;

public class Tohir {

            public static void main(String[] args) {
            //1
                String str ="ABC";
            int number = 5;
            //print A1, A2,A3, A4, A5, B1, ...
            for(int i=0; i<str.length();i++){
                for (int j=1; j<number+1;j++){
                    System.out.print(""+str.charAt(i)+j+" ");
                }
                System.out.println();
            }
            //2
            for (int i=1; i <11; i++) {
                for (int j = 1; j < 11; j++) {
                    System.out.println(i + " times " + j + " is equals to " + i * j);
                }
                for (int i = 1; i < 11; i++) {
                    for (int j = 1; j < 11; j++) {
                        System.out.print("#");
                    }
                    System.out.println("");
                }
            }
            //3
                for (int i = 1; i<6; i++) {
                    for (int j = 0; j <= i - 1; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            //4
                    String str = "xyz";
                    String str2 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwangyy";
                    for (int i=0; i<str.length();i++){
                        int total = 0;
                        for (int j = 0; j<str2.length();j++)
                        {
                            total+=str2.charAt(j)==str.charAt(i) ? 1:0;
                        }
                        System.out.println("total = " + total);
                    }
                    // char c = str.charAt(i);
                    // String st = String.valueOf(c);
                    //System.out.println(st+"=" + (str2.length()-str2.replace(st, "").length()));
                }


            }
