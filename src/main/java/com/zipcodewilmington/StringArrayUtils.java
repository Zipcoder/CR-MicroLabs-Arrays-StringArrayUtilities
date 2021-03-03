package com.zipcodewilmington;

import com.sun.org.apache.xerces.internal.xs.StringList;
import jdk.nashorn.internal.ir.BlockLexicalContext;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // WORKING
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */ //WORKING
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */
    //WORKING
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */
    //WORKING
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // WORKING
    public static boolean contains(String[] array, String value) {
        boolean presentOrNot = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            } else {
                presentOrNot = false;
            }
        }
        return presentOrNot;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // WORKING
    public static String[] reverse(String[] array) {
        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        String[] revArr = list.toArray(array);
        return  revArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // WORKING
    public static boolean isPalindromic(String[] array) {
        Boolean revOrNot = false;
        for (int i = 0; i < array.length / 2; i++) {
            if (!array[i].equalsIgnoreCase((array[array.length - i - 1]))) {
                revOrNot = false;
            } else {
                revOrNot = true;
            }
        }
        return revOrNot;
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
     */ // WORKING
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfTimes = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equalsIgnoreCase(value)) {
                numOfTimes++;
            }
        }
        return numOfTimes;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // WORKING
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> output = new ArrayList<String>();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(valueToRemove)) {
                continue;
            } else {
                output.add(array[i]);
                counter++;
            }
        }
        String[] outArr = output.toArray(new String[counter]);
        return outArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // WORKING
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (!array[i - 1].equals(array[i])) {
                strList.add(array[i]);
            }
        }
        String[] outStrArr = strList.toArray(new String[0]);
        return  outStrArr;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
