package com.zipcodewilmington;

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
        return array[array.length-1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean includes = false;

        for(String isIn: array) {
            if(value.equals(isIn)) {
                includes = true;
                break;
            }
        }

        return includes;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverseOrder = new String[array.length];

        for(int i = 0; i < array.length; i++) {
            reverseOrder[i] = array[array.length-1-i];
        }

        return reverseOrder;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        boolean backAndForward = false;
        String[] backwards = new String[array.length];

        for(int i = 0; i < array.length; i++) {
            backwards[i] = array[array.length-1-i];
        }

        for(int i = 0; i < array.length; i++) {
            if(backwards[i].equals(array[i])) {
                backAndForward = true;
                break;
            }
        }
        return backAndForward;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        StringBuilder alpha = new StringBuilder();

        for(int i = 0; i < array.length; i++) {
            alpha.append(array[i]);
        }

        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(alpha.toString().toLowerCase().indexOf(ch)<0) {
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

        int counter = 0;
        for(int i = 0; i < array.length; i++) {
            if(value.equals(array[i])) {
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
    public static String[] removeValue(String[] array, String valueToRemove) {
       String rem = "";

       for(int i = 0; i<array.length; i++) {
           if(!array[i].equals(valueToRemove)) {
            rem += array[i] + "/";
            ;
           }
       }

       return rem.split("/");
    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String removed = "";

        for(int i = 1; i<array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                removed += array[i - 1] + "/";
            }
        }

        if(!array[array.length-1].equals(array[array.length-2])) {
            removed += array[array.length-1];
        } else {
            removed += array[array.length-2];
        }

        return removed.split("/");
    }



    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
       String pack = "";

       for(int i = 1; i<array.length; i++) {
           if(array[i].equals(array[i-1])) {
               pack += array[i-1];
           }
           if(!array[i].equals(array[i-1])) {
               pack += array[i-1] + "/";
           }
       }

        if(array[array.length-1].equals(array[array.length-2])) {
            pack += array[array.length-1];
        }
        if(!array[array.length-1].equals(array[array.length-2])) {
            pack += array[array.length-1] + "/";
        }

        return pack.split("/");
    }


}
