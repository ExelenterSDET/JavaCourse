package Day15.Practice.Sebahattin;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
/*
        Create a random password generator.
        1. Password should be minimum 16 characters
        2. Password should have 4 Capital letter.
        3. Password should have 4 lower case letter.
        4. Password should have 4 numbers.
        5. Password should have 4 special character.

        Example: Qe4$Os5!De1$Oe3&
 */
        //Task2
        Random input = new Random();
        int characters = 16;
        char ch ;
        String str ;
        int n = 1;
        int c = 1;
        int l = 1;
        int s = 1;
        while (characters >= 1){
            int desk = input.nextInt(4-1+1)+1;
            switch (desk){
                case 1:
                    if (n <= 4){
                        int num = input.nextInt(57-48+1)+48;
                        ch = (char) num;
                        str = String.valueOf(ch);
                        n++;
                        System.out.print(str);
                    }
                    else {
                        characters++;
                    }
                    break;
                case 2:
                    if (c <= 4){
                        int capital = input.nextInt(90-65+1)+65;
                        ch= (char) capital;
                        str = String.valueOf(ch);
                        c++;
                        System.out.print(str);
                    }
                    else {
                        characters++;
                    }
                    break;
                case 3:
                    if (l <= 4){
                        int lower = input.nextInt(122-97+1)+97;
                        ch = (char) lower;
                        str = String.valueOf(ch);
                        l++;
                        System.out.print(str);
                    }
                    else {
                        characters++;
                    }
                    break;
                case 4:
                    if (s <= 4){
                        int special = input.nextInt(38-33+1)+33;
                        ch = (char) special;
                        str = String.valueOf(ch);
                        s++;
                        System.out.print(str);
                    }
                    else {
                        characters++;
                    }
                    break;
            }
            characters--;
        }
    }
}
