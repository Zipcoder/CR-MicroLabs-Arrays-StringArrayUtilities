package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
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

        for(Integer i = 0; i < array.length; i++)   {
            if(array[i] == value)   {
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
        String[] arr2 = new String[array.length];
        Integer counter = 0;

        for(Integer i = array.length - 1; i >= 0; i--)   {
            arr2[counter] = array[i];
            counter++;
            }
        return arr2;

        }




    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] arr2 = new String[array.length];
        Integer counter = 0;

        for(Integer i = array.length - 1; i >= 0; i--) {
            arr2[counter] = array[i];
            if(arr2[counter] == array[counter]) {
                return true;
            }
            counter++;
        }

        return false;
        }



    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] alphaArr = alpha.split("");
        String arr2Str2 = String.join(" ",array).toLowerCase();





        System.out.println(arr2Str2);
        boolean contains = true;


        for(int i = 0; i < alphaArr.length; i++)    {
          contains =  arr2Str2.contains(alphaArr[i]);
            System.out.println();
          if(!contains) {
              break;
          }
        }
        return contains;



    }


        /*String alpha = "abcdefghijklmnopqrstuvwxyz";    // created sting of alphabet
        String arrToStr1 = "";
        for(int i = 0; i < array.length; i++)   {
            arrToStr1 += array[i];

        } arrToStr1 = arrToStr1.toLowerCase();
        arrToStr1 = arrToStr1.replace(" ", "");

        for(int i = 0; i < alpha.length(); i++) {
            for(int j = 0; j < arrToStr1.length(); j++) {
                if(arrToStr1.charAt(j) == alpha.charAt(i))  {
                    alpha = alpha.replace(alpha.charAt(i), '4');
                    }

                }
            }   System.out.println(alpha);
        for(int i = 0; i < alpha.length(); i++) {
            if(alpha.charAt(i) != '4')  {
                return false;
            }
        }   return true;

    }*/




    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        //String Arr2Str = Arrays.toString(array);

        int count = 0;

        for(int i = 0; i < array.length; i++)   {
            if(value.contains(array[i]))    {
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
        String str = "";

        for(int i = 0; i < array.length; i++)   {
            if(valueToRemove.contains(array[i]))    {
                str = str + array[i] + "4";

            }
        }
        String arr2[] = str.split("4");






        return arr2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

String arr2Str = "";
        String str = "";

        for(int i = 0; i < array.length; i++) {
            if (str.contains(array[i])) {
                if (str.contains(array[i + 1]) || (str.contains(array[i - 1]))) {
                }
                str = str + array[i] + "4";
            }
        }   String arr2[] = str.split("4");

        return arr2;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


}
