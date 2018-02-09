package com.zipcodewilmington;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */
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
     */
    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */
    public static boolean contains(String[] array, String value) { // TODO: maybe good chance to practice lambdas
        boolean res = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value))
                res = true;
        }
        return res;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */
    public static String[] reverse(String[] array) {
        String tmp;
        int n;
        for (int i=0; i <= Math.floor((array.length - 2)/2); i++) { // only have to move through half the string
            n = array.length - i - 1; // n tracks the current index's "mirror"
            tmp = array[i]; // save this String
            array[i] = array[n]; // copy 'mirror' to this index
            array[n] = tmp; // write the saved String to the 'mirror's place
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */
    public static boolean isPalindromic(String[] array) {
        return array.equals(reverse(array));
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */
    public static boolean isPangramic(String[] array) {
        //TODO i want my regex to remove spaces with or without a preceding comma. i feel like ',? ' should work but nope
        String pile = Arrays.toString(array).replace(", ", "").trim().toLowerCase();
        for (char letter = 'a'; letter <= 'z'; letter++) { // 97 - 122
            if (pile.indexOf(letter) < 0) // as soon as a letter isn't found we're done
                return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int total = 0;
        for (int i=0;i<array.length;i++) {
            if (array[i].equals(value))
                total++;
        }
        return total;
    }

    /**
     * @param array array of String objects
     * @param value value stored at the desired index
     * @return the first index of specified 'value' if it exists in 'array'
     */
    public static int getIndexOfValue(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value))
                return i;
        }
        return -1;
    }

    /**
     * handoff to removeValue(String[] array, int index)
     * @param array array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding first occurrence of 'value'
     */
    public static String[] removeValue(String[] array, String valueToRemove) {
        return removeValue(array, getIndexOfValue(array, valueToRemove));
    }

    /**
     * @param array array of String objects
     * @param index index of the value to remove
     * @return array with identical contents excluding first occurrence of `value`
     */ // TODO
      public static String[] removeValue(String[] array, int index) {
          String[] result = new String[array.length - 1];
          System.arraycopy(array, 0, result, 0, index); // copy the objects before the removed item

          if (index < array.length - 1) // if last/only item, don't need a second copy
              System.arraycopy(array, index + 1, result, index, array.length - index - 1); // copy the objects after the removed index

          return result;
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
