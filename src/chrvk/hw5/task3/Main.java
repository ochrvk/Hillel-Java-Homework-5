package chrvk.hw5.task3;
/*
Написать метод. Входящие параметры: отсортированный массив и число.
Метод должен вернуть true если это число есть в массиве, используя бинарный поиск.
*/

public class Main {
    public static boolean binarySearch(int[] sortedArray, int value) {
        boolean result = false;
        int first = sortedArray[0];
        int last = sortedArray.length - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (sortedArray[mid] < value) {
                first = mid + 1;
            } else if (sortedArray[mid] > value) {
                last = mid - 1;
            } else if (sortedArray[mid] == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arraySize = 30;
        int value = 17;
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(binarySearch(array, 17));
    }
}