package ru.geekbrains.lesson1;

public class EleventhTask {

    public static void main(String[]args) {
        int [] NewArray = {2, 2, 2, 2, 10, -2};
        System.out.println(checkBalance(NewArray));
    }

    private static boolean checkBalance(int [] arr) {
        int leftSum, rightSum;
        for (int i = 1; i < arr.length; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) return true;
        }
        return false;
    }
}
