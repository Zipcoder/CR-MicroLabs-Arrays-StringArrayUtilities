package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {

    public static String getFirstElement(String[] array) {
        return array[0];
    }

    public static String getSecondElement(String[] array) {
        return array[1];
    }

    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    public static boolean contains(String[] array, String value) {
        if (Arrays.asList(array).contains(value)) {
            return true;
        } else {
            return false;
        }
    }

    public static String[] reverse(String[] array) {
        for (int i = 0; i < array.length/2; i++) {
            String anotherArray = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = anotherArray;
        }
        return array;
    }

    public static boolean isPalindromic(String[] array) {
        if (array.equals(reverse(array))==true) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPangramic(String[] array) {
        String justAStringNoArraysAllowed = Arrays.toString(array);
        for (char a = 'A'; a <= 'Z'; a++)
            if ((justAStringNoArraysAllowed.indexOf(a) < 0) && (justAStringNoArraysAllowed.indexOf((char)(a + 32)) < 0))
                return false;
        return true;
    }

    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                count++;
            }
        }
        return count;
    }

    public static String[] removeValue(String[] array, String valueToRemove) {
        int theFinalSolution = getNumberOfOccurrences(array, valueToRemove);
        String[] output = new String[array.length - theFinalSolution];
        int count = 0;
        for (String i : array) {
            if (!i.equals(valueToRemove)) {
                output[count++] = i;
            }
        }
        return output;
    }

    public static String[] removeConsecutiveDuplicates(String[] array) {
        StringBuilder arrayToReturn = new StringBuilder();
        arrayToReturn.append(array[1] + " ");
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i-1])){
                arrayToReturn.append(array[i] + " ");
            }
        }
        return arrayToReturn.toString().split(" ");
    }

    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder packedString = new StringBuilder();
        packedString.append(array[0]);
        for (int i = 1; i < array.length; i++){
            if (array[i].equals(array[i-1])){
                packedString.append(array[i]);
            } else {
                packedString.append(" " + array[i]);
            }
        }
        return packedString.toString().split(" ");
    }
}
