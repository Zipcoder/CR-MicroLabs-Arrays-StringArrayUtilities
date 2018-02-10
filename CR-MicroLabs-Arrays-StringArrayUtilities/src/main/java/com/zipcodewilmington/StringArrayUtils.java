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

        for (String check : array) {
            if (check.equals(value))
                return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] reverseArray = new String[array.length];
        int arrayPosition = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[arrayPosition] = array[i];
            arrayPosition += 1;
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        return Arrays.equals(array, reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sb.toString().toLowerCase().indexOf(ch) < 0) {
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

        int occuranceCounter = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                occuranceCounter++;
            }
        }
        return occuranceCounter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int numValuesToRemove = 0;
        int element = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToRemove)) {
                numValuesToRemove++;
            }
        }
        String[] removedValues = new String[array.length - numValuesToRemove];
        for (int j = 0; j < array.length; j++) {
            if (!array[j].equalsIgnoreCase(valueToRemove)) {
                removedValues[element] = array[j];
                element++;
            }
        }
        return removedValues;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String unique = array[0] + " ";

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                unique += array[i] + " ";
            }
        }
        String[] output = unique.split(" ");
        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String packing = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                packing += array[i];
            } else {
                packing += " " + array[i];
            }
        }
        String[] output = packing.split(" ");
        return output;
    }
}
