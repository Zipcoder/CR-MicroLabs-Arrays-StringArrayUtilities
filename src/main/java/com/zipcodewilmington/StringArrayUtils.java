package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        /*
        Description
        Given an array of String objects, return the first element of the array.
         */

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

        boolean answer = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                answer = true;
                break;
            }
        }

        return answer;
    }



    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] reversedArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversedArray[(array.length - 1) - i] = array[i];
        }

        return reversedArray;
    }



    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        boolean answer = true;

        int headIndex = 0;
        int tailIndex = array.length - 1;

        while (headIndex < tailIndex) {
            if (!array[headIndex].equals(array[tailIndex])) {
                answer = false;
                break;
            }
            headIndex++;
            tailIndex--;
        }

        return answer;
    }



    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String finalStr = String.join(" ", array).toLowerCase();

        boolean answer = true;

        for (char i = 'a'; i <= 'z'; i++) {
            if (finalStr.indexOf(i) < 0) {
                answer = false;
                break;
            }
        }

        return answer;
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
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

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                sb.append(array[i] + " ");
            }
        }

        String[] shorterByOne = sb.toString().split(" ");

        return shorterByOne;
    }



    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        StringBuilder sb = new StringBuilder();

        //used "array.length-1" to make it work
        //(if the second-to-last element is not the same as the last element,
        //then the last element is not a duplicate either
        for (int i = 0; i < array.length-1; i++) {
            if (!array[i].equals(array[i+1])) {
                sb.append(array[i] + " ");
            }
        }

        //add the last element after every loop, because it's not checked in the loop
        sb.append(array[array.length-1]);

        String[] duplicatesRemoved = sb.toString().split(" ");

        return duplicatesRemoved;
    }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        StringBuilder consecDups = new StringBuilder();
        //add the first element before every loop, because it's not checked in the loop
        consecDups.append(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i-1])) {
                consecDups.append(array[i]);
            } else {
                consecDups.append(" " + array[i]);
            }
        }

        String[] consecDupsArray = consecDups.toString().split(" ");

        return consecDupsArray;
    }


}

