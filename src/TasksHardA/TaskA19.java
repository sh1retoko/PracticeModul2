package TasksHardA;

public class TaskA19 {
    public static void main(String[] args) {
        TaskA19 taskA19 = new TaskA19();
        taskA19.table(5);
    }

    public void table(int n) {
        for (int row = 1; row < n + 1; row++) {
            for (int col = 1; col < n + 1; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i < n + 1; i++) {
            System.out.println(i + " * " + n + " = " + i * n);
        }
    }
}
