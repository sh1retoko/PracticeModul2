package TasksEasyA;

public class TaskA10 {
    public static void main(String[] args) {
        TaskA10 taskA10 = new TaskA10();
        taskA10.checkTriangle(10,10,20);
    }

    public void checkTriangle(int a, int b, int c) {
        if ((a < b + c) && (b < c + a) && (c < a + b)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
