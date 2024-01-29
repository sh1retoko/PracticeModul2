package TasksEasyA;

public class TaskA3 {
    public static void main(String[] args) {
        TaskA3 taskA3 = new TaskA3();
        taskA3.max(5,10,15,20);
    }

    public void max(int a, int b, int c, int d) {
        int max1 = Math.max(a, b);
        int max2 = Math.max(c, d);
        int result = Math.max(max1, max2);

        System.out.println(result);
    }
}
