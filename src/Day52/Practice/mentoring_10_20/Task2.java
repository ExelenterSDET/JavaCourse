package Day52.Practice.mentoring_10_20;

import org.testng.Assert;

import java.util.Arrays;

/*Given two String, determine if they are anagram.
        s = "anagram";
        t = "naagram";
        return true;
        if they dont share same char return false*/
public class Task2 {

    static boolean isAnagram(String str1, String str2){

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        //anagram
        //naagram
        // ch1 = aaagmnr
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i]){
                return false;
            }
        }
        return true;
    }

    static boolean isAnagram2(String str1, String str2){

       int[] arr1 = new int[26];
       int[] arr2 = new int[26];
        //      final   lanif
        for (int i = 0; i < str1.length(); i++) {
            arr1[str1.charAt(i) - 'a']++;
            arr2[str2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == arr2[i]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean anagram = isAnagram2("final", "lanif");
        System.out.println(anagram);
    }


}
