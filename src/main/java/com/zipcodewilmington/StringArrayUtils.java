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
        boolean hasValue = false;
        for (String word: array) {
            if (word.equals(value)) {
                hasValue = true;
            }
        }
        return hasValue;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[array.length - i - 1] = array[i];
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean is_palindrome = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length -1-i]) {
                is_palindrome = false;
            }
        }
        return is_palindrome;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        char[] alphabet  = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        boolean is_pangramic = true;
        for (char letter: alphabet) {
            boolean letterInWord = false;
            for (String word: array) {
                if (word.contains(String.valueOf(letter))) {
                    letterInWord = true;
                    break;
                }
            }
            if (letterInWord) {
                is_pangramic = true;
            } else {
                is_pangramic = false;
            }

        }
        return is_pangramic;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String word: array) {
            if (word.equals(value)) {
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
    public static String[] removeValue(String[] array, final String valueToRemove) {
        ArrayList<String> array_without_value = new ArrayList(Arrays.asList(array));
        array_without_value.remove(valueToRemove);
        array = new String[array_without_value.size()];
        return array_without_value.toArray(array);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> newArray = new ArrayList();
        newArray.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i-1]) {
                newArray.add(array[i]);
            }
        }
        return newArray.toArray(new String[newArray.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
