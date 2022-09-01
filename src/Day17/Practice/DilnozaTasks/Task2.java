package Day17.Practice.DilnozaTasks;

public class Task2 {
    /*
    utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang
    print all chars and count how many times it appears

     */

    public static void main(String[] args) {
        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmunnnnngmvbzwang";
        String toAvoidDuplicates ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (toAvoidDuplicates.contains(String.valueOf(ch))){
                continue;

        }
            toAvoidDuplicates+=ch;

            int counter =0;
            for (int j = 0; j < str.length(); j++) {
                    if(str.charAt(j)==ch ){
                        counter+= 1;
                    }

                }
            System.out.println(ch+" = "+ counter+" ");
            }


        }
    }

