package TasksEasyA;

public class TaskA6 {
    public static void main(String[] args) {
        TaskA6 taskA6 = new TaskA6();
        taskA6.numbers(5,5,5);
    }
    public void numbers(int a, int b, int c) {

        int positive = 0, negative = 0, zero = 0;

        if (a > 0) positive++;
        else if (a < 0) negative++;
        else zero++;

        if (b > 0) positive++;
        else if (b < 0) negative++;
        else zero++;

        if (c > 0) positive++;
        else if (c < 0) negative++;
        else zero++;

        System.out.println(positive + " positive, " + negative + " negative, " + zero + " equal 0");
    }
}
