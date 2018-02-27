package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
//declaring get first method in a string array
//the output "string" comes before the method
    public static String getFirstElement(String[] array) {
//assigning my string "first" to the first index of the array which is always zero
        String first = array[0];
//return the first element/index of the string first
        return first;
    }

    public static String getSecondElement(String[] array) {

        String second = array[1];

        return second;
    }

    public static String getLastElement(String[] array) {
//subtract 1 from the length of the array and assign that to an int
        int result = array.length - 1;
//assign the value of int result to a string
        String finalResult = array[result];
//return the final result
        return finalResult;
    }

    public static String getSecondToLastElement(String[] array) {
//Same thing for last element but this time subtract to for second to last index
        int result = array.length - 2;
        String finalResult = array[result];
//return final result
        return finalResult;
    }

    public static boolean contains(String[] array, String value) {
//boolean so the output will return true or false
//arguements of a string array and a value of string
        for (int i = 0; i < array.length; i++) {
//assigning i = 0 , i is less than the length of the array, then increment by 1
            if (array[i].equals(value)) {
//if the array of index i which is zero is equal to the value of the string then return true
                return true;
            }
        }
        return false; //otherwise return false
    }

    public static String[] reverse(String[] array) {
//output will be a string array in reverse
        String[] newReverse = new String[array.length];
//my new string array called 'newReverse' = string array with an index of length
        for (int i = 0; i < newReverse.length; i++) {
            newReverse[i] = array[array.length - 1 - i];
//my newReverse string now has an index of the length of the array and the index now consist of the length - 1 - i which is now at the end of the loop
// new StringBuilder(string variable).reverse().toString()
        }
        return newReverse;
    }

    public static boolean isPalindromic(String[] array) {
        //String builder version
//        public class StringBuilderDemo {
//            public static void main(String[] args) {
//                String palindrome = "Dot saw I was Tod";
//
//                StringBuilder sb = new StringBuilder(palindrome);
//
//                sb.reverse();  // reverse it
//
//                System.out.println(sb);
        int range = array.length;

        for (int i = 0; i < array.length; i++) {
            String beginning = array[i];
            System.out.println("Here is the beginning: " + beginning);
            String ending = array[--range];
            System.out.println("Here is the ending: " + ending);

            if (range < i) {
                System.out.println(" ");

                return true;

            }
            if (!(beginning.equals(ending))) {
                System.out.println("");

            }
        }
        return false;
    }

    public static boolean isPangramic(String[] array) {

        String upperCase = "";

        for (int i = 0; i < array.length; i++) {
            upperCase += array[i].toUpperCase();
        }

        for(char letter = 'a'; letter <= 'z'; letter++){
            if(upperCase.indexOf(letter) < 0) {
                return true;
            }
        }
        return false;
    }



    public static int getNumberOfOccurrences(String[] array, String value) {

        int valCount = 0;

        for (String arrayElement : array) {

            if (arrayElement.equalsIgnoreCase(value)) {
                valCount++;
            }
        }
        return valCount;
    }

    public static String[] removeValue(String[] array, String valueToRemove) {

        int removeValue = getNumberOfOccurrences(array, valueToRemove);
            String[] valsRemoved = new String[array.length - removeValue];

        int counter = 0;

        for (int i = 0; i < array.length; i++) {

            if (!array[i].equalsIgnoreCase(valueToRemove)) {
                valsRemoved[counter] = array[i];
                counter++;
            }
        }

        return valsRemoved;
    }

                public static String[] removeConsecutiveDuplicates (String[]array){

                    int indexOne = 0;
                    int dubCount = 0;

                    for (int count = 1; count < array.length; count++) {
                        if (array[indexOne].equalsIgnoreCase(array[count])) {
                            dubCount++;
                        }
                        indexOne++;
                    }

                    int newCount = 1;
                        String newArray[] = new String[array.length - dubCount];
                        newArray[0] = array[0];
                        indexOne = 0;

                    for (int count = 1; count < array.length; count++) {
                        if (array[indexOne].equalsIgnoreCase(array[count])) {
                            indexOne++;
                            continue;

                        }
                        newArray[newCount] = array[count];
                        indexOne++;
                        newCount++;

                    }
                    return newArray;
                }

                public static String[] packConsecutiveDuplicates (String[]array){
//assign the duplicate counter equal to zero
                    int dubCount = 0;
//loop through to find the number of duplicates
                    for (int i = 1; i < array.length; i++) {

                        if (array[i].equals(array[i - 1])) {
                            dubCount++;
                        }
                    }
//declare new string array for amount of non copies to a new string array with the arguements of the length of the original array minus the amount of duplicates
                    String[] zeroCopies = new String[array.length - dubCount];
                    zeroCopies[0] = array[0];
//assign the number of originals to 1
                    int originals = 1;
//loop through to find the number of original duplicates in consecutive order
                    for (int i = 1; i < array.length; i++) {

                        if (!array[i].equals(array[i - 1])) {
                            zeroCopies[originals] = array[i];
                            originals++;
                        }
                    }
                    return zeroCopies;
                }
            }
//return the number of the consecutive duplicates