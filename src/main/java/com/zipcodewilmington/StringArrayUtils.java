package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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

        // another way to solve: return Arrays.asList(array).contains(value);

        boolean answer = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                answer = true;
            }
        }
        return answer;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] revOrder = new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            revOrder[array.length - (i + 1)] = array[i];
        }
        return revOrder;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(reverse(array), array);
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String combinedArr = "";
        for ( String letter : array) {
            combinedArr += letter;
        }

        String[] strArr = combinedArr.toLowerCase().replaceAll("\\s+", "").split("");
        Arrays.sort(strArr);

       String[] sortedArr = removeConsecutiveDuplicates(strArr);
       return sortedArr.length == 26;
    }


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {

            if (value.equals(array[i])) {
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

        int count = getNumberOfOccurrences(array, valueToRemove);
        String[] newArray = new String[array.length - count];

        int indx = 0;
        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                newArray[indx] = array[i];
                indx++;
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removed
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String[] noDuplicates = new String[0];
        for (int i = 0; i < array.length -1; i++) {
            if (!array[i].equals(array[i + 1])) {
                noDuplicates = Arrays.copyOf(noDuplicates, noDuplicates.length + 1);
                noDuplicates[noDuplicates.length - 1] = array[i];
            }
        }
        noDuplicates = Arrays.copyOf(noDuplicates, noDuplicates.length + 1);
        noDuplicates[noDuplicates.length - 1] = array[array.length - 1];
        return noDuplicates;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        StringBuilder builder = new StringBuilder(array[0]);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                builder.append(array[i]);
            }
            else {
                builder.append(" ");
                builder.append(array[i + 1]);
            }
        }
        return builder.toString().split(" ");
    }


}
