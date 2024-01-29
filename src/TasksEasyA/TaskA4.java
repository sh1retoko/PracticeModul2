package TasksEasyA;

public class TaskA4 {
    public static void main(String[] args) {
        TaskA4 taskA4 = new TaskA4();
        taskA4.findQuarter(5, -5);
    }

    public void findQuarter(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("1");
        } else if (x < 0 && y > 0) {
            System.out.println("2");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        }else {
            System.out.println("4");
        }
    }
}
