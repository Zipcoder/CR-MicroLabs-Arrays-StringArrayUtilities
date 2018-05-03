package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {




    public static String getFirstElement(String[] array) {
        return array[0];
    }

    public static String getSecondElement(String[] array) {
        return array[1];
    }

    public static String getLastElement(String[] array) {
        return array[array.length-1];
    }

    public static String getSecondToLastElement(String[] array) {
        return array[array.length-2];
    }

    public static boolean contains(String[] array, String value) {
        boolean includes = false;
        for(String isIn: array) {
            if(value.equals(isIn)) includes = true;
        }
        return includes;
    }

    public static String[] reverse(String[] array) {
        String[] reverseOrder = new String[array.length];
        for(int i = 0; i < array.length; i++) {
            reverseOrder[i] = array[array.length-1-i];
        }
        return reverseOrder;
    }


    public static boolean isPalindromic(String[] array) {
        boolean backAndForward = false;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(array[array.length-1-i])){
                backAndForward = true;
            }
        }
        return backAndForward;
    }


    public static boolean isPangramic(String[] array) {
        StringBuilder alpha = new StringBuilder();
        boolean it = true;
        for(String item: array) {
            alpha.append(item);
        }
        for(char ch = 'a'; ch <= 'z'; ch++) {
            if(alpha.toString().toLowerCase().indexOf(ch)<0) {
                it = false;
            }
        }
        return it;
    }


    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for(String item: array) {
            if(value.equals(item)) counter++;
        }
        return counter;
    }


    public static String[] removeValue(String[] array, String valueToRemove) {
       StringBuilder rem = new StringBuilder();

       for(String item: array) {
           if(!item.equals(valueToRemove)) {
            rem.append(item).append("/");
           }
       }
       return rem.toString().split("/");
    }



    public static String[] removeConsecutiveDuplicates(String[] array) {
        StringBuilder removed = new StringBuilder();

        for(int i = 1; i<array.length; i++) {
            if (!array[i].equalsIgnoreCase(array[i - 1])) {
                removed.append(array[i-1]).append("/");
            }
        }

        if(!array[array.length-1].equalsIgnoreCase(array[array.length-2])) {
            removed.append(array[array.length-1]);
        } else {
            removed.append(array[array.length-2]);
        }
        return removed.toString().split("/");
    }


    public static String[] packConsecutiveDuplicates(String[] array) {
       StringBuilder pack = new StringBuilder();

       for(int i = 1; i<array.length; i++) {
           if(array[i].equals(array[i-1])) {
               pack.append(array[i-1]);
           } else {
               pack.append(array[i-1] + "/");
           }
       }

       if(array[array.length-1].equals(array[array.length-2])) {
            pack.append(array[array.length-1]);
       } else {
            pack.append(array[array.length-1] + "/");
        }
        return pack.toString().split("/");
    }

}
