package TasksMiddleA;

public class TaskA11 {
    public static void main(String[] args) {
        TaskA11 taskA11 = new TaskA11();
        taskA11.print(2,4);
    }

    public void print(int m, int n) {
        for (int row = 0; row < m; row++) {
            String s = "";

            for (int col = 0; col < n; col++) {
                s += "8";
            }

            System.out.println(s);
        }
    }
}
