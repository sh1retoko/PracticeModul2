import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Программа сравнения значений y=sin(cos(x)) и y=cos(sin(x)");

        System.out.print("Введите нижнее значение x: ");
        double x_down = scanner.nextDouble();

        System.out.print("Введите верхнее значение x: ");
        double x_up = scanner.nextDouble();

        System.out.print("Введите шаг дискретизации: ");
        double step = scanner.nextDouble();

        double i = x_down;

        do {
            if (Math.sin(Math.cos(i)) < Math.cos(Math.sin(i))) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) меньше, чем cos(sin(x))");
            } else if (Math.sin(Math.cos(i)) > Math.cos(Math.sin(i))) {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) больше, чем cos(sin(x))");
            } else {
                System.out.println("При x = " + i + " sin(cos(x)) = " + Math.sin(Math.cos(i)) + "; cos(sin(x)) = " + Math.cos(Math.sin(i)) + ". sin(cos(x)) равен cos(sin(x))");
            }
            i += step;
        }

        while (i <= x_up);
    }
}
