package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */

// commit comment
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

        // you don't need a loop for everything dude. KEEP IT SIMPLE!!!


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

        for (int i = 0; i <= array.length; i++) {

            if (array[i].equals(value)) {
                return true;
            }

        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] myString = new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {

            myString[array.length - 1 - i] = array[i];
        }


        return myString;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        return true;

    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String littleCase = "";

        for (int i = 0; i < array.length; i++) {

            littleCase = littleCase + array[i].toLowerCase();
        }

        int totalLetters = 0;

        for (char j = 'a'; j <= 'z'; j++) {

            if (littleCase.indexOf(j) >= 0)

                totalLetters++;
        }

        if (totalLetters == 26) {

            return true;
        }

        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int occurences = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(value)) {

                occurences++;
            }



        }

        return occurences;

    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int characters = 0;
        int removals = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals(valueToRemove)) {

                characters++;
            }


        }

        String[] array2 = new String[array.length - characters];

        for (int j = 0; j < array.length; j++) {

            //stumped here

            }


            return null;
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
