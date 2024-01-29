package TasksMiddleA;

public class TaskA16 {
    public static void main(String[] args) {
        TaskA16 taskA16 = new TaskA16();
        taskA16.signal(58);
    }

    public void signal(double time) {
        time %= 5;

        if (time >= 0 && time < 3){
            System.out.println("green");
        } else if (time >= 3 && time < 4) {
            System.out.println("yellow");
        }else {
            System.out.println("red");
        }
    }
}
