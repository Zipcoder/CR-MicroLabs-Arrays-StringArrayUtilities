package com.zipcodewilmington;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.*;
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

        String first = "";
        return first = array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */

    public static String getSecondElement(String[] array) {
//        String second = "";
                return array[1];
    }




    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String last = "";
        return last = array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondLast = "";
        return secondLast = array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
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
        List<String> wordList = Arrays.asList(array);
        Collections.reverse(wordList);
        String[] y = wordList.toArray(new String[0]);

        return y;
    }


    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if(array.length == 0 || array.length == 1) {
        }
            return true;

    }
    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
  public static boolean isPangramic(String[] array) {
//      return false;

                    String lowerCase = " ";
                     for(int i = 0; i < array.length; i++){
                         lowerCase += array[i].toLowerCase();
                        }
        for(char letter = 'a'; letter <= 'z'; letter++){
                         if(lowerCase.indexOf(letter)<0){
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
        int valueCounter = 0;
        for (String element : array) {
            if (element == value) {
                valueCounter++;
            }
        }
            return valueCounter;

    }
    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
       int total = 0;
       int remove = 0;

       for(int i = 0; i < array.length; i++){
           if(array[i].equals(valueToRemove)){
               total ++;
           }
       }
       String[] newArray = new String[array.length-total];
       for (int j = 1; j < array.length; j++){
           if(!array[j].equals(valueToRemove)){
               newArray[remove] = array[j];
               remove++;
           }
       }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String first = array[0] + " ";
        for(int i = 1; i < array.length; i++){
            if(!array[i].equals(array[i-1])){
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
        for(int i = 1; i < array.length; i++){
            if(array[i].equals(array[i-1])){
                first += array[i];

            }else{
                first += " " + array[i];
            }
        }
        String[] convert = first.split(" ");
        return convert;
    }
}
