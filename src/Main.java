import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int height = new Scanner(System.in).nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= consoleYtoX(height - i) / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= consoleYtoX(i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double consoleYtoX(double h) {
        return h * 2.6 * Math.sqrt(2);
    }
}