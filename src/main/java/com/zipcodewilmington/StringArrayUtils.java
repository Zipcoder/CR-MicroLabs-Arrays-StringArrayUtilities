package com.zipcodewilmington;

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
        //used String value = array.name[i] to locate it and to return it I just put the value I created in return.
        String find = array[0];
        return find;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        String locate = array[1];
        return locate;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        String find1 = array[array.length-1];
        return find1;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {


        String find2 = array[array.length-2];
        return find2;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        /*the enhanced for loop starts at String myValue and searches to the end of array(so at every index comparing
        . Then we add an if statement to see if the beginning of myValue equals value (which is what we are looking
        for). */
        for (String myValue : array) {
            if(myValue.equals(value)){
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

        String[] backwards = new String[array.length];
        int indexPositions = 0;

        for (int i = array.length-1; i >=0; i--){
            //print to a new array to hold the array values
            backwards[indexPositions] = array[i];
            indexPositions += 1;

        }
        return backwards;


    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        //the reverse method because we already made a program for reverse
        /*we don't have to change the placeholder "String [] arrays" in the method reverse we only need to change the
        name when we call the method*/
        return Arrays.equals(array, reverse(array));
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
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        //created a countOccurence holder, to hold value everytime it appears

        int countOccurence = 0;

        for (String myValue : array) {
            if(myValue.equals(value))
                countOccurence++;
        }

        return countOccurence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        //we create this 'newSize' to hold the size of the array
       int newSize = array.length - getNumberOfOccurrences(array, valueToRemove);
       //now we have to create the array, with the new array size.
        String [] outputArray = new String[newSize];

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
