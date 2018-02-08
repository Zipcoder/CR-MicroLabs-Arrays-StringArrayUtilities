package com.zipcodewilmington;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        List listFromArray = Arrays.asList(array);
        return listFromArray.contains(value);
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        for(int i = 0; i < array.length / 2; i++)
        {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int length = array.length;
        for (int index = 0; index < array.length; index++) {
            // get the element from the front of the array, beginning from index 0
            String start = array[index];
            System.out.println("start string is " + start);
            // get corresponding element from the end of the array. --length decrements it first,
            // so in a array of length 4, we start in index 3
            String end = array[--length];
            System.out.println("end string is "  + end);
            // check if elements till the middle have been compared
            if (length < index) {
                System.out.println("line 84");
                return true;
            }
            // if start element is not the same as end element, the array is not
            // palindrome
            if (!(start.equals(end))) {
                System.out.println("line 90");
                return false;
            }
        }
        // if the control reaches here, means all the elements were same
        //if you only include one of these true clauses, the function will only work on even or odd arrays.
        //this way we can do both
        System.out.println("line 95");
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //put every character into a stringbuilder so we can run indexOf
        StringBuilder stringFromOriginalArray = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            stringFromOriginalArray.append(array[i]);
        }
        System.out.println(stringFromOriginalArray);
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (stringFromOriginalArray.toString().toLowerCase().indexOf(ch) < 0) {
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
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)){
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
        StringBuilder stringFromArray = new StringBuilder();
        for (int i = 0; i < array.length; i++){
            if (!(array[i].equals(valueToRemove))){
                stringFromArray.append(array[i] + ";");
            }
        }
        String[] finalArray = stringFromArray.toString().split(";");
        return finalArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        StringBuilder arrayWithoutDupes = new StringBuilder();
        arrayWithoutDupes.append(array[1] + " ");
        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i-1])){
                arrayWithoutDupes.append(array[i] + " ");
            }
        }
        System.out.println(arrayWithoutDupes);
        return arrayWithoutDupes.toString().split(" ");
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
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
        System.out.println(packedString);
        return packedString.toString().split(" ");
    }


}
