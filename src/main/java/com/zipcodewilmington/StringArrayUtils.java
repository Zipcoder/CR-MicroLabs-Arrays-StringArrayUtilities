package com.zipcodewilmington;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.Arrays;
import java.util.regex.Pattern;

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

        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
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
           StringBuilder sb =  new StringBuilder();
              for(String s: array){
                  sb.append(s + " ");
              }
          //      String []  reversedArray =  sb.reverse().toString().trim().split(" ");
                   for (int i = 0; i < array.length / 2; i++) {

            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }


        return  array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] temp = array;
        reverse(array);
        for (int i = 0; i < array.length; i++) {
            // check to see if reverse index is equal to normal array.
            if (temp[i].equals(array[i]) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        StringBuilder giantString = new StringBuilder();

        // convert array to giant string
        for (String a : array) {
            giantString.append(a);
        }
        String s = giantString.toString();
        //char[] alphbet = s.toCharArray();
        s = s.toLowerCase();

        //alphbet.matches("*[a-zA-Z]*");
        for (char i = 'a'; i < 'z'; i++) {

            if (s.indexOf(i) == -1) {
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
        for (int i = 0; i < array.length -1; i++) {

            if (contains(array, value)) {
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
        String s = valueToRemove.toLowerCase();
        String value;
        int j = 0;
        String[] smallerArray = new String[0];
        for (int i = 0; i < array.length; i++) {
            if (!s.equals(array[i])) {

                // increase the size the array dynamically
                //System.arraycopy(smallerArray, 0, smallerArray, 0, 1);
                smallerArray = Arrays.copyOf(smallerArray, j + 1);
                value = array[i];
                smallerArray[j] = value;
                //smallerArray [j] = array[i];
                //System.out.println(smallerArray.toString());
                j++;
            }
        }
        return smallerArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {


        int prev = 1;
        int j = 0;

        String[] resultArray = new String[0];
        for (int i = 1; i < array.length; i++) {
            if (!array[i - prev].equals(array[i] )) {

                // increase the size the array dynamically
                //System.arraycopy(smallerArray, 0, smallerArray, 0, 1);
                resultArray = Arrays.copyOf(resultArray, j + 1);

                resultArray[j] = array[i - prev];

                j++;
            }
        }
        return resultArray;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String [] temp = new String[1];
        String[] result = new String[0];
        int sum =0;
       // int prev = -1;
        for (int i = 0; i < array.length  -1; i++) {

            if (array[i].equals(array[i + 1])) {
               result = Arrays.copyOf(result,sum  +1);

               result[sum] += array[i];
            } else {
                result = Arrays.copyOf(result, sum + 1);
                    result [sum] += array[i];
                    sum++;
                }
            }

        return result;
    }

}
