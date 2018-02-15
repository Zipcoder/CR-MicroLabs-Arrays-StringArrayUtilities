package com.zipcodewilmington;

import java.util.*;
import java.lang.reflect.Array;
import javax.management.openmbean.ArrayType;
import com.sun.xml.internal.xsom.impl.scd.Iterators;
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
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseArray = new String[array.length];

        int reverseArrayIndexPosition = 0;
        for (int i = array.length -1; i >= 0; i--){
            reverseArray[reverseArrayIndexPosition] = array[i];
            reverseArrayIndexPosition++;
        }

        return reverseArray;
    }









    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        // creating a temp array to reverse array using the .reverse method above.
        String[] temp = reverse(array);
        // Taking my array's and turning them into strings and then comparing them.
        if (Arrays.toString(temp).equals(Arrays.toString(array))){
            return true;
        }else {
            return false;
        }


    }






        /**
         * @param array array of String objects
         * @return true if each letter in the alphabet has been used in the array
         */ // TODO
        public static boolean isPangramic (String[] array) {
            StringBuilder newString = new StringBuilder();
            for (int i =0; i <array.length; i++){
                newString.append(array[i]);

            }
            String temp = newString.toString().toLowerCase();
            for (char letter ='a'; letter <='z'; letter++){
                if (temp.indexOf(letter) < 0){
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
        public static int getNumberOfOccurrences (String[]array, String value){
            int counter = 0;
            for (int i =0; i < array.length;i++){
                if(array[i].equals(value)){
                    counter++;
                }

            }
            return counter;
        }

        /**
         * @param array         array of String objects
         * @param valueToRemove value to remove from array
         * @return array with identical contents excluding values of `value`
         */ // TODO
        public static String[] removeValue (String[]array, String valueToRemove){
            String returnstring = "";
            for (String currentIndex: array){
                if (!currentIndex.equals(valueToRemove)){
                    returnstring += currentIndex + " ";
                }
            }
            return returnstring.split(" ");
        }


        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){
            String removeDuplicates = array[0] + "~";
            for (int i = 1; i < array.length; i++){
                if (!array[i].equals(array[i-1])){
                    removeDuplicates += array[i] + "~";
                }
            }

            String[] answerArray =removeDuplicates.split("~");

            return answerArray;
        }

        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        public static String[] packConsecutiveDuplicates (String[]array){
            String newString = array[0];

            for(int i = 1; i <array.length; i++){
                if (array[i].equals(array[i-1])){
                    newString += array[i];
                } else {
                    newString += "~" + array[i];
                }
            }
            String[] answer = newString.split("~");
            return answer;
        }

    }




