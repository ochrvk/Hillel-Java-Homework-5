package chrvk.javaelementary.hw5.task1;

public class Main {
    public static boolean isBack(String move, int[] robotPosition) {
        int[] tmp = new int[robotPosition.length];
        int result = 0;

        for (int i = 0; i < robotPosition.length; i++) {
            tmp[i] = robotPosition[i];
        }

        for (int i = 0; i < move.length(); i++) {
            if (move.charAt(i) == 'U') {
                robotPosition[0] += 1;
            } else if (move.charAt(i) == 'D') {
                robotPosition[0] -= 1;
            } else if (move.charAt(i) == 'R') {
                robotPosition[1] += 1;
            } else if (move.charAt(i) == 'L') {
                robotPosition[1] -= 1;
            }
        }

        for (int i = 0; i < robotPosition.length; i++) {
            if (tmp[i] != robotPosition[i]) {
                result++;
            }
        }

        return result == 0;
    }

    public static void main(String[] args) {
        int[] robotPosition = new int[]{0, 0};
        String move = "UUDLDR";
        System.out.println(isBack(move, robotPosition));
    }
}