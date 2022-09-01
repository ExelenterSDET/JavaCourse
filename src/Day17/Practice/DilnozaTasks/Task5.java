package Day17.Practice.DilnozaTasks;

public class Task5 {
    public static void main(String[] args) {
/*
 return number of xyz as in string
 */

String str1 = "xyz";
String  str2 ="utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwang";

         for (int i = 0; i <str1.length() ; i++) {

            int counter= 0 ;
            for (int j = 0; j <=str2.length() ; j++) {
                counter+= str2.charAt(j)==str1.charAt(i)? 1:0 ;

            } System.out.print(str1.charAt(i)+ " = "+ counter);


            }

        }



    }

