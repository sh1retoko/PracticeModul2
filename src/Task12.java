public class Task12 {
    public static void main(String[] args) {
        int a = 10;

        while (a > 0) {
            a--;

            if (a == 5) {
                break;
            }
        }

        int sum = 0;

        for (int i = 0; i < 50; i++) {
            if (i == 45) {
                continue;
            }

            sum += i;
        }

        switch (sum) {
            case 50:
                System.out.println("50");
                break;
            case 1180:
                System.out.println("1180");
                break;
            case 1225:
                System.out.println("1225");
                break;
            default:
                System.out.println("Результат неверный");
        }

        if (a == 5 && sum == 1180) {
            System.out.println("Условие выполнено");
        } else {
            System.out.println("Условие не выполнено");
        }
    }
}
