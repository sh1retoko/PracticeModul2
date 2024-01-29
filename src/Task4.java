import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Игра угадай число!");

        while (true){

            System.out.print("\nУкажите число попыток: ");
            int attempt = scanner.nextInt();

            System.out.print("Укажите нижний предел: ");
            int bottom = scanner.nextInt();

            System.out.print("Укажите верхний предел: ");
            int top = scanner.nextInt();

            int randomNum = random.nextInt(bottom, top) + 1;

            for (int i = 0; i <= attempt; i++) {

                boolean status;

                System.out.print("\nВведите число: ");
                int num = scanner.nextInt();

                if (randomNum == num) {
                    System.out.println("Вы выиграли!");
                    break;
                } else if (randomNum > num) {
                    System.out.println("Загаданное число больше чем указанное");
                    status = false;
                } else {
                    System.out.println("Загаданное число меньше чем указанное");
                    status = false;
                }

                if (status == false){
                    System.out.println("\nВы проиграли!");
                    System.out.println("Загаданное число: " + randomNum);
                    break;
                }
            }
        }
    }
}
