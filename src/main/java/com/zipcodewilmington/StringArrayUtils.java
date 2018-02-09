package com.zipcodewilmington;
//import java.util.ArrayList;
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

        String grab = array[0];
        return grab;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {

        String grab = array[1];

        return grab;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        String last = array[array.length - 1];

        return last;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        String last = array[array.length - 2];


        return last;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i < array.length; i++){
            String current = array[i];
            if(value.equals(array[i])){
                return true;
            }
        }
        /*   // this works too :)
        for(String word : array){
            if(word == value){
                bool = true;
            }
        }
        */
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] newArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }
        //System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] newArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }
        //System.out.println(Arrays.toString(newArray));

        if (Arrays.toString(newArray).equals(Arrays.toString(array))) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {


            String lowerCase = "";

            for (int i = 0; i < array.length; i++) {
                lowerCase += array[i].toLowerCase();
            }

            for(char letter = 'a'; letter <= 'z'; letter++){
                if(lowerCase.indexOf(letter) < 0) {
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

        int count = 0;

        for (int i = 0; i < array.length; i++){
            if (array[i].equals(value)) {
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

            int total = 0;
            int remove = 0;

            // how many times we've seen the Value
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(valueToRemove)) {
                    total++;
                }
            }
            // Create new array that subtracts total finds from array.length
            String[] newArray = new String[array.length - total];

            // Adds new index to new array
            for (int x = 0; x < array.length; x++) {
                if (!array[x].equals(valueToRemove)) {
                    newArray[remove] = array[x];
                    remove++;
                }
            }

            System.out.println(Arrays.toString(newArray));

            return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        String first = array[0] + " ";

        for (int i = 1; i < array.length; i++) {
            if(!array[i].equals(array[i - 1])){
                first += array[i] + " ";
            }
        }

        String[] last = first.split(" ");

        return last;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String first = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].equals(array[i - 1])) {
                first += array[i];
            } else {
                first += " " + array[i];
            }
        }
        String[] convert = first.split(" ");
        return convert;
    }

}
