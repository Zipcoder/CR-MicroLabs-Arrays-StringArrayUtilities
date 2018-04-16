package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * @TODO
 * Implement different methods to exploit and manipulate strings & arrays
 */
public class StringArrayUtils {

    public static String getFirstElement(String[] array) {
//assigning my string "first" to the first index of the array which is always zero
        return array[0];
    }

    public static String getSecondElement(String[] array) {
        return array[1];
    }

    public static String getLastElement(String[] array) {
        int result = array.length - 1;
        return array[result];
    }

    public static String getSecondToLastElement(String[] array) {
        int result = array.length - 2;
        return array[result];
    }

    public static boolean contains(String[] array, String value) {
        for (String strArray : array) {
            if (strArray.equals(value)) {
                return true;
            }
        }

        return false;
    }

    public static String[] reverse(String[] array) {
        String[] newReverse = new String[array.length];
        for (int i = 0; i < newReverse.length; i++) {
            newReverse[i] = array[array.length - 1 - i];
        }

        return newReverse;
    }

    public static boolean isPalindromic(String[] array) {
        /*
          @Palindrome:
         * Its when a sequence of characters or numbers are the same in reverse order
         */

        //String builder version
//        public class StringBuilderDemo {
//            public static void main(String[] args) {
//                String palindrome = "He must be dumb since his name is bmud";
//                StringBuilder sb = new StringBuilder(palindrome);
//                sb.reverse();  // reverse it
//                System.out.println(sb);
        int range = array.length;
        for (int i = 0; i < array.length; i++) {
            String beginning = array[i];
            System.out.println("Here is the beginning: " + beginning);
            String ending = array[--range];
            System.out.println("Here is the ending: " + ending);
            if (range < i) {
                System.out.println("");
                return true;
            }

            if (!(beginning.equals(ending))) {
                System.out.println("");
            }
        }

        return false;
    }

    public static boolean isPangramic(String[] array) {
        StringBuilder upperCase = new StringBuilder();
        for (String strArray : array) {
            upperCase.append(strArray.toUpperCase());
        }

        for(char letter = 'a'; letter <= 'z'; letter++){
            if(upperCase.toString().indexOf(letter) < 0) {
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

    public static String[] removeConsecutiveDuplicates (String[]array) {
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
        int dubCount = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                dubCount++;
            }
        }

        String[] zeroCopies = new String[array.length - dubCount];
        zeroCopies[0] = array[0];
        int originals = 1;
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                zeroCopies[originals] = array[i];
                originals++;
            }
        }

        return zeroCopies;
    }
}
