package src;
import java.util.Scanner;

public class Main {

    public static void announceDeveloperTeaTime() {
        System.out.println("announceDeveloperTeaTime executing...");
        System.out.println("Type a random input to break.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("announceDeveloperTeaTime execution stopped");
    }

    public static void main(String[] args) {
        announceDeveloperTeaTime();
    }

}
