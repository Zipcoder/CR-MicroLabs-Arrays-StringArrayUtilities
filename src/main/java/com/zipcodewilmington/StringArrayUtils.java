package com.zipcodewilmington;

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

        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {


        for (int x = 0; x < array.length; x++) {
            String next = array[x];
            if (next == value) {
                return true;
            }
        }

        return false;
    }
        /*for (String thing : array) {
            if (thing == value) {
                word = true;
            }
        }
    }



    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] newString = new String[array.length];

        for (int x = 0; x < array.length; x++){
            newString[array.length -1 -x] = array[x];

        }

        return newString;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        return Arrays.equals(reverse(array), array);
        /*String[] newString = new String[array.length];

        for (int x = 0; x < array.length; x++) {
            newString[array.length - 1 - x] = array[x];

        }
        if (Arrays.toString(newString).equals(Arrays.toString(array))) {
            return true;
        } else {
            return false;
        }*/

    }
        //System.out.println(Arrays.toString(newString));




    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        String lower = "";

        for(int x = 0; x < array.length; x++) {
            lower += array[x].toLowerCase();
        }

        for(char letter = 'a'; letter <= 'z'; letter++) {
            if(lower.indexOf(letter) < 0) {
                return false;
            }
        } return true;

    }

        /*String alpha = Arrays.toString(array);

        for (char i = 'a'; i <= 'z'; i++) {
            for (int x = 0; x <= alpha.length(); x++) {
                char place = alpha.charAt(x);
                if (i == place) {
                    return true;
                }
                }
            }

            return false;
                //if (i.equals(alpha.toLowerCase()) {
            }*/


    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int total = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x].equals(value)) {
                total++;
            }
        }

        return total;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        int total = 0;
        int remove = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x].equalsIgnoreCase(valueToRemove)) {
                total++;
            }
        }
        String[] newString = new String[array.length - total];

        for (int y = 0; y < array.length; y++) {
            if (!valueToRemove.equalsIgnoreCase(array[y])) {
                newString[remove] = array[y];
                remove++;
            }


        }
        System.out.println(Arrays.toString(newString));
        return newString;
    }



        /**
         * @param array array of chars
         * @return array of Strings with consecutive duplicates removes
         */ // TODO
        public static String[] removeConsecutiveDuplicates (String[]array){
            String begin = array[0] + ",";

            for (int x = 1; x < array.length; x++) {
                if (!array[x].equals(array[x-1])) {
                    begin += array[x] + ",";
                }
            }

            String[] answer = begin.split(",");

            return answer;
        }

        /**
         * @param array array of chars
         * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
         */ // TODO
        public static String[] packConsecutiveDuplicates (String[]array){

            String pack = array[0];

            for (int x = 1; x < array.length; x++) {
                if (array[x].equals(array[x-1])) {
                    pack += array[x];
                } else {
                    pack += "," + array[x];
                }
            }
            String[] answer = pack.split(",");
            System.out.println(answer);
            return answer;
        }


    }