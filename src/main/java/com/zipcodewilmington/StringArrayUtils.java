package com.zipcodewilmington;

import java.util.*;

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
        int lastIndex = array.length;
        return array[lastIndex-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        int s2L = array.length - 2;
        return array[s2L];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        ArrayList newArray = new ArrayList(Arrays.asList(array));
        if (newArray.contains(value)){
            return true;
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> newArray = new ArrayList(Arrays.asList(array));
        Collections.reverse(newArray);
        return newArray.toArray(new String[0]);
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] palindrome = reverse(array);
        if (Arrays.equals(array, palindrome)){
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String stringArray = Arrays.toString(array).toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder compareTo = new StringBuilder();
        for (int i = 0; i < alphabet.length(); i++) {
            for (int j = 0; j < stringArray.length(); j++) {
                if (alphabet.charAt(i) == stringArray.charAt(j)){
                    compareTo.append(alphabet.charAt(i));
                }

            }
        }
        System.out.println(compareTo);


        return false;
    }


//


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfOccurences = 0;
        for (String s : array) {
            if (s == value) {
                numOfOccurences++;
            }
        }
        return numOfOccurences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> newArray = new ArrayList(Arrays.asList(array));
        newArray.remove(valueToRemove);
        String[] editedArray = newArray.toArray(new String[0]);

        return editedArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> editList = new ArrayList<>();
        String newElement = "";
        for (String element: array){
            if (element != newElement){
                editList.add(element);
            }
            newElement = element;
        }
        return editList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
