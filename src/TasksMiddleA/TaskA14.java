package TasksMiddleA;

public class TaskA14 {
    public static void main(String[] args) {
        TaskA14 taskA14 = new TaskA14();
        taskA14.findFactorial(5); // 5! = 1 * 2 * 3 * 4 * 5 = 120
    }

    public void findFactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        System.out.println(result);
    }
}
