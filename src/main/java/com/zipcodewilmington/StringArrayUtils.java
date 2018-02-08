package com.zipcodewilmington;

import java.io.*;
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
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
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

        String [] reversedArray = new String [array.length];


        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length-1-i] = array[i];
            //if array.length is 10
            // reversedArray[array[10-1*accounts for the 0 index* -0 ]
            // reversedArray[array[10-1*accounts for the 0 index* -1 ]
            // reversedArray[array[10-1*accounts for the 0 index* -2 ]
            // reversedArray[array[10-1*accounts for the 0 index* -3 ]...etc

        }
        return reversedArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String [] reversedArray = new String [array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[array.length - 1 - i] = array[i];
        }
        for (int k =0; k < reversedArray.length; k++) {
            if (reversedArray[k].equals(array[k])) {
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
        String changedArrayToString = Arrays.toString(array);
        changedArrayToString.toLowerCase();
        char [] changedArrayToChar = changedArrayToString.toCharArray();
        char [] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < changedArrayToChar.length; i++) {
            if (alphabet[i] == changedArrayToChar[i]){
                return true;

            }
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
       int count = 0;
        for (int i = 0; i < array.length ; i++) {
            if (value.equals(array[i])){
                count++;

            }
        }
        return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
//        String changedArrayToString = Arrays.toString(array);
//        for (int i = 0; i < changedArrayToString.length(); i++) {
//            if (valueToRemove.equals(changedArrayToString[i])) {
//                changedAr
//
//            }
//        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
