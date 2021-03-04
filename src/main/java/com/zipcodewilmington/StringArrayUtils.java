package com.zipcodewilmington;

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
        boolean result = false;
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)) {
                result = true;
            }
        }   return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            reverseArray[j - 1] = array[i];
            j = j - 1;
        } return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean palCheck = false;
        String[] revArray = new String[array.length];
        int j = array.length;
        for (int i = 0; i < array.length; i++) {
            revArray[j - 1] = array[i];
            j = j - 1;
            if(array[i] == revArray[i]) {
                palCheck = true;
            }
        }
        return palCheck;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        boolean tester = false;
        String arrayToString = "";
        for (int j= 0; j < array.length; j++) {
            arrayToString = arrayToString.concat(array[j]);
        }
        arrayToString = arrayToString.toLowerCase();
           for(char letters = 'a';letters <= 'z'; letters++) {
                for (int i = 0; i < arrayToString.length(); i ++ ){
                    if (letters == arrayToString.charAt(i)) {
                        tester = true;
                    }
                }
                if (tester == false) {
                    return tester;
                } tester = false;
            }
            return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == value){
                counter++;
            }
        }
        return counter;
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
