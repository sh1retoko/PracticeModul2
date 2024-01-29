public class Task7 {
    public static void main(String[] args) {
        perimeterTriangle(5, 3, 2);
        perimeterSquare(5);
        perimeterCircle(5);
    }

    public static void perimeterTriangle(int A, int B, int C) {
        int result = A + B + C;
        System.out.println("Perimeter triangle = " + result);
    }

    public static void perimeterSquare(int length) {
        int result = 4 * length;
        System.out.println("Perimeter square = " + result);
    }

    public static void perimeterCircle(int radius) {
        double PI = 3.14159;
        double result = 2 * PI * radius;
        System.out.println("Perimeter circle = " + result);
    }
}
