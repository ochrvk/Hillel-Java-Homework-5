package chrvk.javaelementary.hw5.task4;

public class Main {
    private static void permutation(String input, String sofar) {
        if (input.equals("")) {
            System.out.println(" " + sofar);
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (input.indexOf(c, i + 1) != -1)
                continue;
            permutation(input.substring(0, i) + input.substring(i + 1), sofar + c);
        }
    }

    public static void main(String[] args) {
        permutation("abc", "");
    }
}