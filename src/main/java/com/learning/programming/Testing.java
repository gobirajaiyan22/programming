package com.learning.programming;

import java.util.concurrent.atomic.AtomicInteger;

public class Testing {
    public static void main(String[] args) {
        System.out.println(numbers("10"));
    }

    private static int numbers(String s) {
        var strArray = s.split("");
        var endPointer = strArray.length - 1;
        var count = 0;
        while (endPointer >= 0 && !(endPointer == 0 && strArray[0].equals("1"))) {
            if (strArray[endPointer].equalsIgnoreCase("0")) {
                endPointer--;
                count++;
            } else {
                var current = endPointer;
                while (current >= 0 && strArray[current].equalsIgnoreCase("1")) {
                    strArray[current--] = "0";
                    endPointer--;
                    count++;
                }
                count++;
                if (current < 0) {
                    break;
                } else {
                    strArray[current] = "1";
                }
            }
        }
        return count;
    }

    private static int numbersOld(String s) {
        var charArray = s.split("");
        var actualNumber = 0;
        var power = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            actualNumber += (Integer.valueOf(charArray[i])) * Math.pow(2, power++);
        }
        AtomicInteger count = new AtomicInteger();
        caculateSteps(actualNumber, count);
        return count.get();
    }

    //    public static int equalSubstringNew(String s, String t, int maxCost) {
    //        var schar = s.toCharArray();
    //        var tchar = t.toCharArray();
    //        var scharLength = schar.length;
    //        int result = 0;
    //        var prefixSumArray = new int[scharLength];
    //        for (int i = 0; i < scharLength; i++) {
    //            prefixSumArray[i] = Math.abs(schar[i] - tchar[i]);
    //        }
    //        for (int i = 1; i < scharLength; i++) {
    //            prefixSumArray[i] += prefixSumArray[i - 1];
    //        }
    //        var count = 0;
    //        for (int i = 0; i < scharLength; i++) {
    //            if (i > 0) {
    //                count = prefixSumArray[i - 1];
    //            }
    //            for (int j = i; j < scharLength; j++) {
    //                if (prefixSumArray[j] - count > maxCost) {
    //                    result = Math.max(result, j - 1 - i);
    //                    break;
    //                }
    //            }
    //
    //        }
    //    }

    public static int equalSubstring(String s, String t, int maxCost) {
        var schar = s.toCharArray();
        var tchar = t.toCharArray();
        var result = 0;
        for (int i = 0; i < schar.length; i++) {
            var current = 0;
            var currentResult = 0;
            for (int j = i; j < schar.length; j++) {
                var count = Math.abs(schar[j] - tchar[j]);
                if (count + current <= maxCost) {
                    current += count;
                    currentResult++;
                } else {
                    break;
                }
            }
            if (currentResult > result) {
                result = currentResult;
            }
        }
        return result;
    }

    private static void caculateSteps(long actualNumber, AtomicInteger count) {
        if (actualNumber == 1) {
            return;
        } else if (actualNumber % 2 == 0) {
            count.incrementAndGet();
            caculateSteps(actualNumber / 2, count);
        } else {
            count.incrementAndGet();
            caculateSteps(actualNumber + 1, count);
        }
    }

    @Override public int hashCode() {
        return super.hashCode();
    }

    @Override public String toString() {
        return super.toString();
    }
}
