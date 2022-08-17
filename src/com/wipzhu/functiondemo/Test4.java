package com.wipzhu.functiondemo;

public class Test4 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int from = 3;
        int to = 17;

        int[] copyArr = copyArrOfRange(arr, from, to);
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i] + " ");
        }
    }

    public static int[] copyArrOfRange(int[] arr, int from, int to) {
//         maxTo = to;
        int maxTo = Math.max((arr.length - 1), to);
        int minFrom = Math.min(from, 0);

        int[] copyArr = new int[maxTo - minFrom];
        int index = 0;
        for (int i = from; i < to; i++) {
            if (index > (maxTo - minFrom)) {
                break;
            }
            copyArr[index] = arr[i];
            index++;
        }

        return copyArr;
    }
}
