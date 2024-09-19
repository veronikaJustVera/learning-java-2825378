package src;

public class Main {

    public static void main(String[] args) {
        Triangle triangleA = new Triangle(15, 8, 15, 12, 8);
        Triangle triangleB = new Triangle(3, 2.598, 3, 3, 3);

        double triangleAArea = triangleA.findArea(),
               triangleBArea = triangleB.findArea();
    }

}
