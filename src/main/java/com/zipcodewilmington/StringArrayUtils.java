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
        String firstWord = (array[0]);
        return firstWord;
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        String secondWord = (array[1]);
        return secondWord;
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        String lastWord = (array[array.length - 1]);
        return lastWord;
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        String secondLast = (array[array.length - 2]);
        return secondLast;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {

        for (String match : array) {       //comparing match in array
            if (match.equals(value)) {   //seeing if match = value
                return true;            //if match in array also = value, run
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {

        String[] result = new String[array.length];        //new array with length
        int count = 0;                                       // needed a counter
        for (int i = array.length - 1; i >= 0; i--) {      // start loop at end & run reverse
            result[count] = array[i];                  // want count(0) to be last index
            count += 1;
        }
        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int j = array.length - 1;       // reverse array
        for (int i = 0; i < array.length / 2; i++) {       //loop half the array
            if (!(array[i].equals(array[j]))) {         //not equal

                return false;
            }
            j--;        //take away 1 to make true
        }
        System.out.println(array);
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sb.toString().toLowerCase().indexOf(ch) < 0) {
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
        int numOccurrence = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                numOccurrence++;
            }
        }
        return numOccurrence;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int numValuesToRemove = 0;
        int element = 0;

        for (int i = 0; i < array.length; i++) {
            if ((array[i].equals(valueToRemove))) {
                numValuesToRemove++;
            }
        }

        String[] removedValues = new String[array.length - numValuesToRemove];

        for (int i = 0; i < array.length; i++) {
            if (!array[i].equals(valueToRemove)) {
                removedValues[element] = array[i];
                element++;
            }
        }
        return removedValues;

    }


    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        StringBuilder arrayWithoutDuplicates = new StringBuilder();
        arrayWithoutDuplicates.append(array[0] + " ");

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                arrayWithoutDuplicates.append(array[i] + " ");
            }
        }
        System.out.println(arrayWithoutDuplicates);
        return arrayWithoutDuplicates.toString().split(" ");
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        StringBuilder packCD = new StringBuilder();
        packCD.append(array[0]);

        for (int i = 1; i < array.length; i++) {

            if (!array[i].equals(array[i - 1])) {
                packCD.append(" ");
            }
            packCD.append(array[i]);
        }
        System.out.println(packCD);
        return packCD.toString().split(" ");
    }

}
