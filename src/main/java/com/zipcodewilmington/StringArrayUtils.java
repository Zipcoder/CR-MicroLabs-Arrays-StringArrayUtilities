package com.zipcodewilmington;


import java.util.ArrayList;
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
        for (String wordToFind : array) {
            if (wordToFind.equals(value)) {
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
        String[] reverseArray = new String[array.length];
        System.arraycopy(array, 0, reverseArray, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reverseArray = new String[array.length];
        System.arraycopy(array, 0, reverseArray, 0, array.length);
        reverseArray.equals(reverseArray);
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = array[array.length - 1 - i];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != reverseArray[i]) {
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

        String alphabet = String.join("", array);
        alphabet = alphabet.toLowerCase();
        //String alphabet = Arrays.toString(array);

//        String alphabet = "";
//        for (int i = 0; i < array.length; i++){
//         alphabet += array[i].toLowerCase();
//    }
        for (char letter = 'a'; letter <= 'z'; letter++) {
            if (alphabet.indexOf(letter) < 0) {
                return false;
            }
        }
        return true;

//        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        String numOccurences = String.join("", array);
        int occurence = 0;

        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                occurence++;
            }
        }
        //int index = 0;

//        while (index != -1){
//
//            index = numOccurences.indexOf(value, index);
//
//            if (index != -1){
//                occurence++;
//                index += value.length();
//            }
//        }
        return occurence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            if (valueToRemove != (array[i])) {
                list.add(array[i]);
            }
        }
        String[] stringArray = list.toArray(new String[list.size()]);
        return stringArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
          StringBuilder sb = new StringBuilder();

          sb.append(array[0] + ",");
          for (int i = 1; i < array.length; i++){
              if (!(array[i].equals(array[i-1]))){
                  sb.append(array[i] + ",");
              }

          }
        String out = sb.toString();
        String[] destIndexArray = out.split(",");

        System.out.println(out);
        return destIndexArray;
    }


    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        StringBuilder sb = new StringBuilder();

        sb.append(array[0]);

        for (int i = 1; i < array.length;i++){
            if (array[i].equals(array[i-1])){
                sb.append(array[i]);
            } else {
                sb.append("," + array[i]);
            }
        }
        return sb.toString().split(",");
    }

}