package TasksMiddleA;

public class TaskA13 {
    public static void main(String[] args) {
        TaskA13 taskA13 = new TaskA13();
        taskA13.cube(5); //4 = 81
    }

    public void cube(int n) {
        /*int res;

        for (int i = 0; i <= n; i++) {
            res = (int) Math.pow(3, i);
            System.out.println("The cube of " + i + " is equal to " + res);
        }*/

        if (n >= 0) {
            for (int i = 0; i <= n; i++) {
                System.out.println("The cube of " + i + " is equal to " + i * i * i);
            }
        }
    }
}
