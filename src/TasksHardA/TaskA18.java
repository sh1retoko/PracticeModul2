package TasksHardA;

public class TaskA18 {
    public static void main(String[] args) {
        TaskA18 taskA18 = new TaskA18();
        taskA18.syracuseSequence(20);
    }

    public void syracuseSequence(int number) {
        int k = 0;
        String numbers = number + " -> ";

        while (number != 1) {

            if (number % 2 == 0) {
                number /= 2;

            }else {
                number = number * 3 + 1;
            }

            if (number != 1) {
                numbers+= number + " -> ";

            }else {
                numbers += number + "";
                k++;
            }
        }

        System.out.println(k);
        System.out.println(numbers);
    }
}
