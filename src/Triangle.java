package src;

public class Triangle {
    double base;
    double height;
    double sideOneLength;
    double sideTwoLength;
    double sideThreeLength;

    public Triangle(
        double base,
        double height,
        double sideOneLength,
        double sideTwoLength,
        double sideThreeLength
    ) {
        this.base = base;
        this.height = height;
        this.sideOneLength = sideOneLength;
        this.sideTwoLength = sideTwoLength;
        this.sideThreeLength = sideThreeLength;
    }

    public double findArea() {
        return this.base * this.height / 2;
    }
}
