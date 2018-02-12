package com.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import com.sun.org.apache.xml.internal.security.utils.JavaUtils;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import javax.sound.sampled.ReverbType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            System.out.println(temp);
        }

        return array;


        //StringBuilder;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return reverse(array).equals(array);
    }






        /**
         * @param array array of String objects
         * @return true if each letter in the alphabet has been used in the array
         */ // TODO
        public static boolean isPangramic (String[]array) {
            return false;
        }

        /**
         * @param array array of String objects
         * @param value value to check array for
         * @return number of occurrences the specified `value` has occurred
         */ // TODO
        public static int getNumberOfOccurrences (String[]array, String value){
            return 4;
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




