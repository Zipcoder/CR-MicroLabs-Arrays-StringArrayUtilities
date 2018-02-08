package com.zipcodewilmington;

import java.lang.reflect.Array;
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
        for (int count = 0; count < array.length; count++) {
            if (array[count] == value) {
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
        String reverse[] = new String[array.length];
        int word = 0;
        for (int count = array.length - 1; count >= 0; count--) {
            reverse[word] = array[count];
            word++;
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String reverse[] = reverse(array);
        if (Arrays.equals(array, reverse)) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String arrayString = Arrays.toString(array);
        String arrayString2 = arrayString.toLowerCase();
        boolean found = false;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            for (int count = 0; count < arrayString2.length(); count++) {
                if (arrayString2.charAt(count) == letter) {
                    found = true;
                    break;
                } else if (arrayString2.charAt(count) == ' ') {
                    continue;
                }
            }
            if (found) {
                found = false;
                continue;
            }
            return false;
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int noo = 0;
        for (int count = 0; count < array.length; count++) {
            if (array[count].equalsIgnoreCase(value)) {
                noo++;
            }

        }
        return noo;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] newArray = new String[array.length - getNumberOfOccurrences(array, valueToRemove)];
        int num = 0;
        for (int count = 0; count < array.length; count++) {
            if (array[count].equalsIgnoreCase(valueToRemove)) {
                continue;
            }
            newArray[num] = array[count];
            num++;
        }
        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        int old = 0;
        int dupeCount = 0;
        int count;
        for (count = 1; count < array.length; count++) {
            if (array[old].equalsIgnoreCase(array[count])) {
                dupeCount++;
            }
            old++;
        }
        old = 0;
        int count3 = 1;
        String secondArray[] = new String[array.length - dupeCount];
        secondArray[0] = array[0];
        for (count = 1; count < array.length; count++) {
            if (array[old].equalsIgnoreCase(array[count])) {
                old++;
                continue;
            }
            secondArray[count3] = array[count];
            old++;
            count3++;

        }
        return secondArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int old = 0;
        int dupeCount = 0;
        int count;
        for (count = 1; count < array.length; count++) {
            if (array[old].equalsIgnoreCase(array[count])) {
                dupeCount++;
            }
            old++;
        }

        old = 0;
        int count3 = 0;
        String secondArray[] = new String[array.length - dupeCount];
        for (count = 0; count < array.length; count++) {
            StringBuilder combined = new StringBuilder();
            combined.append(array[count]);
            if (count < array.length -1) {

                for (int count2 = count + 1; count < array.length; count2++) {
                    if (count2 < array.length) {
                        if (array[count].equals(array[count2])) {
                            combined.append(array[count2]);
                        } else if (!array[count].equals(array[count2])) {
                            count = count2 - 1;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (count3 < secondArray.length) {

                secondArray[count3] = combined.toString();
            }
            old++;
            count3++;

        }

        return secondArray;
        // This code is so awful and there has to be a better way to do this.

    }


}
