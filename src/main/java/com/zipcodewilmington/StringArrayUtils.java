package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] esrever = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            esrever[array.length - 1 - i] = array[i];
        }
        return esrever;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] reversePalid = new String[array.length];
        String[] reversedAlready = reverse(array);
        for (int i = 0; i < array.length; i++) {
            if (reversedAlready[i] == array[i]) {

                return true;
            }
        }
        return false;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        StringBuilder pangram = new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            pangram.append(array[i]);

        }
        for (char alp = 'a'; alp <= 'z'; alp++) {

            if (pangram.toString().toLowerCase().indexOf(alp) < 0) {

                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value))
                count++;
        }

        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int indexToRemove = 0;

        int size = array.length - getNumberOfOccurrences(array, valueToRemove);

        String[] removeString = new String[size];
        for (int j = 0; j < array.length; j++) {
            if (!array[j].equals(valueToRemove)) {
                removeString[indexToRemove] = array[j];

                indexToRemove++;
            }
        }
        return removeString;
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        StringBuilder thisIsString = new StringBuilder();

        for (int i = 1; i < array.length; i++) {
            if (i == 1) thisIsString.append(array[i - 1] + " ");

            if (array[i] != array[i - 1]) {
                thisIsString.append(array[i]);
                thisIsString.append(" ");
            }
        }
        String completedString = thisIsString.toString();
        String[] lastArray = completedString.split(" ");

        System.out.println(Arrays.toString(lastArray));
        return lastArray;

    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        StringBuilder dupString = new StringBuilder();

        for (int i = 1; i < array.length; i++) {
            if (i == 1) dupString.append(array[i - 1]);

            if (array[i] == array[i - 1]) {
                dupString.append(array[i]);
            } else {
                dupString.append(" " + array[i]);
            }
        }
        System.out.println(dupString);

        String taco = dupString.toString();

        String[] thisArray = taco.split(" ");

        return thisArray;
    }


}

