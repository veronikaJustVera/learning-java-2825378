package src;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inputtedNum = getNumber();
        while (inputtedNum < 1 || inputtedNum > 10) {
            inputtedNum = getNumber();
        }

        if (inputtedNum > 5) {
            System.out.println("Less or equals 5");
        } else {
            System.out.println("More than 5");
        }
    }

    public static int getNumber() {
        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);

        int inputtedNum = scanner.nextInt();
        return inputtedNum;
    }
}
