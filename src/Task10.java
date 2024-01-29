import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age >= 14 && age < 18){
            System.out.println("От 14 до 18: прокол ушей, пупка, языка, носа в присутствии родителей");
        } else if (age >= 18) {
            System.out.println("От 18 лет: без ограничений");
        }else {
            System.out.println("Младше 14: прокол ушей в присутствии родителей");
        }
    }
}
