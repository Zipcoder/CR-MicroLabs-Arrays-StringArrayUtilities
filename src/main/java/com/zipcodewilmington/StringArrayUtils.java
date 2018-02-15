package com.zipcodewilmington;

import java.util.Arrays;

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

        String[] reversed = reverse(array);
        boolean isPalindrome = false;
        if (Arrays.equals(reversed, array)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }


    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String littleCase = "";

        for (int i = 0; i < array.length; i++) {
            // array[i] sets all indexes in array to lowercase (in this example)
            littleCase = littleCase + array[i].toLowerCase();
        }

        int totalLetters = 0;
        // were loooping through the alphabet here
        for (char j = 'a'; j <= 'z'; j++) {
            // making sure we see the letter
            if (littleCase.indexOf(j) >= 0)
                // when we see the letter, increment up one.
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

        // i have an array and i want to remove a value from it

        String[] newArray = new String[0];

        // looping through the length of the given array
        for (int i = 0; i < array.length; i++) {

            // if the looped array does not equal value to remove
            if (array[i] != valueToRemove) {
                // make a copy of newArray, with length + 1
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                // we're accessing the new array minus length 1
                // and setting it to the original array with the values we're looping through
                newArray[newArray.length - 1] = array[i];

            }


        }


        return newArray;


    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        // we want to remove one duplicate when it's next to it's "brother"
        String[] answer = new String[1];

        // first value keeps getting choppped, so we're putting it there to start.
        answer[0] = array[0];

        // we're looping thru the length of the array
        for (int i = 1; i < array.length; i++) {

            // if the array we're looping through is equal to itself - 1
            if (!array[i].equals(array[i - 1])) {
                // making copy of array + 1

                answer = Arrays.copyOf(answer, answer.length + 1);
                // setting new space to value of original
                answer[answer.length - 1] = array[i];
            }

        }


        return answer;


    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        // check for duplicates first

        StringBuilder myString = new StringBuilder();
        myString.append(array[0]);


        for (int i = 1; i < array.length; i++) {

            // taking the array we're loooping thru and checking if the value before it is equal
            if (array[i].equals(array[i - 1])) {

                myString.append(array[i]);
            } else {
                myString.append(",");
                myString.append(array[i]);
            }

        }
        String newString = myString.toString();
        return newString.split(",");

    }


}
