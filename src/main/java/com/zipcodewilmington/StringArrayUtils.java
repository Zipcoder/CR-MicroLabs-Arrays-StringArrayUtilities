package com.zipcodewilmington;

import com.sun.xml.internal.fastinfoset.util.StringArray;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {

    public static String getFirstElement(String[] array) {

        String first = array[0];

        return first;
    }

    public static String getSecondElement(String[] array) {

        String second = array[1];

        return second;
    }

    public static String getLastElement(String[] array) {

        int result = array.length-1;
        String finalResult = array[result];

        return finalResult;
    }

    public static String getSecondToLastElement(String[] array) {

        int result = array.length-2;
        String finalResult = array[result];

        return finalResult;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        //  boolean check = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
            return false;
        }
    }
    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] newReverse = new String[array.length];

        for (int i = array.length; i > -1; i--) {
            for(String : array){

            }
            }

        return newReverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
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
