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

        String[] reverseArray = reverse(array);


        if (Arrays.toString(reverseArray).equals(Arrays.toString(array))) {
            return true;
        }
        return false;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String pangramic = "";

        for (int i = 0; i < array.length; i++) {
            pangramic += array[i].toLowerCase();

        }
        for (char letter = 'a'; letter <= 'z'; letter++){
            if (pangramic.indexOf(letter) < 0) {
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
        int count =0;

        for(int i = 0; i < array.length; i++){
            if(array[i].equals(value)){
                count++;
            }
        }
            return count;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int count=0;
        int element = 0;
        for(int i=0; i<array.length; i++){
           if (array[i].equals(valueToRemove)) {
               count++;
           }
       }

        String[] removeArray = new String[array.length-count];

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                removeArray[element] = array[i];
                element++;
            }

        }

        return removeArray;
    }



    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
    //Created a String and put first item from array in there.
        String nonDuplicates = array[0]+" ";

        for (int i = 1; i < array.length; i++) {
        //If it doesn't match previous element concat to string with space to maintain separation of the elements
            if (!array[i].equals(array[i - 1])) {
                nonDuplicates += array[i] + " ";
            }
        }
        //Split the string into the array at the spaces
        String[] output = nonDuplicates.split(" ");
        return output;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        //Created a String and put first item from array in there.
        String packDuplicates = array[0];

        for (int i = 1; i < array.length; i++) {

            //If previous element matches places into string
            if (array[i].equals(array[i - 1])) {
                packDuplicates += array[i];
            }
            //If previous element does not match put a space before adding it to the string to keep them separate
            else {
                packDuplicates += " " +array[i];
            }

        }
        //Split the string into the array at the spaces
        String[] output = packDuplicates.split(" ");
        return output;
    }
}
