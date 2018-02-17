package com.zipcodewilmington;

import java.util.Arrays;

public class MainApplication {
    public static void main (String[] args) {

        boolean answer = true;
        String[] array = {"a", "b", "c", "b", "a"};

        System.out.println(Arrays.toString(array));

        //String[] array = {"Is this a palindrome?", "This is a palindrome", "Is this a palindrome?"};

        //String[] array = {"Is this a plaindrome?", "This is not a plaindrome", "Is this a palindrome?", "This is not a palindrome"};

        int headIndex = 0;
        int tailIndex = array.length - 1;

        while (headIndex < tailIndex) {
            if (!array[headIndex].equals(array[tailIndex])) {
                answer = false;
                break;
            }
            headIndex++;
            tailIndex--;
        }

        System.out.println(answer);





/* My first attempt, too long
        String[] strArray = str.split("");
        System.out.println("Even array: " + Arrays.toString(strArray));

        int arrayLength = strArray.length;

        //Starting indexes for array's head and tail
        int headIndex = 0;
        int tailIndex = strArray.length - 1;
        int midLeftIndex = arrayLength/2 - 1;
        int midRightIndex = arrayLength/2;

        if (arrayLength == 1) {
            answer = true;
        }

        //  array length = EVEN
        if (arrayLength % 2 == 0) {
            while (headIndex < midRightIndex) {
                if (!strArray[headIndex].equals(strArray[tailIndex])) {
                    break;
                }
                if (headIndex == midLeftIndex) {
                    if (strArray[midLeftIndex].equals(strArray[midRightIndex])) {
                        answer = true;
                    }
                    break;
                }
                headIndex++;
                tailIndex--;
            } // end of while
        } else {
            while (headIndex < (arrayLength / 2)) {
                if (!strArray[headIndex].equals(strArray[tailIndex])) {
                    break;
                }
                if (headIndex == ((arrayLength-1)/2) - 1 ) {
                    if (strArray[((arrayLength-1)/2) - 1].equals(strArray[((arrayLength-1)/2) + 1])) {
                        answer = true;
                    }
                    break;
                }
                headIndex++;
                tailIndex--;
            } // end of while
        }
        System.out.println(answer);
        System.out.println("arrayLength = " + arrayLength);
*/

    }
}

