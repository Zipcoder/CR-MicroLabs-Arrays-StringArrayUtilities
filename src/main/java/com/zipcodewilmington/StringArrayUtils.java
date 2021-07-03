package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.*;

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
        String lastone = array[array.length-1];
        return lastone;


    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        String secLast = array[array.length - 2];
        return secLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (int i = 0; i < array.length; i++) {
          if (array[i] == value) {
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


        List<String> list = Arrays.asList(array);
        Collections.reverse(list);
        String[] reversedList = list.toArray(array);
        return reversedList;


    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - (i + 1)]) {
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

        ArrayList<String> StringOfArrays = new ArrayList<String>(Arrays.asList(array));
        String newString = StringOfArrays.toString().toLowerCase();
        String abc = "abcdefghigklmnopqrstuvwxyz";
        for (int i = 0; i < abc.length(); i++) {

            if (newString.indexOf(abc.charAt(i)) == -1) {
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
        for (int i = 0; i < array.length; i++) {
            if (value.equals(array[i])) {
                count++;
            }
            //return 0;
        }
        return count;


        //return 0;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        List<String> newList = new ArrayList<String>(Arrays.asList(array));
        newList.remove(valueToRemove);
        array = newList.toArray((new String[0]));
        return array;

    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

     ArrayList<String> newList = new ArrayList<String>();

      newList.add(array[0]);



  for (int i = 1; i < array.length; i ++ ){
   if(array[i] != array[ i- 1]){

       newList.add(array[i]);
     }
   }

        return newList.toArray(new String[newList.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        //ArrayList<String> newList = new ArrayList<String>();
        int length = array.length;
        int lastIndex = 0;
        ArrayList<String> newList = new ArrayList<String>();
        newList.add(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (newList.get(lastIndex).contains(array[i])) { // used .contains cuz aa != a
                newList.set(lastIndex, (newList.get(lastIndex) + array[i]));
            } else {
                lastIndex++;
                newList.add(array[i]);
            }

          //  return newList.toArray(new String[0]);
        }
        return newList.toArray(new String[0]);

    }

    }

//return newList.toArray(new String[0]);




//ArrayList<String>  list = new ArrayList<>();
// add package and drop class there
       /* newList.add(array[0]);
          for (int i = 1; i < array.length; i ++){
              if (array [1] == array[i-1]) {
                  newList.add(array[i]);
              }
          }

        return newList.toArray(new String [newList.size()]);*/



