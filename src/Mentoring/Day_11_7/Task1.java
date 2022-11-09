package Mentoring.Day_11_7;
/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
Given an integer n, return true if n is an ugly number.

Ugly numbers are numbers whose only prime factors are 2, 3 or 5.
 The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers.
 By convention, 1 is included.

 A prime factor is a natural number, other than 1, whose only factors are 1 and itself.
 The first few prime numbers are actually 2, 3, 5, 7, 11, and so on.

 The simplest algorithm to find the prime factors of a number is to keep on dividing the original
 number by prime factors until we get the remainder equal to 1. For example, prime factorizing
 the number 30 we get, 30/2 = 15, 15/3 = 5, 5/5 = 1. Since we received the remainder,
 it cannot be further factorized.
*/
public class Task1 {
    static boolean isUglyNumber(int number){
        while (number != 1){
            if(number % 5 == 0){
                number = number / 5;
            } else if (number % 3 == 0) {
                number = number / 3;
            } else if (number % 2 == 0) {
                number = number / 2;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean uglyNumber = isUglyNumber(236);
        System.out.println("Is uglyNumber = " + uglyNumber);
    }

}
