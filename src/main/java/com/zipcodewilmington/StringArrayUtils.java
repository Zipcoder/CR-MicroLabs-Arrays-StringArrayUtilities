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

        return array[array.length -1];
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
        return true;









    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String [] reversedArr = new String[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--)
        {
                reversedArr[j] = array[i];
                j++;
        } return reversedArr;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String [] reversedArr = new String[array.length];
        int j = 0;

        for (int i = array.length - 1; i >= 0; i--)
        {
            reversedArr[j] = array[i];
            j++;
        }

        for (int k = 0; k < array.length; k++)
        {
            if (!(array[k].equals(reversedArr[k])))
            {
                return false;

            }

        } return true;






    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        // Check each character in the Test cases and see if every alphabetical character is used.

        /*
            1. Make the array of strings into one string by concatenating strings:
            2. Make the string into all lower case
            3. Split the start into char
            4. Check to each character

        */

        //Concating strings
        String concatString = "";
        for(int i=0; i<array.length; i++) {
            String currentElement = array[i];

            concatString += currentElement.toLowerCase();

        }



        System.out.println(concatString);


        // iterate through the alphabet
        for (char letter = 'a'; letter <= 'z'; letter++)
        {
            // storing the comparison of currentCharacter & alphaCharacter in isAlphaCharacter
            if (concatString.indexOf(letter) == -1) {

                return false;
            }


        } return true;

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

        } return counter;

    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int counter = 0;
        int goodWords = 0;

        for (int i = 0; i <  array.length; i++)
        {
            if (array[i].equals(valueToRemove)) {

                counter ++;
            }
        }

            String [] newArray = new String[array.length - counter];

        for (int j = 0; j < array.length; j++){

            if (!array[j].equals(valueToRemove)){

                newArray[goodWords] = array[j];
                goodWords++;
            }

        } return newArray;


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
