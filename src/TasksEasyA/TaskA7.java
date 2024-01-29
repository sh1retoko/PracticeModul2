package TasksEasyA;

public class TaskA7 {
    public static void main(String[] args) {
        TaskA7 taskA7 = new TaskA7();
        taskA7.print("Hello", 5);
    }

    public void print(String string, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }
}
