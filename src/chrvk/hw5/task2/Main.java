package chrvk.hw5.task2;

//Написать метод который проверяет число простое или нет. Если нет вывести все его делители.

import java.util.Random;

public class Main {
    public static String simpleDetected(int number) {
        String result = "";
        int tmp = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                tmp++;
            }
        }

        if (tmp == 0) {
            result = "number is simple";
        } else {
            result += 1;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    result = result + " " + i;
                }
            }
            result = result + " " + number;
        }
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int number = Math.abs(random.nextInt());
        System.out.println(number);
        System.out.println(simpleDetected(number));
    }
}