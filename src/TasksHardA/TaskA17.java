package TasksHardA;

public class TaskA17 {
    public static void main(String[] args) {
        TaskA17 taskA17 = new TaskA17();
        taskA17.numberToWorld(122);
    }

    public void numberToWorld(int number) {

        if ((number % 2 == 0) && (number < 10 && number > 0)) {
            System.out.println("even single digit number");
        } else if ((number % 2 != 0) && (number < 10 && number > 0)) {
            System.out.println("odd single digit number");
        } else if ((number % 2 == 0) && (number >= 10 && number < 100)) {
            System.out.println("even two-digit number");
        } else if ((number % 2 != 0) && (number >= 10 && number < 100 )) {
            System.out.println("odd two-digit number");
        } else if ((number % 2 == 0) && (number >= 100 && number < 1000)) {
            System.out.println("even three-digit number");
        }else {
            System.out.println("odd three-digit number");
        }
    }
}
